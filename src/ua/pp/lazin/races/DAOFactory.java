package ua.pp.lazin.races;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Laz on 26.08.2016.
 */
public class DAOFactory {

    private static DAOFactory instance;

    //private DataSource ds;
    private DAOFactory() {
        //need to create connection pool
    }

    ;

    public GamblerDAOPostgres getGamblerDAO() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://192.168.3.99/races", "postgres", "asdfghjkl");
        return new GamblerDAOPostgres(con);
    }

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }
}



