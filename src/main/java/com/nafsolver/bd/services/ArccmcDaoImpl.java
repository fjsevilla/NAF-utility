/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.services;

import com.nafsolver.bd.dao.ArccmcDAO;
import com.nafsolver.entity.Arccmc;
import com.nafsolver.entity.ArccmcId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
//@Repository
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service
public class ArccmcDaoImpl{// extends GenericDaoImpl<Arccmc, ArccmcId> implements ArccmcDAO{
    
    @Autowired
    private ArccmcDAO dao;
    /*
    public Arccmc getById(String noCia, String noCliente){
        return dao.findById(new ArccmcId(noCia, "01", noCliente)).get();
    } 
    */
    public String getById(String noCia, String noCliente){
        Arccmc mc =  dao.findById(new ArccmcId(noCia, "01", noCliente)).get();
        return mc.getNombre()+" Direccion: "+ mc.getDireccion();
    } 
    
}
