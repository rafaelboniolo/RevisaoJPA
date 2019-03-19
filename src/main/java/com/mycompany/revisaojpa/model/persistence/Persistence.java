package com.mycompany.revisaojpa.model.persistence;

import com.mycompany.revisaojpa.connection.HibernateConnection;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.HibernateException;


/**
 * Persistence
 author: Rafael Boniolo 20/12/2018
 */

@SuppressWarnings({"rawtypes", "unchecked"})

public class Persistence<T> {//implements iPersistence {

    
    public static String insert(Object object) {
        
        
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            entity.getTransaction().begin();
            entity.persist(object);
            entity.flush();
            entity.getTransaction().commit();
            entity.close();    
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        
        return "";
    }

    public static Boolean update(Object object) {
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            entity.getTransaction().begin();
            entity.persist(object);
            entity.getTransaction().commit();
            entity.close();    
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static Boolean remove(Object object) {
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            entity.getTransaction().begin();
            entity.remove(entity);
            entity.getTransaction().commit();
            entity.close();    
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true; 
    }

    public static List<Object> findAll(Class clazz) {
        
        List<Object> objects = new ArrayList<>();
        
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            String jpql = " select e from "+clazz.getTypeName()+" e";
            Query query = entity.createQuery(jpql);
            
            objects = query.getResultList();
            
            entity.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }
  
        return objects;
    }
    
    public static List<Object> findAll(Class clazz, String where) {
        
        List<Object> objects = new ArrayList<>();
        
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            String jpql = " select e from "+clazz.getTypeName()+" e where 1=1 "+where;
            System.out.println(jpql);
            Query query = entity.createQuery(jpql);
            objects = query.getResultList();
            
//            entity.close();    ;
        } catch (Exception e) {
            e.printStackTrace();
        }
  
        return objects;
    }

    public static Object findOne(Class clazz, Long id) throws HibernateException {
        EntityManager entity = HibernateConnection.getEntityManager();
        Object object = (Object) entity.find(clazz, id);
        //entity.close();
        
        try {
            return clazz.cast(object);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problemas no cast automatico do FindOne");
        }
        return null;
    }
    
    public static List<Object> loadUserByUsername(String email) throws HibernateException {
        try {
            EntityManager entity = HibernateConnection.getEntityManager();
            String jpql = " select e from tb_user e where e.email = '"+email+"'";
            Query query = entity.createQuery(jpql);
            
            List<Object> object = query.getResultList();
            
            entity.close();
            return object;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
  
        return null;
    }
    

  

}