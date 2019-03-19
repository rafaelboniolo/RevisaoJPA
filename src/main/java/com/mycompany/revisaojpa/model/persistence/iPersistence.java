package com.mycompany.revisaojpa.model.persistence;

import java.util.List;

import org.hibernate.HibernateException;

@SuppressWarnings("rawtypes")
public interface iPersistence {
    Boolean insert(Object object) throws HibernateException;
    Boolean update(Object object) throws HibernateException;
    Boolean remove(Object object) throws HibernateException;
    Object findOne(Class clazz, Long id) throws HibernateException;
    List<Object> findAll(Class clazz) throws HibernateException;
    
    
}