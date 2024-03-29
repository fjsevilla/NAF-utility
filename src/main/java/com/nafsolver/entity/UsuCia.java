package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UsuCia generated by hbm2java
 */
@Entity
@Table(name="USU_CIA"
    ,schema="DESA46"
)
public class UsuCia  implements java.io.Serializable {


     private UsuCiaId id;

    public UsuCia() {
    }

    public UsuCia(UsuCiaId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="idUsu", column=@Column(name="ID_USU", nullable=false, length=30) ), 
        @AttributeOverride(name="modulo", column=@Column(name="MODULO", nullable=false, length=2) ) } )
    public UsuCiaId getId() {
        return this.id;
    }
    
    public void setId(UsuCiaId id) {
        this.id = id;
    }




}


