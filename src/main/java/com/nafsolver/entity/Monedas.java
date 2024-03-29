package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Monedas generated by hbm2java
 */
@Entity
@Table(name="MONEDAS"
    ,schema="DESA46"
)
public class Monedas  implements java.io.Serializable {


     private String idMoneda;
     private String descMoneda;
     private String descripcion;
     private String signo;
     private BigDecimal redondeo;
     private Boolean numdeci;

    public Monedas() {
    }

	
    public Monedas(String idMoneda) {
        this.idMoneda = idMoneda;
    }
    public Monedas(String idMoneda, String descMoneda, String descripcion, String signo, BigDecimal redondeo, Boolean numdeci) {
       this.idMoneda = idMoneda;
       this.descMoneda = descMoneda;
       this.descripcion = descripcion;
       this.signo = signo;
       this.redondeo = redondeo;
       this.numdeci = numdeci;
    }
   
     @Id 

    
    @Column(name="ID_MONEDA", unique=true, nullable=false, length=3)
    public String getIdMoneda() {
        return this.idMoneda;
    }
    
    public void setIdMoneda(String idMoneda) {
        this.idMoneda = idMoneda;
    }

    
    @Column(name="DESC_MONEDA", length=10)
    public String getDescMoneda() {
        return this.descMoneda;
    }
    
    public void setDescMoneda(String descMoneda) {
        this.descMoneda = descMoneda;
    }

    
    @Column(name="DESCRIPCION", length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="SIGNO", length=3)
    public String getSigno() {
        return this.signo;
    }
    
    public void setSigno(String signo) {
        this.signo = signo;
    }

    
    @Column(name="REDONDEO", precision=5)
    public BigDecimal getRedondeo() {
        return this.redondeo;
    }
    
    public void setRedondeo(BigDecimal redondeo) {
        this.redondeo = redondeo;
    }

    
    @Column(name="NUMDECI", precision=1, scale=0)
    public Boolean getNumdeci() {
        return this.numdeci;
    }
    
    public void setNumdeci(Boolean numdeci) {
        this.numdeci = numdeci;
    }




}


