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
 * Arcpmp generated by hbm2java
 */
@Entity
@Table(name="ARCPMP"
    ,schema="DESA46"
)
public class Arcpmp  implements java.io.Serializable {


     private ArcpmpId id;
     private String clase;
     private String corporacion;
     private String nombre;
     private String direccion;
     private String direccion1;
     private String telefono;
     private String fax;
     private String tipoIdTributario;
     private String cedula;
     private String encar;
     private String moneda;
     private Short plazoC;
     private Short plazoP;
     private BigDecimal desC;
     private BigDecimal desP;
     private BigDecimal creMax;
     private BigDecimal SPerAnt;
     private BigDecimal salAnt;
     private BigDecimal debitos;
     private BigDecimal creditos;
     private Date FUCo;
     private String grupo;
     private String observaciones;
     private String bloqueado;
     private String motivo;
     private String indNacional;
     private String codigoTercero;
     private String condicionTributaria;
     private String sector;
     private String actividad;
     private String pais;
     private String provincia;
     private String canton;
     private String distrito;
     private String barrio;
     private String nombreLargo;
     private String contacto;
     private String telefonoContacto;
     private Date tstamp;
     private String tipoFormaPago;
     private Short diasEntrega;
     private Short rangoSeguridad;
     private BigDecimal cargosIntereses;
     private String idMomentoPago;
     private BigDecimal cargosFinanciamiento;
     private String replicarTpm;
     private BigDecimal porctRi;
     private String ccRi;
     private String telefono2;
     private String telefono3;
     private BigDecimal creMaxRes;
     private BigDecimal SPerAntRes;
     private BigDecimal salAntRes;
     private BigDecimal debitosRes;
     private BigDecimal creditosRes;

    public Arcpmp() {
    }

	
    public Arcpmp(ArcpmpId id) {
        this.id = id;
    }
    public Arcpmp(ArcpmpId id, String clase, String corporacion, String nombre, String direccion, String direccion1, String telefono, String fax, String tipoIdTributario, String cedula, String encar, String moneda, Short plazoC, Short plazoP, BigDecimal desC, BigDecimal desP, BigDecimal creMax, BigDecimal SPerAnt, BigDecimal salAnt, BigDecimal debitos, BigDecimal creditos, Date FUCo, String grupo, String observaciones, String bloqueado, String motivo, String indNacional, String codigoTercero, String condicionTributaria, String sector, String actividad, String pais, String provincia, String canton, String distrito, String barrio, String nombreLargo, String contacto, String telefonoContacto, Date tstamp, String tipoFormaPago, Short diasEntrega, Short rangoSeguridad, BigDecimal cargosIntereses, String idMomentoPago, BigDecimal cargosFinanciamiento, String replicarTpm, BigDecimal porctRi, String ccRi, String telefono2, String telefono3, BigDecimal creMaxRes, BigDecimal SPerAntRes, BigDecimal salAntRes, BigDecimal debitosRes, BigDecimal creditosRes) {
       this.id = id;
       this.clase = clase;
       this.corporacion = corporacion;
       this.nombre = nombre;
       this.direccion = direccion;
       this.direccion1 = direccion1;
       this.telefono = telefono;
       this.fax = fax;
       this.tipoIdTributario = tipoIdTributario;
       this.cedula = cedula;
       this.encar = encar;
       this.moneda = moneda;
       this.plazoC = plazoC;
       this.plazoP = plazoP;
       this.desC = desC;
       this.desP = desP;
       this.creMax = creMax;
       this.SPerAnt = SPerAnt;
       this.salAnt = salAnt;
       this.debitos = debitos;
       this.creditos = creditos;
       this.FUCo = FUCo;
       this.grupo = grupo;
       this.observaciones = observaciones;
       this.bloqueado = bloqueado;
       this.motivo = motivo;
       this.indNacional = indNacional;
       this.codigoTercero = codigoTercero;
       this.condicionTributaria = condicionTributaria;
       this.sector = sector;
       this.actividad = actividad;
       this.pais = pais;
       this.provincia = provincia;
       this.canton = canton;
       this.distrito = distrito;
       this.barrio = barrio;
       this.nombreLargo = nombreLargo;
       this.contacto = contacto;
       this.telefonoContacto = telefonoContacto;
       this.tstamp = tstamp;
       this.tipoFormaPago = tipoFormaPago;
       this.diasEntrega = diasEntrega;
       this.rangoSeguridad = rangoSeguridad;
       this.cargosIntereses = cargosIntereses;
       this.idMomentoPago = idMomentoPago;
       this.cargosFinanciamiento = cargosFinanciamiento;
       this.replicarTpm = replicarTpm;
       this.porctRi = porctRi;
       this.ccRi = ccRi;
       this.telefono2 = telefono2;
       this.telefono3 = telefono3;
       this.creMaxRes = creMaxRes;
       this.SPerAntRes = SPerAntRes;
       this.salAntRes = salAntRes;
       this.debitosRes = debitosRes;
       this.creditosRes = creditosRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noProve", column=@Column(name="NO_PROVE", nullable=false, length=15) ) } )
    public ArcpmpId getId() {
        return this.id;
    }
    
    public void setId(ArcpmpId id) {
        this.id = id;
    }

    
    @Column(name="CLASE", length=6)
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }

    
    @Column(name="CORPORACION", length=6)
    public String getCorporacion() {
        return this.corporacion;
    }
    
    public void setCorporacion(String corporacion) {
        this.corporacion = corporacion;
    }

    
    @Column(name="NOMBRE", length=200)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="DIRECCION", length=1000)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="DIRECCION1", length=30)
    public String getDireccion1() {
        return this.direccion1;
    }
    
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    
    @Column(name="TELEFONO", length=13)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="FAX", length=13)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="TIPO_ID_TRIBUTARIO", length=1)
    public String getTipoIdTributario() {
        return this.tipoIdTributario;
    }
    
    public void setTipoIdTributario(String tipoIdTributario) {
        this.tipoIdTributario = tipoIdTributario;
    }

    
    @Column(name="CEDULA", length=15)
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    @Column(name="ENCAR", length=30)
    public String getEncar() {
        return this.encar;
    }
    
    public void setEncar(String encar) {
        this.encar = encar;
    }

    
    @Column(name="MONEDA", length=1)
    public String getMoneda() {
        return this.moneda;
    }
    
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    
    @Column(name="PLAZO_C", precision=3, scale=0)
    public Short getPlazoC() {
        return this.plazoC;
    }
    
    public void setPlazoC(Short plazoC) {
        this.plazoC = plazoC;
    }

    
    @Column(name="PLAZO_P", precision=3, scale=0)
    public Short getPlazoP() {
        return this.plazoP;
    }
    
    public void setPlazoP(Short plazoP) {
        this.plazoP = plazoP;
    }

    
    @Column(name="DES_C", precision=5)
    public BigDecimal getDesC() {
        return this.desC;
    }
    
    public void setDesC(BigDecimal desC) {
        this.desC = desC;
    }

    
    @Column(name="DES_P", precision=5)
    public BigDecimal getDesP() {
        return this.desP;
    }
    
    public void setDesP(BigDecimal desP) {
        this.desP = desP;
    }

    
    @Column(name="CRE_MAX", precision=17)
    public BigDecimal getCreMax() {
        return this.creMax;
    }
    
    public void setCreMax(BigDecimal creMax) {
        this.creMax = creMax;
    }

    
    @Column(name="S_PER_ANT", precision=17)
    public BigDecimal getSPerAnt() {
        return this.SPerAnt;
    }
    
    public void setSPerAnt(BigDecimal SPerAnt) {
        this.SPerAnt = SPerAnt;
    }

    
    @Column(name="SAL_ANT", precision=17)
    public BigDecimal getSalAnt() {
        return this.salAnt;
    }
    
    public void setSalAnt(BigDecimal salAnt) {
        this.salAnt = salAnt;
    }

    
    @Column(name="DEBITOS", precision=17)
    public BigDecimal getDebitos() {
        return this.debitos;
    }
    
    public void setDebitos(BigDecimal debitos) {
        this.debitos = debitos;
    }

    
    @Column(name="CREDITOS", precision=17)
    public BigDecimal getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(BigDecimal creditos) {
        this.creditos = creditos;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="F_U_CO", length=7)
    public Date getFUCo() {
        return this.FUCo;
    }
    
    public void setFUCo(Date FUCo) {
        this.FUCo = FUCo;
    }

    
    @Column(name="GRUPO", length=2)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    @Column(name="OBSERVACIONES", length=240)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    @Column(name="BLOQUEADO", length=1)
    public String getBloqueado() {
        return this.bloqueado;
    }
    
    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    
    @Column(name="MOTIVO", length=30)
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    @Column(name="IND_NACIONAL", length=1)
    public String getIndNacional() {
        return this.indNacional;
    }
    
    public void setIndNacional(String indNacional) {
        this.indNacional = indNacional;
    }

    
    @Column(name="CODIGO_TERCERO", length=18)
    public String getCodigoTercero() {
        return this.codigoTercero;
    }
    
    public void setCodigoTercero(String codigoTercero) {
        this.codigoTercero = codigoTercero;
    }

    
    @Column(name="CONDICION_TRIBUTARIA", length=3)
    public String getCondicionTributaria() {
        return this.condicionTributaria;
    }
    
    public void setCondicionTributaria(String condicionTributaria) {
        this.condicionTributaria = condicionTributaria;
    }

    
    @Column(name="SECTOR", length=2)
    public String getSector() {
        return this.sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }

    
    @Column(name="ACTIVIDAD", length=4)
    public String getActividad() {
        return this.actividad;
    }
    
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    
    @Column(name="PAIS", length=6)
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    @Column(name="PROVINCIA", length=6)
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
    @Column(name="CANTON", length=6)
    public String getCanton() {
        return this.canton;
    }
    
    public void setCanton(String canton) {
        this.canton = canton;
    }

    
    @Column(name="DISTRITO", length=2)
    public String getDistrito() {
        return this.distrito;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    
    @Column(name="BARRIO", length=2)
    public String getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    
    @Column(name="NOMBRE_LARGO", length=60)
    public String getNombreLargo() {
        return this.nombreLargo;
    }
    
    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    
    @Column(name="CONTACTO", length=30)
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    @Column(name="TELEFONO_CONTACTO", length=20)
    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }
    
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TSTAMP", length=7)
    public Date getTstamp() {
        return this.tstamp;
    }
    
    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    
    @Column(name="TIPO_FORMA_PAGO", length=3)
    public String getTipoFormaPago() {
        return this.tipoFormaPago;
    }
    
    public void setTipoFormaPago(String tipoFormaPago) {
        this.tipoFormaPago = tipoFormaPago;
    }

    
    @Column(name="DIAS_ENTREGA", precision=3, scale=0)
    public Short getDiasEntrega() {
        return this.diasEntrega;
    }
    
    public void setDiasEntrega(Short diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    
    @Column(name="RANGO_SEGURIDAD", precision=3, scale=0)
    public Short getRangoSeguridad() {
        return this.rangoSeguridad;
    }
    
    public void setRangoSeguridad(Short rangoSeguridad) {
        this.rangoSeguridad = rangoSeguridad;
    }

    
    @Column(name="CARGOS_INTERESES", precision=10, scale=5)
    public BigDecimal getCargosIntereses() {
        return this.cargosIntereses;
    }
    
    public void setCargosIntereses(BigDecimal cargosIntereses) {
        this.cargosIntereses = cargosIntereses;
    }

    
    @Column(name="ID_MOMENTO_PAGO", length=3)
    public String getIdMomentoPago() {
        return this.idMomentoPago;
    }
    
    public void setIdMomentoPago(String idMomentoPago) {
        this.idMomentoPago = idMomentoPago;
    }

    
    @Column(name="CARGOS_FINANCIAMIENTO", precision=10, scale=5)
    public BigDecimal getCargosFinanciamiento() {
        return this.cargosFinanciamiento;
    }
    
    public void setCargosFinanciamiento(BigDecimal cargosFinanciamiento) {
        this.cargosFinanciamiento = cargosFinanciamiento;
    }

    
    @Column(name="REPLICAR_TPM", length=1)
    public String getReplicarTpm() {
        return this.replicarTpm;
    }
    
    public void setReplicarTpm(String replicarTpm) {
        this.replicarTpm = replicarTpm;
    }

    
    @Column(name="PORCT_RI", precision=17)
    public BigDecimal getPorctRi() {
        return this.porctRi;
    }
    
    public void setPorctRi(BigDecimal porctRi) {
        this.porctRi = porctRi;
    }

    
    @Column(name="CC_RI", length=20)
    public String getCcRi() {
        return this.ccRi;
    }
    
    public void setCcRi(String ccRi) {
        this.ccRi = ccRi;
    }

    
    @Column(name="TELEFONO2", length=13)
    public String getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    
    @Column(name="TELEFONO3", length=13)
    public String getTelefono3() {
        return this.telefono3;
    }
    
    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    
    @Column(name="CRE_MAX_RES", precision=30)
    public BigDecimal getCreMaxRes() {
        return this.creMaxRes;
    }
    
    public void setCreMaxRes(BigDecimal creMaxRes) {
        this.creMaxRes = creMaxRes;
    }

    
    @Column(name="S_PER_ANT_RES", precision=30)
    public BigDecimal getSPerAntRes() {
        return this.SPerAntRes;
    }
    
    public void setSPerAntRes(BigDecimal SPerAntRes) {
        this.SPerAntRes = SPerAntRes;
    }

    
    @Column(name="SAL_ANT_RES", precision=30)
    public BigDecimal getSalAntRes() {
        return this.salAntRes;
    }
    
    public void setSalAntRes(BigDecimal salAntRes) {
        this.salAntRes = salAntRes;
    }

    
    @Column(name="DEBITOS_RES", precision=30)
    public BigDecimal getDebitosRes() {
        return this.debitosRes;
    }
    
    public void setDebitosRes(BigDecimal debitosRes) {
        this.debitosRes = debitosRes;
    }

    
    @Column(name="CREDITOS_RES", precision=30)
    public BigDecimal getCreditosRes() {
        return this.creditosRes;
    }
    
    public void setCreditosRes(BigDecimal creditosRes) {
        this.creditosRes = creditosRes;
    }




}


