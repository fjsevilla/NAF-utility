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
 * Arccmd generated by hbm2java
 */
@Entity
@Table(name="ARCCMD"
    ,schema="DESA46"
)
public class Arccmd  implements java.io.Serializable {


     private ArccmdId id;
     private String centro;
     private String tipoDoc;
     private String periodo;
     private String ruta;
     private String grupo;
     private String noCliente;
     private Date fecha;
     private Date fechaVence;
     private Date fechaVenceOriginal;
     private Date fechaDigitacion;
     private Byte cantProrrogas;
     private String noAgente;
     private String cobrador;
     private BigDecimal subtotal;
     private BigDecimal exento;
     private BigDecimal MOriginal;
     private BigDecimal saldo;
     private BigDecimal descuento;
     private BigDecimal totalRef;
     private String estado;
     private BigDecimal totalDb;
     private BigDecimal totalCr;
     private BigDecimal intereses;
     private String concepto;
     private String periLiq;
     private String noLiq;
     private String origen;
     private Short ano;
     private Byte mes;
     private Byte semana;
     private String noFisico;
     private String serieFisico;
     private String codEstado;
     private String codEstadoNue;
     private String indEstadoVencido;
     private String noDocuRefe;
     private Date fechaDocumento;
     private String anulado;
     private String usuarioAnula;
     private String motivoAnula;
     private BigDecimal gravado;
     private Long numeroCtrl;
     private BigDecimal totImp;
     private BigDecimal totImpEspecial;
     private String codDiario;
     private Date fechaGenCkDev;
     private BigDecimal totRet;
     private BigDecimal totOtrosCargos;
     private Date fechaCobrado;
     private String banco;
     private String tipoFactura;
     private String pagoComision;
     private BigDecimal creditosAplicablesVta;
     private BigDecimal creditosAplicablesCob;
     private BigDecimal ivaFinal;
     private Date fechaCancelacion;
     private Short diasCancelacion;
     private Short gracia;
     private BigDecimal comisionTotalVta;
     private BigDecimal comisionPagadaVta;
     private BigDecimal comisionPagarVta;
     private BigDecimal comisionTotalCobranza;
     private BigDecimal comisionPagadaCobranza;
     private BigDecimal comisionPagarCobranza;
     private String comisionXAcuerdo;
     private String pagarComision;
     private BigDecimal comisionVenta;
     private BigDecimal comisionCobranza;
     private String usuarioReg;
     private String control;
     private BigDecimal baseRet;
     private BigDecimal porcRet;
     private Date fchRet;
     private String noComprobante;
     private BigDecimal emision;
     private BigDecimal emisionFisico;
     private String noRelacioncobro;
     private BigDecimal comisionPagada;
     private String libCkd;
     private String libDiv;
     private String libSa;
     private Integer periodoComc;
     private Short anoComc;
     private Byte mesComc;
     private BigDecimal tempSald;
     private Long nro;
     private String claveImpRed;
     private BigDecimal porcImpRed;
     private BigDecimal montoImpRed;
     private BigDecimal montoImpOrg;
     private BigDecimal porcImpOrg;
     private Byte mesAnula;
     private Short anoAnula;
     private Date fechaAnula;
     private String anuCom;
     private BigDecimal subtotalRes;
     private BigDecimal exentoRes;
     private BigDecimal MOriginalRes;
     private BigDecimal saldoRes;
     private BigDecimal descuentoRes;
     private BigDecimal totalRefRes;
     private BigDecimal totalDbRes;
     private BigDecimal totalCrRes;
     private BigDecimal interesesRes;
     private BigDecimal gravadoRes;
     private BigDecimal totImpRes;
     private BigDecimal totImpEspecialRes;
     private BigDecimal totRetRes;
     private BigDecimal totOtrosCargosRes;
     private BigDecimal creditosAplicablesVtaRes;
     private BigDecimal creditosAplicablesCobRes;
     private BigDecimal ivaFinalRes;
     private BigDecimal comisionTotalVtaRes;
     private BigDecimal comisionPagadaVtaRes;
     private BigDecimal comisionPagarVtaRes;
     private BigDecimal comisionTotalCobranzaRes;

    public Arccmd() {
    }

	
    public Arccmd(ArccmdId id, String centro, String tipoDoc, String periodo, String ruta, String grupo, String noCliente, String estado) {
        this.id = id;
        this.centro = centro;
        this.tipoDoc = tipoDoc;
        this.periodo = periodo;
        this.ruta = ruta;
        this.grupo = grupo;
        this.noCliente = noCliente;
        this.estado = estado;
    }
    public Arccmd(ArccmdId id, String centro, String tipoDoc, String periodo, String ruta, String grupo, String noCliente, Date fecha, Date fechaVence, Date fechaVenceOriginal, Date fechaDigitacion, Byte cantProrrogas, String noAgente, String cobrador, BigDecimal subtotal, BigDecimal exento, BigDecimal MOriginal, BigDecimal saldo, BigDecimal descuento, BigDecimal totalRef, String estado, BigDecimal totalDb, BigDecimal totalCr, BigDecimal intereses, String concepto, String periLiq, String noLiq, String origen, Short ano, Byte mes, Byte semana, String noFisico, String serieFisico, String codEstado, String codEstadoNue, String indEstadoVencido, String noDocuRefe, Date fechaDocumento, String anulado, String usuarioAnula, String motivoAnula, BigDecimal gravado, Long numeroCtrl, BigDecimal totImp, BigDecimal totImpEspecial, String codDiario, Date fechaGenCkDev, BigDecimal totRet, BigDecimal totOtrosCargos, Date fechaCobrado, String banco, String tipoFactura, String pagoComision, BigDecimal creditosAplicablesVta, BigDecimal creditosAplicablesCob, BigDecimal ivaFinal, Date fechaCancelacion, Short diasCancelacion, Short gracia, BigDecimal comisionTotalVta, BigDecimal comisionPagadaVta, BigDecimal comisionPagarVta, BigDecimal comisionTotalCobranza, BigDecimal comisionPagadaCobranza, BigDecimal comisionPagarCobranza, String comisionXAcuerdo, String pagarComision, BigDecimal comisionVenta, BigDecimal comisionCobranza, String usuarioReg, String control, BigDecimal baseRet, BigDecimal porcRet, Date fchRet, String noComprobante, BigDecimal emision, BigDecimal emisionFisico, String noRelacioncobro, BigDecimal comisionPagada, String libCkd, String libDiv, String libSa, Integer periodoComc, Short anoComc, Byte mesComc, BigDecimal tempSald, Long nro, String claveImpRed, BigDecimal porcImpRed, BigDecimal montoImpRed, BigDecimal montoImpOrg, BigDecimal porcImpOrg, Byte mesAnula, Short anoAnula, Date fechaAnula, String anuCom, BigDecimal subtotalRes, BigDecimal exentoRes, BigDecimal MOriginalRes, BigDecimal saldoRes, BigDecimal descuentoRes, BigDecimal totalRefRes, BigDecimal totalDbRes, BigDecimal totalCrRes, BigDecimal interesesRes, BigDecimal gravadoRes, BigDecimal totImpRes, BigDecimal totImpEspecialRes, BigDecimal totRetRes, BigDecimal totOtrosCargosRes, BigDecimal creditosAplicablesVtaRes, BigDecimal creditosAplicablesCobRes, BigDecimal ivaFinalRes, BigDecimal comisionTotalVtaRes, BigDecimal comisionPagadaVtaRes, BigDecimal comisionPagarVtaRes, BigDecimal comisionTotalCobranzaRes) {
       this.id = id;
       this.centro = centro;
       this.tipoDoc = tipoDoc;
       this.periodo = periodo;
       this.ruta = ruta;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.fecha = fecha;
       this.fechaVence = fechaVence;
       this.fechaVenceOriginal = fechaVenceOriginal;
       this.fechaDigitacion = fechaDigitacion;
       this.cantProrrogas = cantProrrogas;
       this.noAgente = noAgente;
       this.cobrador = cobrador;
       this.subtotal = subtotal;
       this.exento = exento;
       this.MOriginal = MOriginal;
       this.saldo = saldo;
       this.descuento = descuento;
       this.totalRef = totalRef;
       this.estado = estado;
       this.totalDb = totalDb;
       this.totalCr = totalCr;
       this.intereses = intereses;
       this.concepto = concepto;
       this.periLiq = periLiq;
       this.noLiq = noLiq;
       this.origen = origen;
       this.ano = ano;
       this.mes = mes;
       this.semana = semana;
       this.noFisico = noFisico;
       this.serieFisico = serieFisico;
       this.codEstado = codEstado;
       this.codEstadoNue = codEstadoNue;
       this.indEstadoVencido = indEstadoVencido;
       this.noDocuRefe = noDocuRefe;
       this.fechaDocumento = fechaDocumento;
       this.anulado = anulado;
       this.usuarioAnula = usuarioAnula;
       this.motivoAnula = motivoAnula;
       this.gravado = gravado;
       this.numeroCtrl = numeroCtrl;
       this.totImp = totImp;
       this.totImpEspecial = totImpEspecial;
       this.codDiario = codDiario;
       this.fechaGenCkDev = fechaGenCkDev;
       this.totRet = totRet;
       this.totOtrosCargos = totOtrosCargos;
       this.fechaCobrado = fechaCobrado;
       this.banco = banco;
       this.tipoFactura = tipoFactura;
       this.pagoComision = pagoComision;
       this.creditosAplicablesVta = creditosAplicablesVta;
       this.creditosAplicablesCob = creditosAplicablesCob;
       this.ivaFinal = ivaFinal;
       this.fechaCancelacion = fechaCancelacion;
       this.diasCancelacion = diasCancelacion;
       this.gracia = gracia;
       this.comisionTotalVta = comisionTotalVta;
       this.comisionPagadaVta = comisionPagadaVta;
       this.comisionPagarVta = comisionPagarVta;
       this.comisionTotalCobranza = comisionTotalCobranza;
       this.comisionPagadaCobranza = comisionPagadaCobranza;
       this.comisionPagarCobranza = comisionPagarCobranza;
       this.comisionXAcuerdo = comisionXAcuerdo;
       this.pagarComision = pagarComision;
       this.comisionVenta = comisionVenta;
       this.comisionCobranza = comisionCobranza;
       this.usuarioReg = usuarioReg;
       this.control = control;
       this.baseRet = baseRet;
       this.porcRet = porcRet;
       this.fchRet = fchRet;
       this.noComprobante = noComprobante;
       this.emision = emision;
       this.emisionFisico = emisionFisico;
       this.noRelacioncobro = noRelacioncobro;
       this.comisionPagada = comisionPagada;
       this.libCkd = libCkd;
       this.libDiv = libDiv;
       this.libSa = libSa;
       this.periodoComc = periodoComc;
       this.anoComc = anoComc;
       this.mesComc = mesComc;
       this.tempSald = tempSald;
       this.nro = nro;
       this.claveImpRed = claveImpRed;
       this.porcImpRed = porcImpRed;
       this.montoImpRed = montoImpRed;
       this.montoImpOrg = montoImpOrg;
       this.porcImpOrg = porcImpOrg;
       this.mesAnula = mesAnula;
       this.anoAnula = anoAnula;
       this.fechaAnula = fechaAnula;
       this.anuCom = anuCom;
       this.subtotalRes = subtotalRes;
       this.exentoRes = exentoRes;
       this.MOriginalRes = MOriginalRes;
       this.saldoRes = saldoRes;
       this.descuentoRes = descuentoRes;
       this.totalRefRes = totalRefRes;
       this.totalDbRes = totalDbRes;
       this.totalCrRes = totalCrRes;
       this.interesesRes = interesesRes;
       this.gravadoRes = gravadoRes;
       this.totImpRes = totImpRes;
       this.totImpEspecialRes = totImpEspecialRes;
       this.totRetRes = totRetRes;
       this.totOtrosCargosRes = totOtrosCargosRes;
       this.creditosAplicablesVtaRes = creditosAplicablesVtaRes;
       this.creditosAplicablesCobRes = creditosAplicablesCobRes;
       this.ivaFinalRes = ivaFinalRes;
       this.comisionTotalVtaRes = comisionTotalVtaRes;
       this.comisionPagadaVtaRes = comisionPagadaVtaRes;
       this.comisionPagarVtaRes = comisionPagarVtaRes;
       this.comisionTotalCobranzaRes = comisionTotalCobranzaRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noDocu", column=@Column(name="NO_DOCU", nullable=false, length=12) ) } )
    public ArccmdId getId() {
        return this.id;
    }
    
    public void setId(ArccmdId id) {
        this.id = id;
    }

    
    @Column(name="CENTRO", nullable=false, length=2)
    public String getCentro() {
        return this.centro;
    }
    
    public void setCentro(String centro) {
        this.centro = centro;
    }

    
    @Column(name="TIPO_DOC", nullable=false, length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    
    @Column(name="PERIODO", nullable=false, length=4)
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
    @Column(name="RUTA", nullable=false, length=4)
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
    @Column(name="GRUPO", nullable=false, length=2)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    @Column(name="NO_CLIENTE", nullable=false, length=15)
    public String getNoCliente() {
        return this.noCliente;
    }
    
    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCE", length=7)
    public Date getFechaVence() {
        return this.fechaVence;
    }
    
    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VENCE_ORIGINAL", length=7)
    public Date getFechaVenceOriginal() {
        return this.fechaVenceOriginal;
    }
    
    public void setFechaVenceOriginal(Date fechaVenceOriginal) {
        this.fechaVenceOriginal = fechaVenceOriginal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_DIGITACION", length=7)
    public Date getFechaDigitacion() {
        return this.fechaDigitacion;
    }
    
    public void setFechaDigitacion(Date fechaDigitacion) {
        this.fechaDigitacion = fechaDigitacion;
    }

    
    @Column(name="CANT_PRORROGAS", precision=2, scale=0)
    public Byte getCantProrrogas() {
        return this.cantProrrogas;
    }
    
    public void setCantProrrogas(Byte cantProrrogas) {
        this.cantProrrogas = cantProrrogas;
    }

    
    @Column(name="NO_AGENTE", length=4)
    public String getNoAgente() {
        return this.noAgente;
    }
    
    public void setNoAgente(String noAgente) {
        this.noAgente = noAgente;
    }

    
    @Column(name="COBRADOR", length=4)
    public String getCobrador() {
        return this.cobrador;
    }
    
    public void setCobrador(String cobrador) {
        this.cobrador = cobrador;
    }

    
    @Column(name="SUBTOTAL", precision=17)
    public BigDecimal getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    
    @Column(name="EXENTO", precision=17)
    public BigDecimal getExento() {
        return this.exento;
    }
    
    public void setExento(BigDecimal exento) {
        this.exento = exento;
    }

    
    @Column(name="M_ORIGINAL", precision=17)
    public BigDecimal getMOriginal() {
        return this.MOriginal;
    }
    
    public void setMOriginal(BigDecimal MOriginal) {
        this.MOriginal = MOriginal;
    }

    
    @Column(name="SALDO", precision=17)
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    
    @Column(name="DESCUENTO", precision=17)
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    
    @Column(name="TOTAL_REF", precision=17)
    public BigDecimal getTotalRef() {
        return this.totalRef;
    }
    
    public void setTotalRef(BigDecimal totalRef) {
        this.totalRef = totalRef;
    }

    
    @Column(name="ESTADO", nullable=false, length=1)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="TOTAL_DB", precision=17)
    public BigDecimal getTotalDb() {
        return this.totalDb;
    }
    
    public void setTotalDb(BigDecimal totalDb) {
        this.totalDb = totalDb;
    }

    
    @Column(name="TOTAL_CR", precision=17)
    public BigDecimal getTotalCr() {
        return this.totalCr;
    }
    
    public void setTotalCr(BigDecimal totalCr) {
        this.totalCr = totalCr;
    }

    
    @Column(name="INTERESES", precision=17)
    public BigDecimal getIntereses() {
        return this.intereses;
    }
    
    public void setIntereses(BigDecimal intereses) {
        this.intereses = intereses;
    }

    
    @Column(name="CONCEPTO", length=2)
    public String getConcepto() {
        return this.concepto;
    }
    
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    
    @Column(name="PERI_LIQ", length=4)
    public String getPeriLiq() {
        return this.periLiq;
    }
    
    public void setPeriLiq(String periLiq) {
        this.periLiq = periLiq;
    }

    
    @Column(name="NO_LIQ", length=6)
    public String getNoLiq() {
        return this.noLiq;
    }
    
    public void setNoLiq(String noLiq) {
        this.noLiq = noLiq;
    }

    
    @Column(name="ORIGEN", length=2)
    public String getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    
    @Column(name="ANO", precision=4, scale=0)
    public Short getAno() {
        return this.ano;
    }
    
    public void setAno(Short ano) {
        this.ano = ano;
    }

    
    @Column(name="MES", precision=2, scale=0)
    public Byte getMes() {
        return this.mes;
    }
    
    public void setMes(Byte mes) {
        this.mes = mes;
    }

    
    @Column(name="SEMANA", precision=2, scale=0)
    public Byte getSemana() {
        return this.semana;
    }
    
    public void setSemana(Byte semana) {
        this.semana = semana;
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

    
    @Column(name="COD_ESTADO", length=2)
    public String getCodEstado() {
        return this.codEstado;
    }
    
    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    
    @Column(name="COD_ESTADO_NUE", length=2)
    public String getCodEstadoNue() {
        return this.codEstadoNue;
    }
    
    public void setCodEstadoNue(String codEstadoNue) {
        this.codEstadoNue = codEstadoNue;
    }

    
    @Column(name="IND_ESTADO_VENCIDO", length=1)
    public String getIndEstadoVencido() {
        return this.indEstadoVencido;
    }
    
    public void setIndEstadoVencido(String indEstadoVencido) {
        this.indEstadoVencido = indEstadoVencido;
    }

    
    @Column(name="NO_DOCU_REFE", length=12)
    public String getNoDocuRefe() {
        return this.noDocuRefe;
    }
    
    public void setNoDocuRefe(String noDocuRefe) {
        this.noDocuRefe = noDocuRefe;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_DOCUMENTO", length=7)
    public Date getFechaDocumento() {
        return this.fechaDocumento;
    }
    
    public void setFechaDocumento(Date fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    
    @Column(name="ANULADO", length=1)
    public String getAnulado() {
        return this.anulado;
    }
    
    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    
    @Column(name="USUARIO_ANULA", length=30)
    public String getUsuarioAnula() {
        return this.usuarioAnula;
    }
    
    public void setUsuarioAnula(String usuarioAnula) {
        this.usuarioAnula = usuarioAnula;
    }

    
    @Column(name="MOTIVO_ANULA", length=500)
    public String getMotivoAnula() {
        return this.motivoAnula;
    }
    
    public void setMotivoAnula(String motivoAnula) {
        this.motivoAnula = motivoAnula;
    }

    
    @Column(name="GRAVADO", precision=17)
    public BigDecimal getGravado() {
        return this.gravado;
    }
    
    public void setGravado(BigDecimal gravado) {
        this.gravado = gravado;
    }

    
    @Column(name="NUMERO_CTRL", precision=10, scale=0)
    public Long getNumeroCtrl() {
        return this.numeroCtrl;
    }
    
    public void setNumeroCtrl(Long numeroCtrl) {
        this.numeroCtrl = numeroCtrl;
    }

    
    @Column(name="TOT_IMP", precision=17)
    public BigDecimal getTotImp() {
        return this.totImp;
    }
    
    public void setTotImp(BigDecimal totImp) {
        this.totImp = totImp;
    }

    
    @Column(name="TOT_IMP_ESPECIAL", precision=17)
    public BigDecimal getTotImpEspecial() {
        return this.totImpEspecial;
    }
    
    public void setTotImpEspecial(BigDecimal totImpEspecial) {
        this.totImpEspecial = totImpEspecial;
    }

    
    @Column(name="COD_DIARIO", length=5)
    public String getCodDiario() {
        return this.codDiario;
    }
    
    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_GEN_CK_DEV", length=7)
    public Date getFechaGenCkDev() {
        return this.fechaGenCkDev;
    }
    
    public void setFechaGenCkDev(Date fechaGenCkDev) {
        this.fechaGenCkDev = fechaGenCkDev;
    }

    
    @Column(name="TOT_RET", precision=17)
    public BigDecimal getTotRet() {
        return this.totRet;
    }
    
    public void setTotRet(BigDecimal totRet) {
        this.totRet = totRet;
    }

    
    @Column(name="TOT_OTROS_CARGOS", precision=17)
    public BigDecimal getTotOtrosCargos() {
        return this.totOtrosCargos;
    }
    
    public void setTotOtrosCargos(BigDecimal totOtrosCargos) {
        this.totOtrosCargos = totOtrosCargos;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_COBRADO", length=7)
    public Date getFechaCobrado() {
        return this.fechaCobrado;
    }
    
    public void setFechaCobrado(Date fechaCobrado) {
        this.fechaCobrado = fechaCobrado;
    }

    
    @Column(name="BANCO", length=2)
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }

    
    @Column(name="TIPO_FACTURA", length=1)
    public String getTipoFactura() {
        return this.tipoFactura;
    }
    
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    
    @Column(name="PAGO_COMISION", length=1)
    public String getPagoComision() {
        return this.pagoComision;
    }
    
    public void setPagoComision(String pagoComision) {
        this.pagoComision = pagoComision;
    }

    
    @Column(name="CREDITOS_APLICABLES_VTA", precision=17)
    public BigDecimal getCreditosAplicablesVta() {
        return this.creditosAplicablesVta;
    }
    
    public void setCreditosAplicablesVta(BigDecimal creditosAplicablesVta) {
        this.creditosAplicablesVta = creditosAplicablesVta;
    }

    
    @Column(name="CREDITOS_APLICABLES_COB", precision=17)
    public BigDecimal getCreditosAplicablesCob() {
        return this.creditosAplicablesCob;
    }
    
    public void setCreditosAplicablesCob(BigDecimal creditosAplicablesCob) {
        this.creditosAplicablesCob = creditosAplicablesCob;
    }

    
    @Column(name="IVA_FINAL", precision=12)
    public BigDecimal getIvaFinal() {
        return this.ivaFinal;
    }
    
    public void setIvaFinal(BigDecimal ivaFinal) {
        this.ivaFinal = ivaFinal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CANCELACION", length=7)
    public Date getFechaCancelacion() {
        return this.fechaCancelacion;
    }
    
    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    
    @Column(name="DIAS_CANCELACION", precision=4, scale=0)
    public Short getDiasCancelacion() {
        return this.diasCancelacion;
    }
    
    public void setDiasCancelacion(Short diasCancelacion) {
        this.diasCancelacion = diasCancelacion;
    }

    
    @Column(name="GRACIA", precision=4, scale=0)
    public Short getGracia() {
        return this.gracia;
    }
    
    public void setGracia(Short gracia) {
        this.gracia = gracia;
    }

    
    @Column(name="COMISION_TOTAL_VTA", precision=15)
    public BigDecimal getComisionTotalVta() {
        return this.comisionTotalVta;
    }
    
    public void setComisionTotalVta(BigDecimal comisionTotalVta) {
        this.comisionTotalVta = comisionTotalVta;
    }

    
    @Column(name="COMISION_PAGADA_VTA", precision=15)
    public BigDecimal getComisionPagadaVta() {
        return this.comisionPagadaVta;
    }
    
    public void setComisionPagadaVta(BigDecimal comisionPagadaVta) {
        this.comisionPagadaVta = comisionPagadaVta;
    }

    
    @Column(name="COMISION_PAGAR_VTA", precision=15)
    public BigDecimal getComisionPagarVta() {
        return this.comisionPagarVta;
    }
    
    public void setComisionPagarVta(BigDecimal comisionPagarVta) {
        this.comisionPagarVta = comisionPagarVta;
    }

    
    @Column(name="COMISION_TOTAL_COBRANZA", precision=15)
    public BigDecimal getComisionTotalCobranza() {
        return this.comisionTotalCobranza;
    }
    
    public void setComisionTotalCobranza(BigDecimal comisionTotalCobranza) {
        this.comisionTotalCobranza = comisionTotalCobranza;
    }

    
    @Column(name="COMISION_PAGADA_COBRANZA", precision=15)
    public BigDecimal getComisionPagadaCobranza() {
        return this.comisionPagadaCobranza;
    }
    
    public void setComisionPagadaCobranza(BigDecimal comisionPagadaCobranza) {
        this.comisionPagadaCobranza = comisionPagadaCobranza;
    }

    
    @Column(name="COMISION_PAGAR_COBRANZA", precision=15)
    public BigDecimal getComisionPagarCobranza() {
        return this.comisionPagarCobranza;
    }
    
    public void setComisionPagarCobranza(BigDecimal comisionPagarCobranza) {
        this.comisionPagarCobranza = comisionPagarCobranza;
    }

    
    @Column(name="COMISION_X_ACUERDO", length=1)
    public String getComisionXAcuerdo() {
        return this.comisionXAcuerdo;
    }
    
    public void setComisionXAcuerdo(String comisionXAcuerdo) {
        this.comisionXAcuerdo = comisionXAcuerdo;
    }

    
    @Column(name="PAGAR_COMISION", length=1)
    public String getPagarComision() {
        return this.pagarComision;
    }
    
    public void setPagarComision(String pagarComision) {
        this.pagarComision = pagarComision;
    }

    
    @Column(name="COMISION_VENTA", precision=15)
    public BigDecimal getComisionVenta() {
        return this.comisionVenta;
    }
    
    public void setComisionVenta(BigDecimal comisionVenta) {
        this.comisionVenta = comisionVenta;
    }

    
    @Column(name="COMISION_COBRANZA", precision=15)
    public BigDecimal getComisionCobranza() {
        return this.comisionCobranza;
    }
    
    public void setComisionCobranza(BigDecimal comisionCobranza) {
        this.comisionCobranza = comisionCobranza;
    }

    
    @Column(name="USUARIO_REG", length=40)
    public String getUsuarioReg() {
        return this.usuarioReg;
    }
    
    public void setUsuarioReg(String usuarioReg) {
        this.usuarioReg = usuarioReg;
    }

    
    @Column(name="CONTROL", length=20)
    public String getControl() {
        return this.control;
    }
    
    public void setControl(String control) {
        this.control = control;
    }

    
    @Column(name="BASE_RET", precision=17)
    public BigDecimal getBaseRet() {
        return this.baseRet;
    }
    
    public void setBaseRet(BigDecimal baseRet) {
        this.baseRet = baseRet;
    }

    
    @Column(name="PORC_RET", precision=17)
    public BigDecimal getPorcRet() {
        return this.porcRet;
    }
    
    public void setPorcRet(BigDecimal porcRet) {
        this.porcRet = porcRet;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FCH_RET", length=7)
    public Date getFchRet() {
        return this.fchRet;
    }
    
    public void setFchRet(Date fchRet) {
        this.fchRet = fchRet;
    }

    
    @Column(name="NO_COMPROBANTE", length=30)
    public String getNoComprobante() {
        return this.noComprobante;
    }
    
    public void setNoComprobante(String noComprobante) {
        this.noComprobante = noComprobante;
    }

    
    @Column(name="EMISION", precision=17)
    public BigDecimal getEmision() {
        return this.emision;
    }
    
    public void setEmision(BigDecimal emision) {
        this.emision = emision;
    }

    
    @Column(name="EMISION_FISICO", precision=17)
    public BigDecimal getEmisionFisico() {
        return this.emisionFisico;
    }
    
    public void setEmisionFisico(BigDecimal emisionFisico) {
        this.emisionFisico = emisionFisico;
    }

    
    @Column(name="NO_RELACIONCOBRO", length=30)
    public String getNoRelacioncobro() {
        return this.noRelacioncobro;
    }
    
    public void setNoRelacioncobro(String noRelacioncobro) {
        this.noRelacioncobro = noRelacioncobro;
    }

    
    @Column(name="COMISION_PAGADA", precision=17)
    public BigDecimal getComisionPagada() {
        return this.comisionPagada;
    }
    
    public void setComisionPagada(BigDecimal comisionPagada) {
        this.comisionPagada = comisionPagada;
    }

    
    @Column(name="LIB_CKD", length=1)
    public String getLibCkd() {
        return this.libCkd;
    }
    
    public void setLibCkd(String libCkd) {
        this.libCkd = libCkd;
    }

    
    @Column(name="LIB_DIV", length=1)
    public String getLibDiv() {
        return this.libDiv;
    }
    
    public void setLibDiv(String libDiv) {
        this.libDiv = libDiv;
    }

    
    @Column(name="LIB_SA", length=1)
    public String getLibSa() {
        return this.libSa;
    }
    
    public void setLibSa(String libSa) {
        this.libSa = libSa;
    }

    
    @Column(name="PERIODO_COMC", precision=6, scale=0)
    public Integer getPeriodoComc() {
        return this.periodoComc;
    }
    
    public void setPeriodoComc(Integer periodoComc) {
        this.periodoComc = periodoComc;
    }

    
    @Column(name="ANO_COMC", precision=4, scale=0)
    public Short getAnoComc() {
        return this.anoComc;
    }
    
    public void setAnoComc(Short anoComc) {
        this.anoComc = anoComc;
    }

    
    @Column(name="MES_COMC", precision=2, scale=0)
    public Byte getMesComc() {
        return this.mesComc;
    }
    
    public void setMesComc(Byte mesComc) {
        this.mesComc = mesComc;
    }

    
    @Column(name="TEMP_SALD", precision=17)
    public BigDecimal getTempSald() {
        return this.tempSald;
    }
    
    public void setTempSald(BigDecimal tempSald) {
        this.tempSald = tempSald;
    }

    
    @Column(name="NRO", precision=17, scale=0)
    public Long getNro() {
        return this.nro;
    }
    
    public void setNro(Long nro) {
        this.nro = nro;
    }

    
    @Column(name="CLAVE_IMP_RED", length=2)
    public String getClaveImpRed() {
        return this.claveImpRed;
    }
    
    public void setClaveImpRed(String claveImpRed) {
        this.claveImpRed = claveImpRed;
    }

    
    @Column(name="PORC_IMP_RED", precision=4)
    public BigDecimal getPorcImpRed() {
        return this.porcImpRed;
    }
    
    public void setPorcImpRed(BigDecimal porcImpRed) {
        this.porcImpRed = porcImpRed;
    }

    
    @Column(name="MONTO_IMP_RED", precision=17)
    public BigDecimal getMontoImpRed() {
        return this.montoImpRed;
    }
    
    public void setMontoImpRed(BigDecimal montoImpRed) {
        this.montoImpRed = montoImpRed;
    }

    
    @Column(name="MONTO_IMP_ORG", precision=17)
    public BigDecimal getMontoImpOrg() {
        return this.montoImpOrg;
    }
    
    public void setMontoImpOrg(BigDecimal montoImpOrg) {
        this.montoImpOrg = montoImpOrg;
    }

    
    @Column(name="PORC_IMP_ORG", precision=4)
    public BigDecimal getPorcImpOrg() {
        return this.porcImpOrg;
    }
    
    public void setPorcImpOrg(BigDecimal porcImpOrg) {
        this.porcImpOrg = porcImpOrg;
    }

    
    @Column(name="MES_ANULA", precision=2, scale=0)
    public Byte getMesAnula() {
        return this.mesAnula;
    }
    
    public void setMesAnula(Byte mesAnula) {
        this.mesAnula = mesAnula;
    }

    
    @Column(name="ANO_ANULA", precision=4, scale=0)
    public Short getAnoAnula() {
        return this.anoAnula;
    }
    
    public void setAnoAnula(Short anoAnula) {
        this.anoAnula = anoAnula;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_ANULA", length=7)
    public Date getFechaAnula() {
        return this.fechaAnula;
    }
    
    public void setFechaAnula(Date fechaAnula) {
        this.fechaAnula = fechaAnula;
    }

    
    @Column(name="ANU_COM", length=1)
    public String getAnuCom() {
        return this.anuCom;
    }
    
    public void setAnuCom(String anuCom) {
        this.anuCom = anuCom;
    }

    
    @Column(name="SUBTOTAL_RES", precision=30)
    public BigDecimal getSubtotalRes() {
        return this.subtotalRes;
    }
    
    public void setSubtotalRes(BigDecimal subtotalRes) {
        this.subtotalRes = subtotalRes;
    }

    
    @Column(name="EXENTO_RES", precision=30)
    public BigDecimal getExentoRes() {
        return this.exentoRes;
    }
    
    public void setExentoRes(BigDecimal exentoRes) {
        this.exentoRes = exentoRes;
    }

    
    @Column(name="M_ORIGINAL_RES", precision=30)
    public BigDecimal getMOriginalRes() {
        return this.MOriginalRes;
    }
    
    public void setMOriginalRes(BigDecimal MOriginalRes) {
        this.MOriginalRes = MOriginalRes;
    }

    
    @Column(name="SALDO_RES", precision=30)
    public BigDecimal getSaldoRes() {
        return this.saldoRes;
    }
    
    public void setSaldoRes(BigDecimal saldoRes) {
        this.saldoRes = saldoRes;
    }

    
    @Column(name="DESCUENTO_RES", precision=30)
    public BigDecimal getDescuentoRes() {
        return this.descuentoRes;
    }
    
    public void setDescuentoRes(BigDecimal descuentoRes) {
        this.descuentoRes = descuentoRes;
    }

    
    @Column(name="TOTAL_REF_RES", precision=30)
    public BigDecimal getTotalRefRes() {
        return this.totalRefRes;
    }
    
    public void setTotalRefRes(BigDecimal totalRefRes) {
        this.totalRefRes = totalRefRes;
    }

    
    @Column(name="TOTAL_DB_RES", precision=30)
    public BigDecimal getTotalDbRes() {
        return this.totalDbRes;
    }
    
    public void setTotalDbRes(BigDecimal totalDbRes) {
        this.totalDbRes = totalDbRes;
    }

    
    @Column(name="TOTAL_CR_RES", precision=30)
    public BigDecimal getTotalCrRes() {
        return this.totalCrRes;
    }
    
    public void setTotalCrRes(BigDecimal totalCrRes) {
        this.totalCrRes = totalCrRes;
    }

    
    @Column(name="INTERESES_RES", precision=30)
    public BigDecimal getInteresesRes() {
        return this.interesesRes;
    }
    
    public void setInteresesRes(BigDecimal interesesRes) {
        this.interesesRes = interesesRes;
    }

    
    @Column(name="GRAVADO_RES", precision=30)
    public BigDecimal getGravadoRes() {
        return this.gravadoRes;
    }
    
    public void setGravadoRes(BigDecimal gravadoRes) {
        this.gravadoRes = gravadoRes;
    }

    
    @Column(name="TOT_IMP_RES", precision=30)
    public BigDecimal getTotImpRes() {
        return this.totImpRes;
    }
    
    public void setTotImpRes(BigDecimal totImpRes) {
        this.totImpRes = totImpRes;
    }

    
    @Column(name="TOT_IMP_ESPECIAL_RES", precision=30)
    public BigDecimal getTotImpEspecialRes() {
        return this.totImpEspecialRes;
    }
    
    public void setTotImpEspecialRes(BigDecimal totImpEspecialRes) {
        this.totImpEspecialRes = totImpEspecialRes;
    }

    
    @Column(name="TOT_RET_RES", precision=30)
    public BigDecimal getTotRetRes() {
        return this.totRetRes;
    }
    
    public void setTotRetRes(BigDecimal totRetRes) {
        this.totRetRes = totRetRes;
    }

    
    @Column(name="TOT_OTROS_CARGOS_RES", precision=30)
    public BigDecimal getTotOtrosCargosRes() {
        return this.totOtrosCargosRes;
    }
    
    public void setTotOtrosCargosRes(BigDecimal totOtrosCargosRes) {
        this.totOtrosCargosRes = totOtrosCargosRes;
    }

    
    @Column(name="CREDITOS_APLICABLES_VTA_RES", precision=30)
    public BigDecimal getCreditosAplicablesVtaRes() {
        return this.creditosAplicablesVtaRes;
    }
    
    public void setCreditosAplicablesVtaRes(BigDecimal creditosAplicablesVtaRes) {
        this.creditosAplicablesVtaRes = creditosAplicablesVtaRes;
    }

    
    @Column(name="CREDITOS_APLICABLES_COB_RES", precision=30)
    public BigDecimal getCreditosAplicablesCobRes() {
        return this.creditosAplicablesCobRes;
    }
    
    public void setCreditosAplicablesCobRes(BigDecimal creditosAplicablesCobRes) {
        this.creditosAplicablesCobRes = creditosAplicablesCobRes;
    }

    
    @Column(name="IVA_FINAL_RES", precision=30)
    public BigDecimal getIvaFinalRes() {
        return this.ivaFinalRes;
    }
    
    public void setIvaFinalRes(BigDecimal ivaFinalRes) {
        this.ivaFinalRes = ivaFinalRes;
    }

    
    @Column(name="COMISION_TOTAL_VTA_RES", precision=15)
    public BigDecimal getComisionTotalVtaRes() {
        return this.comisionTotalVtaRes;
    }
    
    public void setComisionTotalVtaRes(BigDecimal comisionTotalVtaRes) {
        this.comisionTotalVtaRes = comisionTotalVtaRes;
    }

    
    @Column(name="COMISION_PAGADA_VTA_RES", precision=15)
    public BigDecimal getComisionPagadaVtaRes() {
        return this.comisionPagadaVtaRes;
    }
    
    public void setComisionPagadaVtaRes(BigDecimal comisionPagadaVtaRes) {
        this.comisionPagadaVtaRes = comisionPagadaVtaRes;
    }

    
    @Column(name="COMISION_PAGAR_VTA_RES", precision=15)
    public BigDecimal getComisionPagarVtaRes() {
        return this.comisionPagarVtaRes;
    }
    
    public void setComisionPagarVtaRes(BigDecimal comisionPagarVtaRes) {
        this.comisionPagarVtaRes = comisionPagarVtaRes;
    }

    
    @Column(name="COMISION_TOTAL_COBRANZA_RES", precision=15)
    public BigDecimal getComisionTotalCobranzaRes() {
        return this.comisionTotalCobranzaRes;
    }
    
    public void setComisionTotalCobranzaRes(BigDecimal comisionTotalCobranzaRes) {
        this.comisionTotalCobranzaRes = comisionTotalCobranzaRes;
    }




}


