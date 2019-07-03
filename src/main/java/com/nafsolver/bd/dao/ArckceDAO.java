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
public interface ArckceDAO extends JpaRepository<Arckce, ArckceId> {

    @Query("FROM Arckce where no_cia = :no_cia and no_secuencia = :no_secuencia")
    List<Arckce> findByNoSecuencia(@Param("no_cia") String noCia, @Param("no_secuencia") Integer noDocu);

    @Query("FROM Arckce where no_secuencia = :no_secuencia")
    List<Arckce> findByNoSecuencia(@Param("no_secuencia") Integer noDocu);

    @Query("FROM Arckce where cheque = :cheque and no_secuencia = :no_secuencia")
    List<Arckce> findByNoSecCheq(@Param("cheque") Integer cheque, @Param("no_secuencia") Integer noDocu);

    @Query("FROM Arckce where cheque = :cheque")
    List<Arckce> findByNoCheque(@Param("cheque") Integer cheque);

    @Query("FROM Arckce where no_cia = :no_cia")
    List<Arckce> findByNoCia(@Param("no_cia") String noCia);

    @Query("FROM Arckce where no_cia = :no_cia and tipo_doc = :tipo_doc")
    List<Arckce> findByTipoDoc(@Param("no_cia") String noCia, @Param("tipo_doc") String tipoDocu);

    @Query("FROM Arckce where no_cia = :no_cia and no_cta = :no_cta")
    List<Arckce> findByCta(@Param("no_cia") String noCia, @Param("no_cta") String noCta);

    @Query("FROM Arckce where no_cta = :no_cta")
    List<Arckce> findByCta(@Param("no_cta") String noCta);

    @Query("FROM Arckce "
            + "WHERE (:no_cia is null OR :no_cia = '' OR no_cia = :no_cia) "
            + "AND (:seq = 0 OR no_secuencia = :seq) "
            + "AND (:no_cta is null OR :no_cta = '' OR no_cta = :no_cta) "
            + "AND (:tipo is null OR :tipo = '' OR tipo_docu = :tipo) "
            + "AND (:cheq = 0 OR cheque = :cheq)")
    List<Arckce> findByCriteria(@Param("no_cia") String noCia, @Param("seq") Integer noDocu, 
            @Param("no_cta") String noCta, @Param("cheq") Integer cheque, @Param("tipo") String tipoDocu);
}
