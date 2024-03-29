package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Arplcl generated by hbm2java
 */
@Entity
@Table(name="ARPLCL"
    ,schema="DESA46"
)
public class Arplcl  implements java.io.Serializable {


     private String claseEmp;
     private String descripcion;
     private String grupoClase;
     private BigDecimal valor;
     private String codExcluyente;

    public Arplcl() {
    }

	
    public Arplcl(String claseEmp) {
        this.claseEmp = claseEmp;
    }
    public Arplcl(String claseEmp, String descripcion, String grupoClase, BigDecimal valor, String codExcluyente) {
       this.claseEmp = claseEmp;
       this.descripcion = descripcion;
       this.grupoClase = grupoClase;
       this.valor = valor;
       this.codExcluyente = codExcluyente;
    }
   
     @Id 

    
    @Column(name="CLASE_EMP", unique=true, nullable=false, length=4)
    public String getClaseEmp() {
        return this.claseEmp;
    }
    
    public void setClaseEmp(String claseEmp) {
        this.claseEmp = claseEmp;
    }

    
    @Column(name="DESCRIPCION", length=35)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="GRUPO_CLASE", length=6)
    public String getGrupoClase() {
        return this.grupoClase;
    }
    
    public void setGrupoClase(String grupoClase) {
        this.grupoClase = grupoClase;
    }

    
    @Column(name="VALOR", precision=17, scale=4)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="COD_EXCLUYENTE", length=3)
    public String getCodExcluyente() {
        return this.codExcluyente;
    }
    
    public void setCodExcluyente(String codExcluyente) {
        this.codExcluyente = codExcluyente;
    }




}


