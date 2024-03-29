package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arcgcdm generated by hbm2java
 */
@Entity
@Table(name="ARCGCDM"
    ,schema="DESA46"
)
public class Arcgcdm  implements java.io.Serializable {


     private ArcgcdmId id;

    public Arcgcdm() {
    }

    public Arcgcdm(ArcgcdmId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="codDiario", column=@Column(name="COD_DIARIO", nullable=false, length=5) ), 
        @AttributeOverride(name="modulo", column=@Column(name="MODULO", nullable=false, length=2) ) } )
    public ArcgcdmId getId() {
        return this.id;
    }
    
    public void setId(ArcgcdmId id) {
        this.id = id;
    }




}


