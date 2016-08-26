package ua.pp.lazin.races.DAO;

/**
 * Created by Laz on 26.08.2016.
 */
public interface GamblerDAO {

    public void close() throws Exception;

    public Gambler getGamblerById(int id) throws Exception;
}


