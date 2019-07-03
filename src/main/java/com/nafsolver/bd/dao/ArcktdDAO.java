/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.dao;


import com.nafsolver.entity.Arcktd;
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
public interface ArcktdDAO extends JpaRepository<Arcktd, String>{
    
    @Query("FROM Arcktd where no_cia = :no_cia")
    List<Arcktd> findByNoCia(@Param("no_cia") String noCia);
}
