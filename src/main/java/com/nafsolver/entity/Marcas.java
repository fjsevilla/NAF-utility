package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Marcas generated by hbm2java
 */
@Entity
@Table(name="MARCAS"
    ,schema="DESA46"
)
public class Marcas  implements java.io.Serializable {


     private MarcasId id;
     private String descripcion;

    public Marcas() {
    }

	
    public Marcas(MarcasId id) {
        this.id = id;
    }
    public Marcas(MarcasId id, String descripcion) {
       this.id = id;
       this.descripcion = descripcion;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="codigo", column=@Column(name="CODIGO", nullable=false, length=6) ) } )
    public MarcasId getId() {
        return this.id;
    }
    
    public void setId(MarcasId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPCION", length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


