package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arinha generated by hbm2java
 */
@Entity
@Table(name="ARINHA"
    ,schema="DESA46"
)
public class Arinha  implements java.io.Serializable {


     private ArinhaId id;
     private BigDecimal ultCosto;
     private BigDecimal saldoUn;
     private BigDecimal saldoMo;
     private BigDecimal costoUni;
     private BigDecimal ajuIniReproceso;
     private BigDecimal ultCostoRes;
     private BigDecimal saldoMoRes;
     private BigDecimal costoUniRes;

    public Arinha() {
    }

	
    public Arinha(ArinhaId id) {
        this.id = id;
    }
    public Arinha(ArinhaId id, BigDecimal ultCosto, BigDecimal saldoUn, BigDecimal saldoMo, BigDecimal costoUni, BigDecimal ajuIniReproceso, BigDecimal ultCostoRes, BigDecimal saldoMoRes, BigDecimal costoUniRes) {
       this.id = id;
       this.ultCosto = ultCosto;
       this.saldoUn = saldoUn;
       this.saldoMo = saldoMo;
       this.costoUni = costoUni;
       this.ajuIniReproceso = ajuIniReproceso;
       this.ultCostoRes = ultCostoRes;
       this.saldoMoRes = saldoMoRes;
       this.costoUniRes = costoUniRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="centro", column=@Column(name="CENTRO", nullable=false, length=2) ), 
        @AttributeOverride(name="ano", column=@Column(name="ANO", nullable=false, precision=4, scale=0) ), 
        @AttributeOverride(name="semana", column=@Column(name="SEMANA", nullable=false, precision=2, scale=0) ), 
        @AttributeOverride(name="indSem", column=@Column(name="IND_SEM", nullable=false, length=1) ), 
        @AttributeOverride(name="bodega", column=@Column(name="BODEGA", nullable=false, length=4) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="noArti", column=@Column(name="NO_ARTI", nullable=false, length=30) ) } )
    public ArinhaId getId() {
        return this.id;
    }
    
    public void setId(ArinhaId id) {
        this.id = id;
    }

    
    @Column(name="ULT_COSTO", precision=22, scale=6)
    public BigDecimal getUltCosto() {
        return this.ultCosto;
    }
    
    public void setUltCosto(BigDecimal ultCosto) {
        this.ultCosto = ultCosto;
    }

    
    @Column(name="SALDO_UN", precision=17)
    public BigDecimal getSaldoUn() {
        return this.saldoUn;
    }
    
    public void setSaldoUn(BigDecimal saldoUn) {
        this.saldoUn = saldoUn;
    }

    
    @Column(name="SALDO_MO", precision=22)
    public BigDecimal getSaldoMo() {
        return this.saldoMo;
    }
    
    public void setSaldoMo(BigDecimal saldoMo) {
        this.saldoMo = saldoMo;
    }

    
    @Column(name="COSTO_UNI", precision=22, scale=6)
    public BigDecimal getCostoUni() {
        return this.costoUni;
    }
    
    public void setCostoUni(BigDecimal costoUni) {
        this.costoUni = costoUni;
    }

    
    @Column(name="AJU_INI_REPROCESO", precision=22)
    public BigDecimal getAjuIniReproceso() {
        return this.ajuIniReproceso;
    }
    
    public void setAjuIniReproceso(BigDecimal ajuIniReproceso) {
        this.ajuIniReproceso = ajuIniReproceso;
    }

    
    @Column(name="ULT_COSTO_RES", precision=30, scale=6)
    public BigDecimal getUltCostoRes() {
        return this.ultCostoRes;
    }
    
    public void setUltCostoRes(BigDecimal ultCostoRes) {
        this.ultCostoRes = ultCostoRes;
    }

    
    @Column(name="SALDO_MO_RES", precision=30)
    public BigDecimal getSaldoMoRes() {
        return this.saldoMoRes;
    }
    
    public void setSaldoMoRes(BigDecimal saldoMoRes) {
        this.saldoMoRes = saldoMoRes;
    }

    
    @Column(name="COSTO_UNI_RES", precision=30, scale=6)
    public BigDecimal getCostoUniRes() {
        return this.costoUniRes;
    }
    
    public void setCostoUniRes(BigDecimal costoUniRes) {
        this.costoUniRes = costoUniRes;
    }




}


