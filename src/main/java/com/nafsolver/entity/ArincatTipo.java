package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ArincatTipo generated by hbm2java
 */
@Entity
@Table(name="ARINCAT_TIPO"
    ,schema="DESA46"
)
public class ArincatTipo  implements java.io.Serializable {


     private ArincatTipoId id;
     private String nomTipo;
     private Long correlativo;

    public ArincatTipo() {
    }

	
    public ArincatTipo(ArincatTipoId id) {
        this.id = id;
    }
    public ArincatTipo(ArincatTipoId id, String nomTipo, Long correlativo) {
       this.id = id;
       this.nomTipo = nomTipo;
       this.correlativo = correlativo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="tipo", column=@Column(name="TIPO", nullable=false, length=30) ) } )
    public ArincatTipoId getId() {
        return this.id;
    }
    
    public void setId(ArincatTipoId id) {
        this.id = id;
    }

    
    @Column(name="NOM_TIPO", length=500)
    public String getNomTipo() {
        return this.nomTipo;
    }
    
    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    
    @Column(name="CORRELATIVO", precision=17, scale=0)
    public Long getCorrelativo() {
        return this.correlativo;
    }
    
    public void setCorrelativo(Long correlativo) {
        this.correlativo = correlativo;
    }




}

