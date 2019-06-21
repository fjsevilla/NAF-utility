/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.services;

import com.nafsolver.bd.dao.ArckceDAO;
import com.nafsolver.entity.Arckce;
import com.nafsolver.entity.ArckceId;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Repository
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service
public class ArckceDaoImpl{// extends GenericDaoImpl<Arccmc, ArccmcId> implements ArccmcDAO{
    
    @Autowired
    private ArckceDAO dao;
    
    public Arckce getById(String noCia, String noDocu, int noSecuencia){
        return dao.findById(new ArckceId(noCia, noDocu, noSecuencia)).get();
    } 
      
}
