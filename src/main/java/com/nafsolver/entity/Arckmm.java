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
 * Arckmm generated by hbm2java
 */
@Entity
@Table(name="ARCKMM"
    ,schema="DESA46"
)
public class Arckmm  implements java.io.Serializable {


     private ArckmmId id;
     private String noCta;
     private String procedencia;
     private String tipoDoc;
     private Date fecha;
     private String beneficiario;
     private String comentario;
     private BigDecimal monto;
     private BigDecimal descuentoPp;
     private String estado;
     private String conciliado;
     private Byte mes;
     private Short ano;
     private Date fechaAnulado;
     private String indBorrado;
     private String indOtromov;
     private String monedaCta;
     private BigDecimal tipoCambio;
     private String tipoAjuste;
     private String indDist;
     private String TCambCV;
     private String indOtrosMeses;
     private Byte mesConciliado;
     private Short anoConciliado;
     private String noFisico;
     private String serieFisico;
     private String indCon;
     private Long numeroCtrl;
     private BigDecimal montoRes;
     private BigDecimal descuentoPpRes;

    public Arckmm() {
    }

	
    public Arckmm(ArckmmId id) {
        this.id = id;
    }
    public Arckmm(ArckmmId id, String noCta, String procedencia, String tipoDoc, Date fecha, String beneficiario, String comentario, BigDecimal monto, BigDecimal descuentoPp, String estado, String conciliado, Byte mes, Short ano, Date fechaAnulado, String indBorrado, String indOtromov, String monedaCta, BigDecimal tipoCambio, String tipoAjuste, String indDist, String TCambCV, String indOtrosMeses, Byte mesConciliado, Short anoConciliado, String noFisico, String serieFisico, String indCon, Long numeroCtrl, BigDecimal montoRes, BigDecimal descuentoPpRes) {
       this.id = id;
       this.noCta = noCta;
       this.procedencia = procedencia;
       this.tipoDoc = tipoDoc;
       this.fecha = fecha;
       this.beneficiario = beneficiario;
       this.comentario = comentario;
       this.monto = monto;
       this.descuentoPp = descuentoPp;
       this.estado = estado;
       this.conciliado = conciliado;
       this.mes = mes;
       this.ano = ano;
       this.fechaAnulado = fechaAnulado;
       this.indBorrado = indBorrado;
       this.indOtromov = indOtromov;
       this.monedaCta = monedaCta;
       this.tipoCambio = tipoCambio;
       this.tipoAjuste = tipoAjuste;
       this.indDist = indDist;
       this.TCambCV = TCambCV;
       this.indOtrosMeses = indOtrosMeses;
       this.mesConciliado = mesConciliado;
       this.anoConciliado = anoConciliado;
       this.noFisico = noFisico;
       this.serieFisico = serieFisico;
       this.indCon = indCon;
       this.numeroCtrl = numeroCtrl;
       this.montoRes = montoRes;
       this.descuentoPpRes = descuentoPpRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noDocu", column=@Column(name="NO_DOCU", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ) } )
    public ArckmmId getId() {
        return this.id;
    }
    
    public void setId(ArckmmId id) {
        this.id = id;
    }

    
    @Column(name="NO_CTA", length=15)
    public String getNoCta() {
        return this.noCta;
    }
    
    public void setNoCta(String noCta) {
        this.noCta = noCta;
    }

    
    @Column(name="PROCEDENCIA", length=1)
    public String getProcedencia() {
        return this.procedencia;
    }
    
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    
    @Column(name="TIPO_DOC", length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="BENEFICIARIO", length=60)
    public String getBeneficiario() {
        return this.beneficiario;
    }
    
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    
    @Column(name="COMENTARIO")
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    @Column(name="MONTO", precision=22)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Column(name="DESCUENTO_PP", precision=22)
    public BigDecimal getDescuentoPp() {
        return this.descuentoPp;
    }
    
    public void setDescuentoPp(BigDecimal descuentoPp) {
        this.descuentoPp = descuentoPp;
    }

    
    @Column(name="ESTADO", length=1)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="CONCILIADO", length=1)
    public String getConciliado() {
        return this.conciliado;
    }
    
    public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
    }

    
    @Column(name="MES", precision=2, scale=0)
    public Byte getMes() {
        return this.mes;
    }
    
    public void setMes(Byte mes) {
        this.mes = mes;
    }

    
    @Column(name="ANO", precision=4, scale=0)
    public Short getAno() {
        return this.ano;
    }
    
    public void setAno(Short ano) {
        this.ano = ano;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_ANULADO", length=7)
    public Date getFechaAnulado() {
        return this.fechaAnulado;
    }
    
    public void setFechaAnulado(Date fechaAnulado) {
        this.fechaAnulado = fechaAnulado;
    }

    
    @Column(name="IND_BORRADO", length=1)
    public String getIndBorrado() {
        return this.indBorrado;
    }
    
    public void setIndBorrado(String indBorrado) {
        this.indBorrado = indBorrado;
    }

    
    @Column(name="IND_OTROMOV", length=1)
    public String getIndOtromov() {
        return this.indOtromov;
    }
    
    public void setIndOtromov(String indOtromov) {
        this.indOtromov = indOtromov;
    }

    
    @Column(name="MONEDA_CTA", length=1)
    public String getMonedaCta() {
        return this.monedaCta;
    }
    
    public void setMonedaCta(String monedaCta) {
        this.monedaCta = monedaCta;
    }

    
    @Column(name="TIPO_CAMBIO", precision=17, scale=4)
    public BigDecimal getTipoCambio() {
        return this.tipoCambio;
    }
    
    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    
    @Column(name="TIPO_AJUSTE", length=1)
    public String getTipoAjuste() {
        return this.tipoAjuste;
    }
    
    public void setTipoAjuste(String tipoAjuste) {
        this.tipoAjuste = tipoAjuste;
    }

    
    @Column(name="IND_DIST", length=1)
    public String getIndDist() {
        return this.indDist;
    }
    
    public void setIndDist(String indDist) {
        this.indDist = indDist;
    }

    
    @Column(name="T_CAMB_C_V", length=1)
    public String getTCambCV() {
        return this.TCambCV;
    }
    
    public void setTCambCV(String TCambCV) {
        this.TCambCV = TCambCV;
    }

    
    @Column(name="IND_OTROS_MESES", length=1)
    public String getIndOtrosMeses() {
        return this.indOtrosMeses;
    }
    
    public void setIndOtrosMeses(String indOtrosMeses) {
        this.indOtrosMeses = indOtrosMeses;
    }

    
    @Column(name="MES_CONCILIADO", precision=2, scale=0)
    public Byte getMesConciliado() {
        return this.mesConciliado;
    }
    
    public void setMesConciliado(Byte mesConciliado) {
        this.mesConciliado = mesConciliado;
    }

    
    @Column(name="ANO_CONCILIADO", precision=4, scale=0)
    public Short getAnoConciliado() {
        return this.anoConciliado;
    }
    
    public void setAnoConciliado(Short anoConciliado) {
        this.anoConciliado = anoConciliado;
    }

    
    @Column(name="NO_FISICO", length=12)
    public String getNoFisico() {
        return this.noFisico;
    }
    
    public void setNoFisico(String noFisico) {
        this.noFisico = noFisico;
    }

    
    @Column(name="SERIE_FISICO", length=15)
    public String getSerieFisico() {
        return this.serieFisico;
    }
    
    public void setSerieFisico(String serieFisico) {
        this.serieFisico = serieFisico;
    }

    
    @Column(name="IND_CON", length=1)
    public String getIndCon() {
        return this.indCon;
    }
    
    public void setIndCon(String indCon) {
        this.indCon = indCon;
    }

    
    @Column(name="NUMERO_CTRL", precision=10, scale=0)
    public Long getNumeroCtrl() {
        return this.numeroCtrl;
    }
    
    public void setNumeroCtrl(Long numeroCtrl) {
        this.numeroCtrl = numeroCtrl;
    }

    
    @Column(name="MONTO_RES", precision=30)
    public BigDecimal getMontoRes() {
        return this.montoRes;
    }
    
    public void setMontoRes(BigDecimal montoRes) {
        this.montoRes = montoRes;
    }

    
    @Column(name="DESCUENTO_PP_RES", precision=30)
    public BigDecimal getDescuentoPpRes() {
        return this.descuentoPpRes;
    }
    
    public void setDescuentoPpRes(BigDecimal descuentoPpRes) {
        this.descuentoPpRes = descuentoPpRes;
    }




}


