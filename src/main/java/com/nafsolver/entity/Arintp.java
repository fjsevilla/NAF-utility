package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Arintp generated by hbm2java
 */
@Entity
@Table(name="ARINTP"
    ,schema="DESA46"
)
public class Arintp  implements java.io.Serializable {


     private ArintpId id;
     private String indPrecioFijo;
     private BigDecimal porcVariacion;
     private BigDecimal redondeo;
     private String moneda;
     private BigDecimal precio;
     private String indPrecioFijoNue;
     private BigDecimal porcVariacionNue;
     private BigDecimal redondeoNue;
     private String monedaNue;
     private BigDecimal precioNue;
     private Date tstamp;
     private BigDecimal precioRes;

    public Arintp() {
    }

	
    public Arintp(ArintpId id) {
        this.id = id;
    }
    public Arintp(ArintpId id, String indPrecioFijo, BigDecimal porcVariacion, BigDecimal redondeo, String moneda, BigDecimal precio, String indPrecioFijoNue, BigDecimal porcVariacionNue, BigDecimal redondeoNue, String monedaNue, BigDecimal precioNue, Date tstamp, BigDecimal precioRes) {
       this.id = id;
       this.indPrecioFijo = indPrecioFijo;
       this.porcVariacion = porcVariacion;
       this.redondeo = redondeo;
       this.moneda = moneda;
       this.precio = precio;
       this.indPrecioFijoNue = indPrecioFijoNue;
       this.porcVariacionNue = porcVariacionNue;
       this.redondeoNue = redondeoNue;
       this.monedaNue = monedaNue;
       this.precioNue = precioNue;
       this.tstamp = tstamp;
       this.precioRes = precioRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="codigo", column=@Column(name="CODIGO", nullable=false, length=30) ), 
        @AttributeOverride(name="tipo", column=@Column(name="TIPO", nullable=false, length=2) ) } )
    public ArintpId getId() {
        return this.id;
    }
    
    public void setId(ArintpId id) {
        this.id = id;
    }

    
    @Column(name="IND_PRECIO_FIJO", length=1)
    public String getIndPrecioFijo() {
        return this.indPrecioFijo;
    }
    
    public void setIndPrecioFijo(String indPrecioFijo) {
        this.indPrecioFijo = indPrecioFijo;
    }

    
    @Column(name="PORC_VARIACION", precision=8, scale=4)
    public BigDecimal getPorcVariacion() {
        return this.porcVariacion;
    }
    
    public void setPorcVariacion(BigDecimal porcVariacion) {
        this.porcVariacion = porcVariacion;
    }

    
    @Column(name="REDONDEO", precision=7)
    public BigDecimal getRedondeo() {
        return this.redondeo;
    }
    
    public void setRedondeo(BigDecimal redondeo) {
        this.redondeo = redondeo;
    }

    
    @Column(name="MONEDA", length=1)
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    
    @Column(name="PRECIO", precision=22, scale=6)
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    
    @Column(name="IND_PRECIO_FIJO_NUE", length=1)
    public String getIndPrecioFijoNue() {
        return this.indPrecioFijoNue;
    }
    
    public void setIndPrecioFijoNue(String indPrecioFijoNue) {
        this.indPrecioFijoNue = indPrecioFijoNue;
    }

    
    @Column(name="PORC_VARIACION_NUE", precision=8, scale=4)
    public BigDecimal getPorcVariacionNue() {
        return this.porcVariacionNue;
    }
    
    public void setPorcVariacionNue(BigDecimal porcVariacionNue) {
        this.porcVariacionNue = porcVariacionNue;
    }

    
    @Column(name="REDONDEO_NUE", precision=7)
    public BigDecimal getRedondeoNue() {
        return this.redondeoNue;
    }
    
    public void setRedondeoNue(BigDecimal redondeoNue) {
        this.redondeoNue = redondeoNue;
    }

    
    @Column(name="MONEDA_NUE", length=1)
    public String getMonedaNue() {
        return this.monedaNue;
    }
    
    public void setMonedaNue(String monedaNue) {
        this.monedaNue = monedaNue;
    }

    
    @Column(name="PRECIO_NUE", precision=22, scale=6)
    public BigDecimal getPrecioNue() {
        return this.precioNue;
    }
    
    public void setPrecioNue(BigDecimal precioNue) {
        this.precioNue = precioNue;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TSTAMP", length=7)
    public Date getTstamp() {
        return this.tstamp;
    }
    
    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    
    @Column(name="PRECIO_RES", precision=30)
    public BigDecimal getPrecioRes() {
        return this.precioRes;
    }
    
    public void setPrecioRes(BigDecimal precioRes) {
        this.precioRes = precioRes;
    }




}


