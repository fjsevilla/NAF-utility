package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arinum generated by hbm2java
 */
@Entity
@Table(name="ARINUM"
    ,schema="DESA46"
)
public class Arinum  implements java.io.Serializable {


     private ArinumId id;
     private String nom;
     private String tipo;
     private String indFactCantidad;

    public Arinum() {
    }

	
    public Arinum(ArinumId id) {
        this.id = id;
    }
    public Arinum(ArinumId id, String nom, String tipo, String indFactCantidad) {
       this.id = id;
       this.nom = nom;
       this.tipo = tipo;
       this.indFactCantidad = indFactCantidad;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="unidad", column=@Column(name="UNIDAD", nullable=false, length=2) ) } )
    public ArinumId getId() {
        return this.id;
    }
    
    public void setId(ArinumId id) {
        this.id = id;
    }

    
    @Column(name="NOM", length=10)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="TIPO", length=1)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="IND_FACT_CANTIDAD", length=1)
    public String getIndFactCantidad() {
        return this.indFactCantidad;
    }
    
    public void setIndFactCantidad(String indFactCantidad) {
        this.indFactCantidad = indFactCantidad;
    }




}

