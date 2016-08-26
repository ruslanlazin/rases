package ua.pp.lazin.races.DAO;

import java.sql.*;

/**
 * Created by Laz on 26.08.2016.
 */
public class GamblerDAOPostgres implements GamblerDAO {

    //private DataSource dataPool;
    private Connection con;

    public GamblerDAOPostgres(Connection con) {
        this.con = con;
    }

    public void close() throws SQLException {
        this.con.close();
    }

    public Gambler getGamblerById(int id) throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM Gamblers "
                + "WHERE id = ?");
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        Gambler t = null;
        if (rs.next()) {
            t = new Gambler();
            t.setGamblerId(rs.getInt(1));
            t.setLogin(rs.getString(2));
        }
        return t;
    }
    public void addGambler(Gambler gambler) throws SQLException {
        Statement st = con.createStatement();
        st.execute("INSERT into Gamblers(login, password, balance) VALUES ('vas', 'pas',10)");
        st.close();
    }
}
