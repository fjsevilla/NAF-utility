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
 * Arinda generated by hbm2java
 */
@Entity
@Table(name="ARINDA"
    ,schema="DESA46"
)
public class Arinda  implements java.io.Serializable {


     private ArindaId id;
     private String descripcion;
     private String unidad;
     private BigDecimal peso;
     private Short tiempoRep;
     private String codigo;
     private BigDecimal transito;
     private String upc;
     private String marca;
     private String grupo;
     private BigDecimal maximo;
     private BigDecimal minimo;
     private BigDecimal reorden;
     private String monedaPreciobase;
     private BigDecimal preciobase;
     private BigDecimal precionuevo;
     private String monedaPrecionuevo;
     private String impVen;
     private String fabricacion;
     private String promoapp;
     private String discExc;
     private String conttype;
     private String indLote;
     private String indActivo;
     private Short graciaVencer;
     private BigDecimal costoNuevo;
     private BigDecimal costoEstandar;
     private String aplicaImpuesto;
     private String descripcionAlterna;
     private String masterPack;
     private String innerPack;
     private BigDecimal precioCd;
     private Integer pagCatalogo;
     private String controlaPermisos;
     private String permisoAprobado;
     private String statusCd;
     private String noProve;
     private String indImprimeGarantia;
     private String indRequiereSerie;
     private String indEsParaOferta;
     private Date tstamp;
     private Short garantia;
     private String curvaDefault;
     private String ccolor;
     private String cmodelo;
     private String catalogo;
     private String itunesbusiness;
     private String tipoM;
     private Long correlativoTipo;
     private BigDecimal preciobaseRes;
     private BigDecimal precionuevoRes;
     private BigDecimal costoNuevoRes;
     private BigDecimal costoEstandarRes;

    public Arinda() {
    }

	
    public Arinda(ArindaId id) {
        this.id = id;
    }
    public Arinda(ArindaId id, String descripcion, String unidad, BigDecimal peso, Short tiempoRep, String codigo, BigDecimal transito, String upc, String marca, String grupo, BigDecimal maximo, BigDecimal minimo, BigDecimal reorden, String monedaPreciobase, BigDecimal preciobase, BigDecimal precionuevo, String monedaPrecionuevo, String impVen, String fabricacion, String promoapp, String discExc, String conttype, String indLote, String indActivo, Short graciaVencer, BigDecimal costoNuevo, BigDecimal costoEstandar, String aplicaImpuesto, String descripcionAlterna, String masterPack, String innerPack, BigDecimal precioCd, Integer pagCatalogo, String controlaPermisos, String permisoAprobado, String statusCd, String noProve, String indImprimeGarantia, String indRequiereSerie, String indEsParaOferta, Date tstamp, Short garantia, String curvaDefault, String ccolor, String cmodelo, String catalogo, String itunesbusiness, String tipoM, Long correlativoTipo, BigDecimal preciobaseRes, BigDecimal precionuevoRes, BigDecimal costoNuevoRes, BigDecimal costoEstandarRes) {
       this.id = id;
       this.descripcion = descripcion;
       this.unidad = unidad;
       this.peso = peso;
       this.tiempoRep = tiempoRep;
       this.codigo = codigo;
       this.transito = transito;
       this.upc = upc;
       this.marca = marca;
       this.grupo = grupo;
       this.maximo = maximo;
       this.minimo = minimo;
       this.reorden = reorden;
       this.monedaPreciobase = monedaPreciobase;
       this.preciobase = preciobase;
       this.precionuevo = precionuevo;
       this.monedaPrecionuevo = monedaPrecionuevo;
       this.impVen = impVen;
       this.fabricacion = fabricacion;
       this.promoapp = promoapp;
       this.discExc = discExc;
       this.conttype = conttype;
       this.indLote = indLote;
       this.indActivo = indActivo;
       this.graciaVencer = graciaVencer;
       this.costoNuevo = costoNuevo;
       this.costoEstandar = costoEstandar;
       this.aplicaImpuesto = aplicaImpuesto;
       this.descripcionAlterna = descripcionAlterna;
       this.masterPack = masterPack;
       this.innerPack = innerPack;
       this.precioCd = precioCd;
       this.pagCatalogo = pagCatalogo;
       this.controlaPermisos = controlaPermisos;
       this.permisoAprobado = permisoAprobado;
       this.statusCd = statusCd;
       this.noProve = noProve;
       this.indImprimeGarantia = indImprimeGarantia;
       this.indRequiereSerie = indRequiereSerie;
       this.indEsParaOferta = indEsParaOferta;
       this.tstamp = tstamp;
       this.garantia = garantia;
       this.curvaDefault = curvaDefault;
       this.ccolor = ccolor;
       this.cmodelo = cmodelo;
       this.catalogo = catalogo;
       this.itunesbusiness = itunesbusiness;
       this.tipoM = tipoM;
       this.correlativoTipo = correlativoTipo;
       this.preciobaseRes = preciobaseRes;
       this.precionuevoRes = precionuevoRes;
       this.costoNuevoRes = costoNuevoRes;
       this.costoEstandarRes = costoEstandarRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="noArti", column=@Column(name="NO_ARTI", nullable=false, length=30) ) } )
    public ArindaId getId() {
        return this.id;
    }
    
    public void setId(ArindaId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPCION", length=200)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="UNIDAD", length=2)
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    
    @Column(name="PESO", precision=8)
    public BigDecimal getPeso() {
        return this.peso;
    }
    
    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    
    @Column(name="TIEMPO_REP", precision=3, scale=0)
    public Short getTiempoRep() {
        return this.tiempoRep;
    }
    
    public void setTiempoRep(Short tiempoRep) {
        this.tiempoRep = tiempoRep;
    }

    
    @Column(name="CODIGO", length=21)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="TRANSITO", precision=12)
    public BigDecimal getTransito() {
        return this.transito;
    }
    
    public void setTransito(BigDecimal transito) {
        this.transito = transito;
    }

    
    @Column(name="UPC", length=40)
    public String getUpc() {
        return this.upc;
    }
    
    public void setUpc(String upc) {
        this.upc = upc;
    }

    
    @Column(name="MARCA", length=6)
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Column(name="GRUPO", length=6)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    @Column(name="MAXIMO", precision=12)
    public BigDecimal getMaximo() {
        return this.maximo;
    }
    
    public void setMaximo(BigDecimal maximo) {
        this.maximo = maximo;
    }

    
    @Column(name="MINIMO", precision=12)
    public BigDecimal getMinimo() {
        return this.minimo;
    }
    
    public void setMinimo(BigDecimal minimo) {
        this.minimo = minimo;
    }

    
    @Column(name="REORDEN", precision=12)
    public BigDecimal getReorden() {
        return this.reorden;
    }
    
    public void setReorden(BigDecimal reorden) {
        this.reorden = reorden;
    }

    
    @Column(name="MONEDA_PRECIOBASE", length=1)
    public String getMonedaPreciobase() {
        return this.monedaPreciobase;
    }
    
    public void setMonedaPreciobase(String monedaPreciobase) {
        this.monedaPreciobase = monedaPreciobase;
    }

    
    @Column(name="PRECIOBASE", precision=21, scale=6)
    public BigDecimal getPreciobase() {
        return this.preciobase;
    }
    
    public void setPreciobase(BigDecimal preciobase) {
        this.preciobase = preciobase;
    }

    
    @Column(name="PRECIONUEVO", precision=21, scale=6)
    public BigDecimal getPrecionuevo() {
        return this.precionuevo;
    }
    
    public void setPrecionuevo(BigDecimal precionuevo) {
        this.precionuevo = precionuevo;
    }

    
    @Column(name="MONEDA_PRECIONUEVO", length=1)
    public String getMonedaPrecionuevo() {
        return this.monedaPrecionuevo;
    }
    
    public void setMonedaPrecionuevo(String monedaPrecionuevo) {
        this.monedaPrecionuevo = monedaPrecionuevo;
    }

    
    @Column(name="IMP_VEN", length=1)
    public String getImpVen() {
        return this.impVen;
    }
    
    public void setImpVen(String impVen) {
        this.impVen = impVen;
    }

    
    @Column(name="FABRICACION", length=1)
    public String getFabricacion() {
        return this.fabricacion;
    }
    
    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    
    @Column(name="PROMOAPP", length=1)
    public String getPromoapp() {
        return this.promoapp;
    }
    
    public void setPromoapp(String promoapp) {
        this.promoapp = promoapp;
    }

    
    @Column(name="DISC_EXC", length=1)
    public String getDiscExc() {
        return this.discExc;
    }
    
    public void setDiscExc(String discExc) {
        this.discExc = discExc;
    }

    
    @Column(name="CONTTYPE", length=1)
    public String getConttype() {
        return this.conttype;
    }
    
    public void setConttype(String conttype) {
        this.conttype = conttype;
    }

    
    @Column(name="IND_LOTE", length=1)
    public String getIndLote() {
        return this.indLote;
    }
    
    public void setIndLote(String indLote) {
        this.indLote = indLote;
    }

    
    @Column(name="IND_ACTIVO", length=1)
    public String getIndActivo() {
        return this.indActivo;
    }
    
    public void setIndActivo(String indActivo) {
        this.indActivo = indActivo;
    }

    
    @Column(name="GRACIA_VENCER", precision=3, scale=0)
    public Short getGraciaVencer() {
        return this.graciaVencer;
    }
    
    public void setGraciaVencer(Short graciaVencer) {
        this.graciaVencer = graciaVencer;
    }

    
    @Column(name="COSTO_NUEVO", precision=22, scale=6)
    public BigDecimal getCostoNuevo() {
        return this.costoNuevo;
    }
    
    public void setCostoNuevo(BigDecimal costoNuevo) {
        this.costoNuevo = costoNuevo;
    }

    
    @Column(name="COSTO_ESTANDAR", precision=22, scale=6)
    public BigDecimal getCostoEstandar() {
        return this.costoEstandar;
    }
    
    public void setCostoEstandar(BigDecimal costoEstandar) {
        this.costoEstandar = costoEstandar;
    }

    
    @Column(name="APLICA_IMPUESTO", length=1)
    public String getAplicaImpuesto() {
        return this.aplicaImpuesto;
    }
    
    public void setAplicaImpuesto(String aplicaImpuesto) {
        this.aplicaImpuesto = aplicaImpuesto;
    }

    
    @Column(name="DESCRIPCION_ALTERNA", length=50)
    public String getDescripcionAlterna() {
        return this.descripcionAlterna;
    }
    
    public void setDescripcionAlterna(String descripcionAlterna) {
        this.descripcionAlterna = descripcionAlterna;
    }

    
    @Column(name="MASTER_PACK", length=2)
    public String getMasterPack() {
        return this.masterPack;
    }
    
    public void setMasterPack(String masterPack) {
        this.masterPack = masterPack;
    }

    
    @Column(name="INNER_PACK", length=2)
    public String getInnerPack() {
        return this.innerPack;
    }
    
    public void setInnerPack(String innerPack) {
        this.innerPack = innerPack;
    }

    
    @Column(name="PRECIO_CD", precision=21, scale=6)
    public BigDecimal getPrecioCd() {
        return this.precioCd;
    }
    
    public void setPrecioCd(BigDecimal precioCd) {
        this.precioCd = precioCd;
    }

    
    @Column(name="PAG_CATALOGO", precision=5, scale=0)
    public Integer getPagCatalogo() {
        return this.pagCatalogo;
    }
    
    public void setPagCatalogo(Integer pagCatalogo) {
        this.pagCatalogo = pagCatalogo;
    }

    
    @Column(name="CONTROLA_PERMISOS", length=1)
    public String getControlaPermisos() {
        return this.controlaPermisos;
    }
    
    public void setControlaPermisos(String controlaPermisos) {
        this.controlaPermisos = controlaPermisos;
    }

    
    @Column(name="PERMISO_APROBADO", length=1)
    public String getPermisoAprobado() {
        return this.permisoAprobado;
    }
    
    public void setPermisoAprobado(String permisoAprobado) {
        this.permisoAprobado = permisoAprobado;
    }

    
    @Column(name="STATUS_CD", length=1)
    public String getStatusCd() {
        return this.statusCd;
    }
    
    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    
    @Column(name="NO_PROVE", length=15)
    public String getNoProve() {
        return this.noProve;
    }
    
    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }

    
    @Column(name="IND_IMPRIME_GARANTIA", length=1)
    public String getIndImprimeGarantia() {
        return this.indImprimeGarantia;
    }
    
    public void setIndImprimeGarantia(String indImprimeGarantia) {
        this.indImprimeGarantia = indImprimeGarantia;
    }

    
    @Column(name="IND_REQUIERE_SERIE", length=1)
    public String getIndRequiereSerie() {
        return this.indRequiereSerie;
    }
    
    public void setIndRequiereSerie(String indRequiereSerie) {
        this.indRequiereSerie = indRequiereSerie;
    }

    
    @Column(name="IND_ES_PARA_OFERTA", length=1)
    public String getIndEsParaOferta() {
        return this.indEsParaOferta;
    }
    
    public void setIndEsParaOferta(String indEsParaOferta) {
        this.indEsParaOferta = indEsParaOferta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TSTAMP", length=7)
    public Date getTstamp() {
        return this.tstamp;
    }
    
    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    
    @Column(name="GARANTIA", precision=3, scale=0)
    public Short getGarantia() {
        return this.garantia;
    }
    
    public void setGarantia(Short garantia) {
        this.garantia = garantia;
    }

    
    @Column(name="CURVA_DEFAULT", length=4)
    public String getCurvaDefault() {
        return this.curvaDefault;
    }
    
    public void setCurvaDefault(String curvaDefault) {
        this.curvaDefault = curvaDefault;
    }

    
    @Column(name="CCOLOR", length=5)
    public String getCcolor() {
        return this.ccolor;
    }
    
    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    
    @Column(name="CMODELO", length=25)
    public String getCmodelo() {
        return this.cmodelo;
    }
    
    public void setCmodelo(String cmodelo) {
        this.cmodelo = cmodelo;
    }

    
    @Column(name="CATALOGO", length=30)
    public String getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    
    @Column(name="ITUNESBUSINESS", length=1)
    public String getItunesbusiness() {
        return this.itunesbusiness;
    }
    
    public void setItunesbusiness(String itunesbusiness) {
        this.itunesbusiness = itunesbusiness;
    }

    
    @Column(name="TIPO_M", length=30)
    public String getTipoM() {
        return this.tipoM;
    }
    
    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    
    @Column(name="CORRELATIVO_TIPO", precision=17, scale=0)
    public Long getCorrelativoTipo() {
        return this.correlativoTipo;
    }
    
    public void setCorrelativoTipo(Long correlativoTipo) {
        this.correlativoTipo = correlativoTipo;
    }

    
    @Column(name="PRECIOBASE_RES", precision=21, scale=6)
    public BigDecimal getPreciobaseRes() {
        return this.preciobaseRes;
    }
    
    public void setPreciobaseRes(BigDecimal preciobaseRes) {
        this.preciobaseRes = preciobaseRes;
    }

    
    @Column(name="PRECIONUEVO_RES", precision=21, scale=6)
    public BigDecimal getPrecionuevoRes() {
        return this.precionuevoRes;
    }
    
    public void setPrecionuevoRes(BigDecimal precionuevoRes) {
        this.precionuevoRes = precionuevoRes;
    }

    
    @Column(name="COSTO_NUEVO_RES", precision=30, scale=6)
    public BigDecimal getCostoNuevoRes() {
        return this.costoNuevoRes;
    }
    
    public void setCostoNuevoRes(BigDecimal costoNuevoRes) {
        this.costoNuevoRes = costoNuevoRes;
    }

    
    @Column(name="COSTO_ESTANDAR_RES", precision=30, scale=6)
    public BigDecimal getCostoEstandarRes() {
        return this.costoEstandarRes;
    }
    
    public void setCostoEstandarRes(BigDecimal costoEstandarRes) {
        this.costoEstandarRes = costoEstandarRes;
    }




}


