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
 * Arinhp generated by hbm2java
 */
@Entity
@Table(name="ARINHP"
    ,schema="DESA46"
)
public class Arinhp  implements java.io.Serializable {


     private ArinhpId id;
     private BigDecimal unidades;
     private BigDecimal monto;
     private BigDecimal montoRes;

    public Arinhp() {
    }

	
    public Arinhp(ArinhpId id) {
        this.id = id;
    }
    public Arinhp(ArinhpId id, BigDecimal unidades, BigDecimal monto, BigDecimal montoRes) {
       this.id = id;
       this.unidades = unidades;
       this.monto = monto;
       this.montoRes = montoRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="centro", column=@Column(name="CENTRO", nullable=false, length=2) ), 
        @AttributeOverride(name="periodo", column=@Column(name="PERIODO", nullable=false, length=4) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="noArti", column=@Column(name="NO_ARTI", nullable=false, length=30) ) } )
    public ArinhpId getId() {
        return this.id;
    }
    
    public void setId(ArinhpId id) {
        this.id = id;
    }

    
    @Column(name="UNIDADES", precision=12)
    public BigDecimal getUnidades() {
        return this.unidades;
    }
    
    public void setUnidades(BigDecimal unidades) {
        this.unidades = unidades;
    }

    
    @Column(name="MONTO", precision=17)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Column(name="MONTO_RES", precision=30)
    public BigDecimal getMontoRes() {
        return this.montoRes;
    }
    
    public void setMontoRes(BigDecimal montoRes) {
        this.montoRes = montoRes;
    }




}


