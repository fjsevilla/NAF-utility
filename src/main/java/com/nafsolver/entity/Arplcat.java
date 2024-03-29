package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Arplcat generated by hbm2java
 */
@Entity
@Table(name="ARPLCAT"
    ,schema="DESA46"
)
public class Arplcat  implements java.io.Serializable {


     private String categoria;
     private String descripcion;
     private BigDecimal BFuncional;

    public Arplcat() {
    }

	
    public Arplcat(String categoria) {
        this.categoria = categoria;
    }
    public Arplcat(String categoria, String descripcion, BigDecimal BFuncional) {
       this.categoria = categoria;
       this.descripcion = descripcion;
       this.BFuncional = BFuncional;
    }
   
     @Id 

    
    @Column(name="CATEGORIA", unique=true, nullable=false, length=2)
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    @Column(name="DESCRIPCION", length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="B_FUNCIONAL", precision=5)
    public BigDecimal getBFuncional() {
        return this.BFuncional;
    }
    
    public void setBFuncional(BigDecimal BFuncional) {
        this.BFuncional = BFuncional;
    }




}


