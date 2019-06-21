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
 * Arfafech generated by hbm2java
 */
@Entity
@Table(name="ARFAFECH"
    ,schema="DESA46"
)
public class Arfafech  implements java.io.Serializable {


     private ArfafechId id;
     private String centrod;
     private String periodo;
     private String ruta;
     private String afectaSaldo;
     private String grupo;
     private String noCliente;
     private String tipoCliente;
     private String nbrCliente;
     private String direccion;
     private Date fecha;
     private String noVendedor;
     private String NFactuD;
     private Short plazo;
     private Short entregar;
     private String observ1;
     private String observ2;
     private String observ3;
     private String moneda;
     private BigDecimal totLin;
     private BigDecimal subTotal;
     private BigDecimal descuento;
     private BigDecimal impuesto;
     private BigDecimal total;
     private String estado;
     private Date FUltEstado;
     private String aprobado;
     private String indAnuDev;
     private String impSino;
     private String tipoFactura;
     private String periLiq;
     private String noLiq;
     private String razon;
     private BigDecimal porcDesc;
     private String notaPedido;
     private String pedidoAprobado;
     private Long numeroCtrl;
     private String tipoProducto;

    public Arfafech() {
    }

	
    public Arfafech(ArfafechId id) {
        this.id = id;
    }
    public Arfafech(ArfafechId id, String centrod, String periodo, String ruta, String afectaSaldo, String grupo, String noCliente, String tipoCliente, String nbrCliente, String direccion, Date fecha, String noVendedor, String NFactuD, Short plazo, Short entregar, String observ1, String observ2, String observ3, String moneda, BigDecimal totLin, BigDecimal subTotal, BigDecimal descuento, BigDecimal impuesto, BigDecimal total, String estado, Date FUltEstado, String aprobado, String indAnuDev, String impSino, String tipoFactura, String periLiq, String noLiq, String razon, BigDecimal porcDesc, String notaPedido, String pedidoAprobado, Long numeroCtrl, String tipoProducto) {
       this.id = id;
       this.centrod = centrod;
       this.periodo = periodo;
       this.ruta = ruta;
       this.afectaSaldo = afectaSaldo;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.tipoCliente = tipoCliente;
       this.nbrCliente = nbrCliente;
       this.direccion = direccion;
       this.fecha = fecha;
       this.noVendedor = noVendedor;
       this.NFactuD = NFactuD;
       this.plazo = plazo;
       this.entregar = entregar;
       this.observ1 = observ1;
       this.observ2 = observ2;
       this.observ3 = observ3;
       this.moneda = moneda;
       this.totLin = totLin;
       this.subTotal = subTotal;
       this.descuento = descuento;
       this.impuesto = impuesto;
       this.total = total;
       this.estado = estado;
       this.FUltEstado = FUltEstado;
       this.aprobado = aprobado;
       this.indAnuDev = indAnuDev;
       this.impSino = impSino;
       this.tipoFactura = tipoFactura;
       this.periLiq = periLiq;
       this.noLiq = noLiq;
       this.razon = razon;
       this.porcDesc = porcDesc;
       this.notaPedido = notaPedido;
       this.pedidoAprobado = pedidoAprobado;
       this.numeroCtrl = numeroCtrl;
       this.tipoProducto = tipoProducto;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", length=2) ), 
        @AttributeOverride(name="noFactu", column=@Column(name="NO_FACTU", length=19) ) } )
    public ArfafechId getId() {
        return this.id;
    }
    
    public void setId(ArfafechId id) {
        this.id = id;
    }

    
    @Column(name="CENTROD", length=2)
    public String getCentrod() {
        return this.centrod;
    }
    
    public void setCentrod(String centrod) {
        this.centrod = centrod;
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

    
    @Column(name="DIRECCION", length=80)
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

    
    @Column(name="NO_VENDEDOR", length=4)
    public String getNoVendedor() {
        return this.noVendedor;
    }
    
    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    
    @Column(name="N_FACTU_D", length=19)
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

    
    @Column(name="ENTREGAR", precision=3, scale=0)
    public Short getEntregar() {
        return this.entregar;
    }
    
    public void setEntregar(Short entregar) {
        this.entregar = entregar;
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

    
    @Column(name="MONEDA", length=1)
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    @Temporal(TemporalType.DATE)
    @Column(name="F_ULT_ESTADO", length=7)
    public Date getFUltEstado() {
        return this.FUltEstado;
    }
    
    public void setFUltEstado(Date FUltEstado) {
        this.FUltEstado = FUltEstado;
    }

    
    @Column(name="APROBADO", length=1)
    public String getAprobado() {
        return this.aprobado;
    }
    
    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
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

    
    @Column(name="NOTA_PEDIDO", length=8)
    public String getNotaPedido() {
        return this.notaPedido;
    }
    
    public void setNotaPedido(String notaPedido) {
        this.notaPedido = notaPedido;
    }

    
    @Column(name="PEDIDO_APROBADO", length=1)
    public String getPedidoAprobado() {
        return this.pedidoAprobado;
    }
    
    public void setPedidoAprobado(String pedidoAprobado) {
        this.pedidoAprobado = pedidoAprobado;
    }

    
    @Column(name="NUMERO_CTRL", precision=10, scale=0)
    public Long getNumeroCtrl() {
        return this.numeroCtrl;
    }
    
    public void setNumeroCtrl(Long numeroCtrl) {
        this.numeroCtrl = numeroCtrl;
    }

    
    @Column(name="TIPO_PRODUCTO", length=3)
    public String getTipoProducto() {
        return this.tipoProducto;
    }
    
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }




}

