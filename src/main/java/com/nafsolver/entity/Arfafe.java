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
 * Arfafe generated by hbm2java
 */
@Entity
@Table(name="ARFAFE"
    ,schema="DESA46"
)
public class Arfafe  implements java.io.Serializable {


     private ArfafeId id;
     private String centrod;
     private String tipoDoc;
     private String periodo;
     private String ruta;
     private String afectaSaldo;
     private String grupo;
     private String noCliente;
     private String tipoCliente;
     private String nbrCliente;
     private String direccion;
     private Date fecha;
     private BigDecimal tipoCambio;
     private String noVendedor;
     private String tipoDocD;
     private String periodoD;
     private String rutaD;
     private String NFactuD;
     private Short plazo;
     private String observ1;
     private String observ2;
     private String observ3;
     private BigDecimal totLin;
     private BigDecimal subTotal;
     private BigDecimal descuento;
     private BigDecimal impuesto;
     private BigDecimal total;
     private String estado;
     private String indAnuDev;
     private String impSino;
     private String tipoFactura;
     private String periLiq;
     private String noLiq;
     private String periPed;
     private String noPedido;
     private String razon;
     private BigDecimal porcDesc;
     private String noFisico;
     private String serieFisico;
     private String moneda;
     private Long numeroCtrl;
     private String origen;
     private String indApartado;
     private String indVentaExonerada;
     private String tipoProducto;
     private Date hora;
     private String pedidoFeria;
     private Long codDesp;
     private String codMotivo;
     private String formaPago;
     private String claveImpRed;
     private BigDecimal porcImpRed;
     private BigDecimal montoImpRed;
     private BigDecimal montoImpOrg;
     private BigDecimal porcImpOrg;
     private String formatoServ;
     private BigDecimal totLinRes;
     private BigDecimal subTotalRes;
     private BigDecimal descuentoRes;
     private BigDecimal impuestoRes;
     private BigDecimal totalRes;

    public Arfafe() {
    }

	
    public Arfafe(ArfafeId id) {
        this.id = id;
    }
    public Arfafe(ArfafeId id, String centrod, String tipoDoc, String periodo, String ruta, String afectaSaldo, String grupo, String noCliente, String tipoCliente, String nbrCliente, String direccion, Date fecha, BigDecimal tipoCambio, String noVendedor, String tipoDocD, String periodoD, String rutaD, String NFactuD, Short plazo, String observ1, String observ2, String observ3, BigDecimal totLin, BigDecimal subTotal, BigDecimal descuento, BigDecimal impuesto, BigDecimal total, String estado, String indAnuDev, String impSino, String tipoFactura, String periLiq, String noLiq, String periPed, String noPedido, String razon, BigDecimal porcDesc, String noFisico, String serieFisico, String moneda, Long numeroCtrl, String origen, String indApartado, String indVentaExonerada, String tipoProducto, Date hora, String pedidoFeria, Long codDesp, String codMotivo, String formaPago, String claveImpRed, BigDecimal porcImpRed, BigDecimal montoImpRed, BigDecimal montoImpOrg, BigDecimal porcImpOrg, String formatoServ, BigDecimal totLinRes, BigDecimal subTotalRes, BigDecimal descuentoRes, BigDecimal impuestoRes, BigDecimal totalRes) {
       this.id = id;
       this.centrod = centrod;
       this.tipoDoc = tipoDoc;
       this.periodo = periodo;
       this.ruta = ruta;
       this.afectaSaldo = afectaSaldo;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.tipoCliente = tipoCliente;
       this.nbrCliente = nbrCliente;
       this.direccion = direccion;
       this.fecha = fecha;
       this.tipoCambio = tipoCambio;
       this.noVendedor = noVendedor;
       this.tipoDocD = tipoDocD;
       this.periodoD = periodoD;
       this.rutaD = rutaD;
       this.NFactuD = NFactuD;
       this.plazo = plazo;
       this.observ1 = observ1;
       this.observ2 = observ2;
       this.observ3 = observ3;
       this.totLin = totLin;
       this.subTotal = subTotal;
       this.descuento = descuento;
       this.impuesto = impuesto;
       this.total = total;
       this.estado = estado;
       this.indAnuDev = indAnuDev;
       this.impSino = impSino;
       this.tipoFactura = tipoFactura;
       this.periLiq = periLiq;
       this.noLiq = noLiq;
       this.periPed = periPed;
       this.noPedido = noPedido;
       this.razon = razon;
       this.porcDesc = porcDesc;
       this.noFisico = noFisico;
       this.serieFisico = serieFisico;
       this.moneda = moneda;
       this.numeroCtrl = numeroCtrl;
       this.origen = origen;
       this.indApartado = indApartado;
       this.indVentaExonerada = indVentaExonerada;
       this.tipoProducto = tipoProducto;
       this.hora = hora;
       this.pedidoFeria = pedidoFeria;
       this.codDesp = codDesp;
       this.codMotivo = codMotivo;
       this.formaPago = formaPago;
       this.claveImpRed = claveImpRed;
       this.porcImpRed = porcImpRed;
       this.montoImpRed = montoImpRed;
       this.montoImpOrg = montoImpOrg;
       this.porcImpOrg = porcImpOrg;
       this.formatoServ = formatoServ;
       this.totLinRes = totLinRes;
       this.subTotalRes = subTotalRes;
       this.descuentoRes = descuentoRes;
       this.impuestoRes = impuestoRes;
       this.totalRes = totalRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noFactu", column=@Column(name="NO_FACTU", nullable=false, length=12) ) } )
    public ArfafeId getId() {
        return this.id;
    }
    
    public void setId(ArfafeId id) {
        this.id = id;
    }

    
    @Column(name="CENTROD", length=2)
    public String getCentrod() {
        return this.centrod;
    }
    
    public void setCentrod(String centrod) {
        this.centrod = centrod;
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

    
    @Column(name="AFECTA_SALDO", length=1)
    public String getAfectaSaldo() {
        return this.afectaSaldo;
    }
    
    public void setAfectaSaldo(String afectaSaldo) {
        this.afectaSaldo = afectaSaldo;
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

    
    @Column(name="TIPO_CLIENTE", length=2)
    public String getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    
    @Column(name="NBR_CLIENTE", length=80)
    public String getNbrCliente() {
        return this.nbrCliente;
    }
    
    public void setNbrCliente(String nbrCliente) {
        this.nbrCliente = nbrCliente;
    }

    
    @Column(name="DIRECCION", length=500)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="TIPO_CAMBIO", precision=17, scale=4)
    public BigDecimal getTipoCambio() {
        return this.tipoCambio;
    }
    
    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    
    @Column(name="NO_VENDEDOR", length=4)
    public String getNoVendedor() {
        return this.noVendedor;
    }
    
    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    
    @Column(name="TIPO_DOC_D", length=2)
    public String getTipoDocD() {
        return this.tipoDocD;
    }
    
    public void setTipoDocD(String tipoDocD) {
        this.tipoDocD = tipoDocD;
    }

    
    @Column(name="PERIODO_D", length=4)
    public String getPeriodoD() {
        return this.periodoD;
    }
    
    public void setPeriodoD(String periodoD) {
        this.periodoD = periodoD;
    }

    
    @Column(name="RUTA_D", length=4)
    public String getRutaD() {
        return this.rutaD;
    }
    
    public void setRutaD(String rutaD) {
        this.rutaD = rutaD;
    }

    
    @Column(name="N_FACTU_D", length=15)
    public String getNFactuD() {
        return this.NFactuD;
    }
    
    public void setNFactuD(String NFactuD) {
        this.NFactuD = NFactuD;
    }

    
    @Column(name="PLAZO", precision=3, scale=0)
    public Short getPlazo() {
        return this.plazo;
    }
    
    public void setPlazo(Short plazo) {
        this.plazo = plazo;
    }

    
    @Column(name="OBSERV1", length=60)
    public String getObserv1() {
        return this.observ1;
    }
    
    public void setObserv1(String observ1) {
        this.observ1 = observ1;
    }

    
    @Column(name="OBSERV2", length=60)
    public String getObserv2() {
        return this.observ2;
    }
    
    public void setObserv2(String observ2) {
        this.observ2 = observ2;
    }

    
    @Column(name="OBSERV3", length=60)
    public String getObserv3() {
        return this.observ3;
    }
    
    public void setObserv3(String observ3) {
        this.observ3 = observ3;
    }

    
    @Column(name="TOT_LIN", precision=17)
    public BigDecimal getTotLin() {
        return this.totLin;
    }
    
    public void setTotLin(BigDecimal totLin) {
        this.totLin = totLin;
    }

    
    @Column(name="SUB_TOTAL", precision=17)
    public BigDecimal getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    
    @Column(name="DESCUENTO", precision=17)
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    
    @Column(name="IMPUESTO", precision=17)
    public BigDecimal getImpuesto() {
        return this.impuesto;
    }
    
    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    
    @Column(name="TOTAL", precision=17)
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
    @Column(name="ESTADO", length=1)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    @Column(name="IND_ANU_DEV", length=1)
    public String getIndAnuDev() {
        return this.indAnuDev;
    }
    
    public void setIndAnuDev(String indAnuDev) {
        this.indAnuDev = indAnuDev;
    }

    
    @Column(name="IMP_SINO", length=1)
    public String getImpSino() {
        return this.impSino;
    }
    
    public void setImpSino(String impSino) {
        this.impSino = impSino;
    }

    
    @Column(name="TIPO_FACTURA", length=1)
    public String getTipoFactura() {
        return this.tipoFactura;
    }
    
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
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

    
    @Column(name="PERI_PED", length=4)
    public String getPeriPed() {
        return this.periPed;
    }
    
    public void setPeriPed(String periPed) {
        this.periPed = periPed;
    }

    
    @Column(name="NO_PEDIDO", length=19)
    public String getNoPedido() {
        return this.noPedido;
    }
    
    public void setNoPedido(String noPedido) {
        this.noPedido = noPedido;
    }

    
    @Column(name="RAZON", length=2)
    public String getRazon() {
        return this.razon;
    }
    
    public void setRazon(String razon) {
        this.razon = razon;
    }

    
    @Column(name="PORC_DESC", precision=5)
    public BigDecimal getPorcDesc() {
        return this.porcDesc;
    }
    
    public void setPorcDesc(BigDecimal porcDesc) {
        this.porcDesc = porcDesc;
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

    
    @Column(name="MONEDA", length=1)
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    
    @Column(name="NUMERO_CTRL", precision=10, scale=0)
    public Long getNumeroCtrl() {
        return this.numeroCtrl;
    }
    
    public void setNumeroCtrl(Long numeroCtrl) {
        this.numeroCtrl = numeroCtrl;
    }

    
    @Column(name="ORIGEN", length=2)
    public String getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    
    @Column(name="IND_APARTADO", length=1)
    public String getIndApartado() {
        return this.indApartado;
    }
    
    public void setIndApartado(String indApartado) {
        this.indApartado = indApartado;
    }

    
    @Column(name="IND_VENTA_EXONERADA", length=1)
    public String getIndVentaExonerada() {
        return this.indVentaExonerada;
    }
    
    public void setIndVentaExonerada(String indVentaExonerada) {
        this.indVentaExonerada = indVentaExonerada;
    }

    
    @Column(name="TIPO_PRODUCTO", length=3)
    public String getTipoProducto() {
        return this.tipoProducto;
    }
    
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="HORA", length=7)
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }

    
    @Column(name="PEDIDO_FERIA", length=1)
    public String getPedidoFeria() {
        return this.pedidoFeria;
    }
    
    public void setPedidoFeria(String pedidoFeria) {
        this.pedidoFeria = pedidoFeria;
    }

    
    @Column(name="COD_DESP", precision=15, scale=0)
    public Long getCodDesp() {
        return this.codDesp;
    }
    
    public void setCodDesp(Long codDesp) {
        this.codDesp = codDesp;
    }

    
    @Column(name="COD_MOTIVO", length=4)
    public String getCodMotivo() {
        return this.codMotivo;
    }
    
    public void setCodMotivo(String codMotivo) {
        this.codMotivo = codMotivo;
    }

    
    @Column(name="FORMA_PAGO", length=100)
    public String getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
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

    
    @Column(name="FORMATO_SERV", length=1)
    public String getFormatoServ() {
        return this.formatoServ;
    }
    
    public void setFormatoServ(String formatoServ) {
        this.formatoServ = formatoServ;
    }

    
    @Column(name="TOT_LIN_RES", precision=30)
    public BigDecimal getTotLinRes() {
        return this.totLinRes;
    }
    
    public void setTotLinRes(BigDecimal totLinRes) {
        this.totLinRes = totLinRes;
    }

    
    @Column(name="SUB_TOTAL_RES", precision=30)
    public BigDecimal getSubTotalRes() {
        return this.subTotalRes;
    }
    
    public void setSubTotalRes(BigDecimal subTotalRes) {
        this.subTotalRes = subTotalRes;
    }

    
    @Column(name="DESCUENTO_RES", precision=30)
    public BigDecimal getDescuentoRes() {
        return this.descuentoRes;
    }
    
    public void setDescuentoRes(BigDecimal descuentoRes) {
        this.descuentoRes = descuentoRes;
    }

    
    @Column(name="IMPUESTO_RES", precision=30)
    public BigDecimal getImpuestoRes() {
        return this.impuestoRes;
    }
    
    public void setImpuestoRes(BigDecimal impuestoRes) {
        this.impuestoRes = impuestoRes;
    }

    
    @Column(name="TOTAL_RES", precision=30)
    public BigDecimal getTotalRes() {
        return this.totalRes;
    }
    
    public void setTotalRes(BigDecimal totalRes) {
        this.totalRes = totalRes;
    }




}


