/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.dao;

import com.nafsolver.bd.GenericDAO;
import com.nafsolver.entity.Arccmc;
import com.nafsolver.entity.ArccmcId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ArccmcDAO extends JpaRepository<Arccmc, ArccmcId>{
    
}
