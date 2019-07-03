/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.dao;

import com.nafsolver.entity.Arckmc;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ArckmcDAO extends JpaRepository<Arckmc, String>{
    
    @Query("FROM Arckmc where no_cia = :no_cia")
    List<Arckmc> findByNoCia(@Param("no_cia") String noCia);
}
