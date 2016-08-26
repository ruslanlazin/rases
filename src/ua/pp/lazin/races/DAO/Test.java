package ua.pp.lazin.races.DAO;

import java.sql.SQLException;

/**
 * Created by Laz on 26.08.2016.
 */
public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DAOFactory.getInstance().getGamblerDAO().addGambler(new Gambler());
        Gambler vasja = DAOFactory.getInstance().getGamblerDAO().getGamblerById(1);
        System.out.println(vasja.getLogin());
    }


}
