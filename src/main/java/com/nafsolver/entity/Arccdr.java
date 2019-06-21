package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arccdr generated by hbm2java
 */
@Entity
@Table(name="ARCCDR"
    ,schema="DESA46"
)
public class Arccdr  implements java.io.Serializable {


     private ArccdrId id;
     private String estado;
     private String cerrado;
     private String motivoDev;

    public Arccdr() {
    }

	
    public Arccdr(ArccdrId id) {
        this.id = id;
    }
    public Arccdr(ArccdrId id, String estado, String cerrado, String motivoDev) {
       this.id = id;
       this.estado = estado;
       this.cerrado = cerrado;
       this.motivoDev = motivoDev;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noRelacion", column=@Column(name="NO_RELACION", nullable=false, precision=14, scale=0) ), 
        @AttributeOverride(name="noDocu", column=@Column(name="NO_DOCU", nullable=false, length=12) ) } )
    public ArccdrId getId() {
        return this.id;
    }
    
    public void setId(ArccdrId id) {
        this.id = id;
    }

    
    @Column(name="ESTADO", length=3)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="CERRADO", length=1)
    public String getCerrado() {
        return this.cerrado;
    }
    
    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
    }

    
    @Column(name="MOTIVO_DEV", length=20)
    public String getMotivoDev() {
        return this.motivoDev;
    }
    
    public void setMotivoDev(String motivoDev) {
        this.motivoDev = motivoDev;
    }




}


