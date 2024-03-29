package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Argesec generated by hbm2java
 */
@Entity
@Table(name="ARGESEC"
    ,schema="DESA46"
)
public class Argesec  implements java.io.Serializable {


     private String codigo;
     private String descripcion;

    public Argesec() {
    }

	
    public Argesec(String codigo) {
        this.codigo = codigo;
    }
    public Argesec(String codigo, String descripcion) {
       this.codigo = codigo;
       this.descripcion = descripcion;
    }
   
     @Id 

    
    @Column(name="CODIGO", unique=true, nullable=false, length=2)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="DESCRIPCION", length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


