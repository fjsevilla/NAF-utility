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
 * Arckrd generated by hbm2java
 */
@Entity
@Table(name="ARCKRD"
    ,schema="DESA46"
)
public class Arckrd  implements java.io.Serializable {


     private ArckrdId id;
     private String tipoDocu;
     private String tipoRefe;
     private String noProve;
     private BigDecimal monto;
     private BigDecimal descuentoPp;
     private BigDecimal montoNominal;
     private String status;
     private BigDecimal difCambiario;
     private String bcoProve;
     private String ctaBcoProve;
     private BigDecimal montoRes;
     private BigDecimal descuentoPpRes;
     private BigDecimal montoNominalRes;

    public Arckrd() {
    }

	
    public Arckrd(ArckrdId id) {
        this.id = id;
    }
    public Arckrd(ArckrdId id, String tipoDocu, String tipoRefe, String noProve, BigDecimal monto, BigDecimal descuentoPp, BigDecimal montoNominal, String status, BigDecimal difCambiario, String bcoProve, String ctaBcoProve, BigDecimal montoRes, BigDecimal descuentoPpRes, BigDecimal montoNominalRes) {
       this.id = id;
       this.tipoDocu = tipoDocu;
       this.tipoRefe = tipoRefe;
       this.noProve = noProve;
       this.monto = monto;
       this.descuentoPp = descuentoPp;
       this.montoNominal = montoNominal;
       this.status = status;
       this.difCambiario = difCambiario;
       this.bcoProve = bcoProve;
       this.ctaBcoProve = ctaBcoProve;
       this.montoRes = montoRes;
       this.descuentoPpRes = descuentoPpRes;
       this.montoNominalRes = montoNominalRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noSecuencia", column=@Column(name="NO_SECUENCIA", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="noRefe", column=@Column(name="NO_REFE", nullable=false, length=8) ) } )
    public ArckrdId getId() {
        return this.id;
    }
    
    public void setId(ArckrdId id) {
        this.id = id;
    }

    
    @Column(name="TIPO_DOCU", length=2)
    public String getTipoDocu() {
        return this.tipoDocu;
    }
    
    public void setTipoDocu(String tipoDocu) {
        this.tipoDocu = tipoDocu;
    }

    
    @Column(name="TIPO_REFE", length=2)
    public String getTipoRefe() {
        return this.tipoRefe;
    }
    
    public void setTipoRefe(String tipoRefe) {
        this.tipoRefe = tipoRefe;
    }

    
    @Column(name="NO_PROVE", length=15)
    public String getNoProve() {
        return this.noProve;
    }
    
    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }

    
    @Column(name="MONTO", precision=17)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Column(name="DESCUENTO_PP", precision=17)
    public BigDecimal getDescuentoPp() {
        return this.descuentoPp;
    }
    
    public void setDescuentoPp(BigDecimal descuentoPp) {
        this.descuentoPp = descuentoPp;
    }

    
    @Column(name="MONTO_NOMINAL", precision=17)
    public BigDecimal getMontoNominal() {
        return this.montoNominal;
    }
    
    public void setMontoNominal(BigDecimal montoNominal) {
        this.montoNominal = montoNominal;
    }

    
    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="DIF_CAMBIARIO", precision=17)
    public BigDecimal getDifCambiario() {
        return this.difCambiario;
    }
    
    public void setDifCambiario(BigDecimal difCambiario) {
        this.difCambiario = difCambiario;
    }

    
    @Column(name="BCO_PROVE", length=2)
    public String getBcoProve() {
        return this.bcoProve;
    }
    
    public void setBcoProve(String bcoProve) {
        this.bcoProve = bcoProve;
    }

    
    @Column(name="CTA_BCO_PROVE", length=20)
    public String getCtaBcoProve() {
        return this.ctaBcoProve;
    }
    
    public void setCtaBcoProve(String ctaBcoProve) {
        this.ctaBcoProve = ctaBcoProve;
    }

    
    @Column(name="MONTO_RES", precision=30)
    public BigDecimal getMontoRes() {
        return this.montoRes;
    }
    
    public void setMontoRes(BigDecimal montoRes) {
        this.montoRes = montoRes;
    }

    
    @Column(name="DESCUENTO_PP_RES", precision=30)
    public BigDecimal getDescuentoPpRes() {
        return this.descuentoPpRes;
    }
    
    public void setDescuentoPpRes(BigDecimal descuentoPpRes) {
        this.descuentoPpRes = descuentoPpRes;
    }

    
    @Column(name="MONTO_NOMINAL_RES", precision=30)
    public BigDecimal getMontoNominalRes() {
        return this.montoNominalRes;
    }
    
    public void setMontoNominalRes(BigDecimal montoNominalRes) {
        this.montoNominalRes = montoNominalRes;
    }




}


