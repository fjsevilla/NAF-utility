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
 * Arccrd generated by hbm2java
 */
@Entity
@Table(name="ARCCRD"
    ,schema="DESA46"
)
public class Arccrd  implements java.io.Serializable {


     private ArccrdId id;
     private String centro;
     private String grupo;
     private String noCliente;
     private String tipoDoc;
     private String periodo;
     private String ruta;
     private String tipoRefe;
     private String periRefe;
     private String rutaRefe;
     private BigDecimal saldoAnterior;
     private Date fechaVence;
     private String procedencia;
     private BigDecimal monto;
     private BigDecimal descuento;
     private Date fecha;
     private String motivo;
     private String docAfecRet;
     private BigDecimal saldoAnteriorRes;
     private BigDecimal montoRes;
     private BigDecimal descuentoRes;

    public Arccrd() {
    }

	
    public Arccrd(ArccrdId id) {
        this.id = id;
    }
    public Arccrd(ArccrdId id, String centro, String grupo, String noCliente, String tipoDoc, String periodo, String ruta, String tipoRefe, String periRefe, String rutaRefe, BigDecimal saldoAnterior, Date fechaVence, String procedencia, BigDecimal monto, BigDecimal descuento, Date fecha, String motivo, String docAfecRet, BigDecimal saldoAnteriorRes, BigDecimal montoRes, BigDecimal descuentoRes) {
       this.id = id;
       this.centro = centro;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.tipoDoc = tipoDoc;
       this.periodo = periodo;
       this.ruta = ruta;
       this.tipoRefe = tipoRefe;
       this.periRefe = periRefe;
       this.rutaRefe = rutaRefe;
       this.saldoAnterior = saldoAnterior;
       this.fechaVence = fechaVence;
       this.procedencia = procedencia;
       this.monto = monto;
       this.descuento = descuento;
       this.fecha = fecha;
       this.motivo = motivo;
       this.docAfecRet = docAfecRet;
       this.saldoAnteriorRes = saldoAnteriorRes;
       this.montoRes = montoRes;
       this.descuentoRes = descuentoRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noDocu", column=@Column(name="NO_DOCU", nullable=false, length=12) ), 
        @AttributeOverride(name="noRefe", column=@Column(name="NO_REFE", nullable=false, length=12) ) } )
    public ArccrdId getId() {
        return this.id;
    }
    
    public void setId(ArccrdId id) {
        this.id = id;
    }

    
    @Column(name="CENTRO", length=2)
    public String getCentro() {
        return this.centro;
    }
    
    public void setCentro(String centro) {
        this.centro = centro;
    }

    
    @Column(name="GRUPO", length=2)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    @Column(name="NO_CLIENTE", length=15)
    public String getNoCliente() {
        return this.noCliente;
    }
    
    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    
    @Column(name="TIPO_DOC", length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    
    @Column(name="PERIODO", length=4)
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
    @Column(name="RUTA", length=4)
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
    @Column(name="TIPO_REFE", length=2)
    public String getTipoRefe() {
        return this.tipoRefe;
    }
    
    public void setTipoRefe(String tipoRefe) {
        this.tipoRefe = tipoRefe;
    }

    
    @Column(name="PERI_REFE", length=4)
    public String getPeriRefe() {
        return this.periRefe;
    }
    
    public void setPeriRefe(String periRefe) {
        this.periRefe = periRefe;
    }

    
    @Column(name="RUTA_REFE", length=4)
    public String getRutaRefe() {
        return this.rutaRefe;
    }
    
    public void setRutaRefe(String rutaRefe) {
        this.rutaRefe = rutaRefe;
    }

    
    @Column(name="SALDO_ANTERIOR", precision=17)
    public BigDecimal getSaldoAnterior() {
        return this.saldoAnterior;
    }
    
    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCE", length=7)
    public Date getFechaVence() {
        return this.fechaVence;
    }
    
    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
    }

    
    @Column(name="PROCEDENCIA", length=1)
    public String getProcedencia() {
        return this.procedencia;
    }
    
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    
    @Column(name="MONTO", precision=17)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Column(name="DESCUENTO", precision=17)
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="MOTIVO", length=1000)
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    @Column(name="DOC_AFEC_RET", length=15)
    public String getDocAfecRet() {
        return this.docAfecRet;
    }
    
    public void setDocAfecRet(String docAfecRet) {
        this.docAfecRet = docAfecRet;
    }

    
    @Column(name="SALDO_ANTERIOR_RES", precision=30)
    public BigDecimal getSaldoAnteriorRes() {
        return this.saldoAnteriorRes;
    }
    
    public void setSaldoAnteriorRes(BigDecimal saldoAnteriorRes) {
        this.saldoAnteriorRes = saldoAnteriorRes;
    }

    
    @Column(name="MONTO_RES", precision=30)
    public BigDecimal getMontoRes() {
        return this.montoRes;
    }
    
    public void setMontoRes(BigDecimal montoRes) {
        this.montoRes = montoRes;
    }

    
    @Column(name="DESCUENTO_RES", precision=30)
    public BigDecimal getDescuentoRes() {
        return this.descuentoRes;
    }
    
    public void setDescuentoRes(BigDecimal descuentoRes) {
        this.descuentoRes = descuentoRes;
    }




}

