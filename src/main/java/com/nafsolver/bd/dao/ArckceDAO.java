/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd.dao;

import com.nafsolver.entity.Arckce;
import com.nafsolver.entity.ArckceId;
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
public interface ArckceDAO extends JpaRepository<Arckce, ArckceId>{
    
    @Query("select * from arckce where no_cia = :no_cia and no_secuencia = :no_secuencia")
    List<Arckce> findByNoSecuencia(@Param("no_cia") String noCia, @Param("no_secuencia") String noDocu);
    
    
    @Query("select * from arckce where no_cia = :no_cia")
    List<Arckce> findByNoCia(@Param("no_cia") String noCia);
    
    
    @Query("select * from arckce where no_cia = :no_cia and tipo_doc = :tipo_doc")
    List<Arckce> findByTipoDoc(@Param("no_cia") String noCia, @Param("tipo_doc") String noDocu);
}
