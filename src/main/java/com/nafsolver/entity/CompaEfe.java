package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CompaEfe generated by hbm2java
 */
@Entity
@Table(name="COMPA_EFE"
    ,schema="DESA46"
)
public class CompaEfe  implements java.io.Serializable {


     private String noCia;
     private String nombre;

    public CompaEfe() {
    }

	
    public CompaEfe(String noCia) {
        this.noCia = noCia;
    }
    public CompaEfe(String noCia, String nombre) {
       this.noCia = noCia;
       this.nombre = nombre;
    }
   
     @Id 

    
    @Column(name="NO_CIA", unique=true, nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    
    @Column(name="NOMBRE", length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


