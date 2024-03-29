package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Denominaciones generated by hbm2java
 */
@Entity
@Table(name="DENOMINACIONES"
    ,schema="DESA46"
)
public class Denominaciones  implements java.io.Serializable {


     private BigDecimal valor;
     private String clase;

    public Denominaciones() {
    }

	
    public Denominaciones(BigDecimal valor) {
        this.valor = valor;
    }
    public Denominaciones(BigDecimal valor, String clase) {
       this.valor = valor;
       this.clase = clase;
    }
   
     @Id 

    
    @Column(name="VALOR", unique=true, nullable=false, precision=8)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="CLASE", length=1)
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }




}


