package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arplcal generated by hbm2java
 */
@Entity
@Table(name="ARPLCAL"
    ,schema="DESA46"
)
public class Arplcal  implements java.io.Serializable {


     private ArplcalId id;
     private String descripCal;
     private String fechaLimite;
     private String status;
     private String anoIni;
     private String anoFin;
     private String abrev;

    public Arplcal() {
    }

	
    public Arplcal(ArplcalId id) {
        this.id = id;
    }
    public Arplcal(ArplcalId id, String descripCal, String fechaLimite, String status, String anoIni, String anoFin, String abrev) {
       this.id = id;
       this.descripCal = descripCal;
       this.fechaLimite = fechaLimite;
       this.status = status;
       this.anoIni = anoIni;
       this.anoFin = anoFin;
       this.abrev = abrev;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="codCal", column=@Column(name="COD_CAL", nullable=false, length=10) ) } )
    public ArplcalId getId() {
        return this.id;
    }
    
    public void setId(ArplcalId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIP_CAL", length=150)
    public String getDescripCal() {
        return this.descripCal;
    }
    
    public void setDescripCal(String descripCal) {
        this.descripCal = descripCal;
    }

    
    @Column(name="FECHA_LIMITE", length=100)
    public String getFechaLimite() {
        return this.fechaLimite;
    }
    
    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    
    @Column(name="STATUS", length=2)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="ANO_INI", length=5)
    public String getAnoIni() {
        return this.anoIni;
    }
    
    public void setAnoIni(String anoIni) {
        this.anoIni = anoIni;
    }

    
    @Column(name="ANO_FIN", length=5)
    public String getAnoFin() {
        return this.anoFin;
    }
    
    public void setAnoFin(String anoFin) {
        this.anoFin = anoFin;
    }

    
    @Column(name="ABREV", length=5)
    public String getAbrev() {
        return this.abrev;
    }
    
    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }




}

