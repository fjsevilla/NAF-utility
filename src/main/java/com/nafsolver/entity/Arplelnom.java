package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Arplelnom generated by hbm2java
 */
@Entity
@Table(name="ARPLELNOM"
    ,schema="DESA46"
)
public class Arplelnom  implements java.io.Serializable {


     private ArplelnomId id;
     private String mes;
     private String ano;
     private Date fecha;
     private Date fechIniPer;
     private Date fechFinPer;
     private BigDecimal totAsig;
     private BigDecimal totDedu;
     private BigDecimal totGen;
     private String observ;
     private Date fechAct;
     private String userAct;

    public Arplelnom() {
    }

	
    public Arplelnom(ArplelnomId id) {
        this.id = id;
    }
    public Arplelnom(ArplelnomId id, String mes, String ano, Date fecha, Date fechIniPer, Date fechFinPer, BigDecimal totAsig, BigDecimal totDedu, BigDecimal totGen, String observ, Date fechAct, String userAct) {
       this.id = id;
       this.mes = mes;
       this.ano = ano;
       this.fecha = fecha;
       this.fechIniPer = fechIniPer;
       this.fechFinPer = fechFinPer;
       this.totAsig = totAsig;
       this.totDedu = totDedu;
       this.totGen = totGen;
       this.observ = observ;
       this.fechAct = fechAct;
       this.userAct = userAct;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noElnom", column=@Column(name="NO_ELNOM", nullable=false, length=10) ), 
        @AttributeOverride(name="codpla", column=@Column(name="CODPLA", nullable=false, length=2) ), 
        @AttributeOverride(name="tipoEmp", column=@Column(name="TIPO_EMP", nullable=false, length=2) ), 
        @AttributeOverride(name="noEmple", column=@Column(name="NO_EMPLE", nullable=false, length=10) ) } )
    public ArplelnomId getId() {
        return this.id;
    }
    
    public void setId(ArplelnomId id) {
        this.id = id;
    }

    
    @Column(name="MES", length=2)
    public String getMes() {
        return this.mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }

    
    @Column(name="ANO", length=4)
    public String getAno() {
        return this.ano;
    }
    
    public void setAno(String ano) {
        this.ano = ano;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECH_INI_PER", length=7)
    public Date getFechIniPer() {
        return this.fechIniPer;
    }
    
    public void setFechIniPer(Date fechIniPer) {
        this.fechIniPer = fechIniPer;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECH_FIN_PER", length=7)
    public Date getFechFinPer() {
        return this.fechFinPer;
    }
    
    public void setFechFinPer(Date fechFinPer) {
        this.fechFinPer = fechFinPer;
    }

    
    @Column(name="TOT_ASIG", precision=12)
    public BigDecimal getTotAsig() {
        return this.totAsig;
    }
    
    public void setTotAsig(BigDecimal totAsig) {
        this.totAsig = totAsig;
    }

    
    @Column(name="TOT_DEDU", precision=12)
    public BigDecimal getTotDedu() {
        return this.totDedu;
    }
    
    public void setTotDedu(BigDecimal totDedu) {
        this.totDedu = totDedu;
    }

    
    @Column(name="TOT_GEN", precision=12)
    public BigDecimal getTotGen() {
        return this.totGen;
    }
    
    public void setTotGen(BigDecimal totGen) {
        this.totGen = totGen;
    }

    
    @Column(name="OBSERV", length=300)
    public String getObserv() {
        return this.observ;
    }
    
    public void setObserv(String observ) {
        this.observ = observ;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECH_ACT", length=7)
    public Date getFechAct() {
        return this.fechAct;
    }
    
    public void setFechAct(Date fechAct) {
        this.fechAct = fechAct;
    }

    
    @Column(name="USER_ACT", length=30)
    public String getUserAct() {
        return this.userAct;
    }
    
    public void setUserAct(String userAct) {
        this.userAct = userAct;
    }




}


