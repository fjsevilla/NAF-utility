package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Paises generated by hbm2java
 */
@Entity
@Table(name="PAISES"
    ,schema="DESA46"
)
public class Paises  implements java.io.Serializable {


     private String pais;
     private String nombre;
     private String idMoneda;

    public Paises() {
    }

	
    public Paises(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }
    public Paises(String pais, String nombre, String idMoneda) {
       this.pais = pais;
       this.nombre = nombre;
       this.idMoneda = idMoneda;
    }
   
     @Id 

    
    @Column(name="PAIS", unique=true, nullable=false, length=3)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    @Column(name="NOMBRE", nullable=false, length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="ID_MONEDA", length=3)
    public String getIdMoneda() {
        return this.idMoneda;
    }
    
    public void setIdMoneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }




}


