package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arckuf generated by hbm2java
 */
@Entity
@Table(name="ARCKUF"
    ,schema="DESA46"
)
public class Arckuf  implements java.io.Serializable {


     private ArckufId id;
     private String observacion;
     private String usuario;
     private Integer noSecuencia;

    public Arckuf() {
    }

	
    public Arckuf(ArckufId id) {
        this.id = id;
    }
    public Arckuf(ArckufId id, String observacion, String usuario, Integer noSecuencia) {
       this.id = id;
       this.observacion = observacion;
       this.usuario = usuario;
       this.noSecuencia = noSecuencia;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noCta", column=@Column(name="NO_CTA", nullable=false, length=15) ), 
        @AttributeOverride(name="tipoDoc", column=@Column(name="TIPO_DOC", nullable=false, length=2) ), 
        @AttributeOverride(name="cheque", column=@Column(name="CHEQUE", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="ubicacion", column=@Column(name="UBICACION", nullable=false, length=1) ), 
        @AttributeOverride(name="fechaUbic", column=@Column(name="FECHA_UBIC", nullable=false, length=7) ) } )
    public ArckufId getId() {
        return this.id;
    }
    
    public void setId(ArckufId id) {
        this.id = id;
    }

    
    @Column(name="OBSERVACION")
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    @Column(name="USUARIO", length=30)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="NO_SECUENCIA", precision=8, scale=0)
    public Integer getNoSecuencia() {
        return this.noSecuencia;
    }
    
    public void setNoSecuencia(Integer noSecuencia) {
        this.noSecuencia = noSecuencia;
    }




}


