/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface GenericDAO<T, PK extends Serializable> {

   T findOne(final PK id);
 
   List<T> findAll();
 
   T create(final T entity);
 
   T update(final T entity);
 
   void delete(final T entity);
 
   void deleteById(final PK entityId);
}
