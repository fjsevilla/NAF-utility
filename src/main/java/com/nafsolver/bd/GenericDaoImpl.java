/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Admin
 */
public class GenericDaoImpl<T, K extends Serializable> implements GenericDAO<T, K> {

    private Class<T> clazz;
    
    @Autowired
    SessionFactory sessionFactory;
  
    public void setClazz(Class< T > clazzToSet){
       this.clazz = clazzToSet;
    }
  
    public T findOne(K id){
      return (T) getCurrentSession().get(clazz, id);
    }
 
    public List findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }
 
    @Override
    public T create(T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }
 
    public T update(T entity) {
        return (T) getCurrentSession().merge(entity);
    }
 
    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }
 
    public void deleteById(K entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }
 
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
