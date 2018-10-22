package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtil
{
    private static final SessionFactory sessionFactory;

    static
    {
        try
        {
        	 Configuration config = new Configuration();
 			//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build(); ESTABA EN EL DE LOS CHICOS

        	 /*
        	  * Agregar todas las entities como: 
        	  * config.addAnnotatedClass(nombre_Entity.class);
        	  * 
        	  * 
        	  * 
        	  * 
        	  * 
        	  */
             sessionFactory = config.buildSessionFactory(/*serviceRegistry*/);
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}