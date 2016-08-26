package ua.pp.lazin.races.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;

public class HibernateTest {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sf = null;
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure(new File("hibernate.cfg.xml")).build();
        try {
            sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session s = sf.openSession();
            s.beginTransaction();
            Gambler t = new Gambler();
            t.setLogin("Byl Byl Ogly");
            t.setPassword("123");
            s.save(t);
            s.getTransaction().commit();
            s.close();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            ex.printStackTrace();
        } finally {
            sf.close();
        }

    }

}

