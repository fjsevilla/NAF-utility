package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ArplcalDet generated by hbm2java
 */
@Entity
@Table(name="ARPLCAL_DET"
    ,schema="DESA46"
)
public class ArplcalDet  implements java.io.Serializable {


     private ArplcalDetId id;

    public ArplcalDet() {
    }

    public ArplcalDet(ArplcalDetId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="codCal", column=@Column(name="COD_CAL", nullable=false, length=10) ), 
        @AttributeOverride(name="fecha", column=@Column(name="FECHA", nullable=false, length=7) ), 
        @AttributeOverride(name="dia", column=@Column(name="DIA", nullable=false, length=20) ) } )
    public ArplcalDetId getId() {
        return this.id;
    }
    
    public void setId(ArplcalDetId id) {
        this.id = id;
    }




}

