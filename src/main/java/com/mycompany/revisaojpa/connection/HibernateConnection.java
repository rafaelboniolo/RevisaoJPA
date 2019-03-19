package com.mycompany.revisaojpa.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;

/**
 * HibernateConnection
 */
public class HibernateConnection {

    private static EntityManagerFactory entityManagerFactory;
    private static String DATABASE_NAME = "jpa";
    
    public static EntityManager getEntityManager(){
        try {
            if(entityManagerFactory == null || !entityManagerFactory.isOpen())
                entityManagerFactory = Persistence.createEntityManagerFactory(DATABASE_NAME);    
        } catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("Problemas na conexão Hibernate");
            return null;
        }
        
        return entityManagerFactory.createEntityManager();
    }

    public static void close(){
        entityManagerFactory.close();
        
    }
}