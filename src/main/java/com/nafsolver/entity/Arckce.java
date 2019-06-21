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
 * Arckce generated by hbm2java
 */
@Entity
@Table(name="ARCKCE"
    ,schema="DESA46"
)
public class Arckce  implements java.io.Serializable {


     private ArckceId id;
     private String noCta;
     private Integer cheque;
     private Date fecha;
     private BigDecimal monto;
     private String beneficiario;
     private String indAct;
     private String com;
     private String indCon;
     private String noProve;
     private String anulado;
     private Date fechaAnulado;
     private String emitido;
     private BigDecimal totRef;
     private BigDecimal totDifeCam;
     private BigDecimal totDb;
     private BigDecimal totCr;
     private BigDecimal saldo;
     private String monedaCta;
     private String monedaPago;
     private BigDecimal tipoCambio;
     private BigDecimal montoNominal;
     private BigDecimal saldoNominal;
     private String autoriza;
     private String origen;
     private String TCambCV;
     private String noAsiento;
     private String ubicacion;
     private Date fechaVence;
     private BigDecimal totDpp;
     private Long numeroCtrl;
     private String tipoTransfe;
     private String bancoTransfe;
     private String ctaBcoTransfe;
     private BigDecimal montoRes;
     private BigDecimal totRefRes;
     private BigDecimal totDbRes;
     private BigDecimal totCrRes;
     private BigDecimal saldoRes;

    public Arckce() {
    }

	
    public Arckce(ArckceId id) {
        this.id = id;
    }
    public Arckce(ArckceId id, String noCta, Integer cheque, Date fecha, BigDecimal monto, String beneficiario, String indAct, String com, String indCon, String noProve, String anulado, Date fechaAnulado, String emitido, BigDecimal totRef, BigDecimal totDifeCam, BigDecimal totDb, BigDecimal totCr, BigDecimal saldo, String monedaCta, String monedaPago, BigDecimal tipoCambio, BigDecimal montoNominal, BigDecimal saldoNominal, String autoriza, String origen, String TCambCV, String noAsiento, String ubicacion, Date fechaVence, BigDecimal totDpp, Long numeroCtrl, String tipoTransfe, String bancoTransfe, String ctaBcoTransfe, BigDecimal montoRes, BigDecimal totRefRes, BigDecimal totDbRes, BigDecimal totCrRes, BigDecimal saldoRes) {
       this.id = id;
       this.noCta = noCta;
       this.cheque = cheque;
       this.fecha = fecha;
       this.monto = monto;
       this.beneficiario = beneficiario;
       this.indAct = indAct;
       this.com = com;
       this.indCon = indCon;
       this.noProve = noProve;
       this.anulado = anulado;
       this.fechaAnulado = fechaAnulado;
       this.emitido = emitido;
       this.totRef = totRef;
       this.totDifeCam = totDifeCam;
       this.totDb = totDb;
       this.totCr = totCr;
       this.saldo = saldo;
       this.monedaCta = monedaCta;
       this.monedaPago = monedaPago;
       this.tipoCambio = tipoCambio;
       this.montoNominal = montoNominal;
       this.saldoNominal = saldoNominal;
       this.autoriza = autoriza;
       this.origen = origen;
       this.TCambCV = TCambCV;
       this.noAsiento = noAsiento;
       this.ubicacion = ubicacion;
       this.fechaVence = fechaVence;
       this.totDpp = totDpp;
       this.numeroCtrl = numeroCtrl;
       this.tipoTransfe = tipoTransfe;
       this.bancoTransfe = bancoTransfe;
       this.ctaBcoTransfe = ctaBcoTransfe;
       this.montoRes = montoRes;
       this.totRefRes = totRefRes;
       this.totDbRes = totDbRes;
       this.totCrRes = totCrRes;
       this.saldoRes = saldoRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="tipoDocu", column=@Column(name="TIPO_DOCU", nullable=false, length=2) ), 
        @AttributeOverride(name="noSecuencia", column=@Column(name="NO_SECUENCIA", nullable=false, precision=8, scale=0) ) } )
    public ArckceId getId() {
        return this.id;
    }
    
    public void setId(ArckceId id) {
        this.id = id;
    }

    
    @Column(name="NO_CTA", length=15)
    public String getNoCta() {
        return this.noCta;
    }
    
    public void setNoCta(String noCta) {
        this.noCta = noCta;
    }

    
    @Column(name="CHEQUE", precision=8, scale=0)
    public Integer getCheque() {
        return this.cheque;
    }
    
    public void setCheque(Integer cheque) {
        this.cheque = cheque;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="MONTO", precision=22)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    
    @Column(name="BENEFICIARIO", length=60)
    public String getBeneficiario() {
        return this.beneficiario;
    }
    
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    
    @Column(name="IND_ACT", length=1)
    public String getIndAct() {
        return this.indAct;
    }
    
    public void setIndAct(String indAct) {
        this.indAct = indAct;
    }

    
    @Column(name="COM", length=240)
    public String getCom() {
        return this.com;
    }
    
    public void setCom(String com) {
        this.com = com;
    }

    
    @Column(name="IND_CON", length=1)
    public String getIndCon() {
        return this.indCon;
    }
    
    public void setIndCon(String indCon) {
        this.indCon = indCon;
    }

    
    @Column(name="NO_PROVE", length=15)
    public String getNoProve() {
        return this.noProve;
    }
    
    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }

    
    @Column(name="ANULADO", length=1)
    public String getAnulado() {
        return this.anulado;
    }
    
    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_ANULADO", length=7)
    public Date getFechaAnulado() {
        return this.fechaAnulado;
    }
    
    public void setFechaAnulado(Date fechaAnulado) {
        this.fechaAnulado = fechaAnulado;
    }

    
    @Column(name="EMITIDO", length=1)
    public String getEmitido() {
        return this.emitido;
    }
    
    public void setEmitido(String emitido) {
        this.emitido = emitido;
    }

    
    @Column(name="TOT_REF", precision=22)
    public BigDecimal getTotRef() {
        return this.totRef;
    }
    
    public void setTotRef(BigDecimal totRef) {
        this.totRef = totRef;
    }

    
    @Column(name="TOT_DIFE_CAM", precision=22)
    public BigDecimal getTotDifeCam() {
        return this.totDifeCam;
    }
    
    public void setTotDifeCam(BigDecimal totDifeCam) {
        this.totDifeCam = totDifeCam;
    }

    
    @Column(name="TOT_DB", precision=22)
    public BigDecimal getTotDb() {
        return this.totDb;
    }
    
    public void setTotDb(BigDecimal totDb) {
        this.totDb = totDb;
    }

    
    @Column(name="TOT_CR", precision=22)
    public BigDecimal getTotCr() {
        return this.totCr;
    }
    
    public void setTotCr(BigDecimal totCr) {
        this.totCr = totCr;
    }

    
    @Column(name="SALDO", precision=22)
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    
    @Column(name="MONEDA_CTA", length=1)
    public String getMonedaCta() {
        return this.monedaCta;
    }
    
    public void setMonedaCta(String monedaCta) {
        this.monedaCta = monedaCta;
    }

    
    @Column(name="MONEDA_PAGO", length=1)
    public String getMonedaPago() {
        return this.monedaPago;
    }
    
    public void setMonedaPago(String monedaPago) {
        this.monedaPago = monedaPago;
    }

    
    @Column(name="TIPO_CAMBIO", precision=17, scale=4)
    public BigDecimal getTipoCambio() {
        return this.tipoCambio;
    }
    
    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    
    @Column(name="MONTO_NOMINAL", precision=22)
    public BigDecimal getMontoNominal() {
        return this.montoNominal;
    }
    
    public void setMontoNominal(BigDecimal montoNominal) {
        this.montoNominal = montoNominal;
    }

    
    @Column(name="SALDO_NOMINAL", precision=22)
    public BigDecimal getSaldoNominal() {
        return this.saldoNominal;
    }
    
    public void setSaldoNominal(BigDecimal saldoNominal) {
        this.saldoNominal = saldoNominal;
    }

    
    @Column(name="AUTORIZA", length=1)
    public String getAutoriza() {
        return this.autoriza;
    }
    
    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    
    @Column(name="ORIGEN", length=2)
    public String getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    
    @Column(name="T_CAMB_C_V", length=2)
    public String getTCambCV() {
        return this.TCambCV;
    }
    
    public void setTCambCV(String TCambCV) {
        this.TCambCV = TCambCV;
    }

    
    @Column(name="NO_ASIENTO", length=12)
    public String getNoAsiento() {
        return this.noAsiento;
    }
    
    public void setNoAsiento(String noAsiento) {
        this.noAsiento = noAsiento;
    }

    
    @Column(name="UBICACION", length=1)
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCE", length=7)
    public Date getFechaVence() {
        return this.fechaVence;
    }
    
    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
    }

    
    @Column(name="TOT_DPP", precision=22)
    public BigDecimal getTotDpp() {
        return this.totDpp;
    }
    
    public void setTotDpp(BigDecimal totDpp) {
        this.totDpp = totDpp;
    }

    
    @Column(name="NUMERO_CTRL", precision=10, scale=0)
    public Long getNumeroCtrl() {
        return this.numeroCtrl;
    }
    
    public void setNumeroCtrl(Long numeroCtrl) {
        this.numeroCtrl = numeroCtrl;
    }

    
    @Column(name="TIPO_TRANSFE", length=1)
    public String getTipoTransfe() {
        return this.tipoTransfe;
    }
    
    public void setTipoTransfe(String tipoTransfe) {
        this.tipoTransfe = tipoTransfe;
    }

    
    @Column(name="BANCO_TRANSFE", length=2)
    public String getBancoTransfe() {
        return this.bancoTransfe;
    }
    
    public void setBancoTransfe(String bancoTransfe) {
        this.bancoTransfe = bancoTransfe;
    }

    
    @Column(name="CTA_BCO_TRANSFE", length=20)
    public String getCtaBcoTransfe() {
        return this.ctaBcoTransfe;
    }
    
    public void setCtaBcoTransfe(String ctaBcoTransfe) {
        this.ctaBcoTransfe = ctaBcoTransfe;
    }

    
    @Column(name="MONTO_RES", precision=30)
    public BigDecimal getMontoRes() {
        return this.montoRes;
    }
    
    public void setMontoRes(BigDecimal montoRes) {
        this.montoRes = montoRes;
    }

    
    @Column(name="TOT_REF_RES", precision=30)
    public BigDecimal getTotRefRes() {
        return this.totRefRes;
    }
    
    public void setTotRefRes(BigDecimal totRefRes) {
        this.totRefRes = totRefRes;
    }

    
    @Column(name="TOT_DB_RES", precision=30)
    public BigDecimal getTotDbRes() {
        return this.totDbRes;
    }
    
    public void setTotDbRes(BigDecimal totDbRes) {
        this.totDbRes = totDbRes;
    }

    
    @Column(name="TOT_CR_RES", precision=30)
    public BigDecimal getTotCrRes() {
        return this.totCrRes;
    }
    
    public void setTotCrRes(BigDecimal totCrRes) {
        this.totCrRes = totCrRes;
    }

    
    @Column(name="SALDO_RES", precision=30)
    public BigDecimal getSaldoRes() {
        return this.saldoRes;
    }
    
    public void setSaldoRes(BigDecimal saldoRes) {
        this.saldoRes = saldoRes;
    }




}

