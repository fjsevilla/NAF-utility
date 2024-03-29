package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Argeco generated by hbm2java
 */
@Entity
@Table(name="ARGECO"
    ,schema="DESA46"
)
public class Argeco  implements java.io.Serializable {


     private String corporacion;
     private String descripcion;
     private String codigoTercero;

    public Argeco() {
    }

	
    public Argeco(String corporacion) {
        this.corporacion = corporacion;
    }
    public Argeco(String corporacion, String descripcion, String codigoTercero) {
       this.corporacion = corporacion;
       this.descripcion = descripcion;
       this.codigoTercero = codigoTercero;
    }
   
     @Id 

    
    @Column(name="CORPORACION", unique=true, nullable=false, length=6)
    public String getCorporacion() {
        return this.corporacion;
    }
    
    public void setCorporacion(String corporacion) {
        this.corporacion = corporacion;
    }

    
    @Column(name="DESCRIPCION", length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="CODIGO_TERCERO", length=18)
    public String getCodigoTercero() {
        return this.codigoTercero;
    }
    
    public void setCodigoTercero(String codigoTercero) {
        this.codigoTercero = codigoTercero;
    }




}


