package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arplconst generated by hbm2java
 */
@Entity
@Table(name="ARPLCONST"
    ,schema="DESA46"
)
public class Arplconst  implements java.io.Serializable {


     private ArplconstId id;
     private String descripConst;
     private String unidad;
     private BigDecimal equivalencia;
     private BigDecimal maximo;
     private BigDecimal valor;
     private String abrev;
     private String st;
     private String fijo;

    public Arplconst() {
    }

	
    public Arplconst(ArplconstId id) {
        this.id = id;
    }
    public Arplconst(ArplconstId id, String descripConst, String unidad, BigDecimal equivalencia, BigDecimal maximo, BigDecimal valor, String abrev, String st, String fijo) {
       this.id = id;
       this.descripConst = descripConst;
       this.unidad = unidad;
       this.equivalencia = equivalencia;
       this.maximo = maximo;
       this.valor = valor;
       this.abrev = abrev;
       this.st = st;
       this.fijo = fijo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noConst", column=@Column(name="NO_CONST", nullable=false, length=10) ) } )
    public ArplconstId getId() {
        return this.id;
    }
    
    public void setId(ArplconstId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIP_CONST", length=150)
    public String getDescripConst() {
        return this.descripConst;
    }
    
    public void setDescripConst(String descripConst) {
        this.descripConst = descripConst;
    }

    
    @Column(name="UNIDAD", length=40)
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    
    @Column(name="EQUIVALENCIA", precision=12)
    public BigDecimal getEquivalencia() {
        return this.equivalencia;
    }
    
    public void setEquivalencia(BigDecimal equivalencia) {
        this.equivalencia = equivalencia;
    }

    
    @Column(name="MAXIMO", precision=12)
    public BigDecimal getMaximo() {
        return this.maximo;
    }
    
    public void setMaximo(BigDecimal maximo) {
        this.maximo = maximo;
    }

    
    @Column(name="VALOR", precision=12)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="ABREV", length=40)
    public String getAbrev() {
        return this.abrev;
    }
    
    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    
    @Column(name="ST", length=1)
    public String getSt() {
        return this.st;
    }
    
    public void setSt(String st) {
        this.st = st;
    }

    
    @Column(name="FIJO", length=1)
    public String getFijo() {
        return this.fijo;
    }
    
    public void setFijo(String fijo) {
        this.fijo = fijo;
    }




}


