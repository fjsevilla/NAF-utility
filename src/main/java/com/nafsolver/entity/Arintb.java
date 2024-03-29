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
 * Arintb generated by hbm2java
 */
@Entity
@Table(name="ARINTB"
    ,schema="DESA46"
)
public class Arintb  implements java.io.Serializable {


     private ArintbId id;
     private String nombre;
     private BigDecimal comision;
     private String superior;
     private String grupo;
     private String noCliente;
     private String noProve;
     private String codigoAnt;
     private String codCobr;
     private String inactivo;
     private String rutero;
     private Short diasGracia;
     private String cuentaComisiones;
     private BigDecimal publicidad;

    public Arintb() {
    }

	
    public Arintb(ArintbId id) {
        this.id = id;
    }
    public Arintb(ArintbId id, String nombre, BigDecimal comision, String superior, String grupo, String noCliente, String noProve, String codigoAnt, String codCobr, String inactivo, String rutero, Short diasGracia, String cuentaComisiones, BigDecimal publicidad) {
       this.id = id;
       this.nombre = nombre;
       this.comision = comision;
       this.superior = superior;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.noProve = noProve;
       this.codigoAnt = codigoAnt;
       this.codCobr = codCobr;
       this.inactivo = inactivo;
       this.rutero = rutero;
       this.diasGracia = diasGracia;
       this.cuentaComisiones = cuentaComisiones;
       this.publicidad = publicidad;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="tipoCodigo", column=@Column(name="TIPO_CODIGO", nullable=false, length=1) ), 
        @AttributeOverride(name="codigo", column=@Column(name="CODIGO", nullable=false, length=4) ), 
        @AttributeOverride(name="periodo", column=@Column(name="PERIODO", nullable=false, length=4) ) } )
    public ArintbId getId() {
        return this.id;
    }
    
    public void setId(ArintbId id) {
        this.id = id;
    }

    
    @Column(name="NOMBRE", length=25)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="COMISION", precision=7)
    public BigDecimal getComision() {
        return this.comision;
    }
    
    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    
    @Column(name="SUPERIOR", length=4)
    public String getSuperior() {
        return this.superior;
    }
    
    public void setSuperior(String superior) {
        this.superior = superior;
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

    
    @Column(name="NO_PROVE", length=15)
    public String getNoProve() {
        return this.noProve;
    }
    
    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }

    
    @Column(name="CODIGO_ANT", length=5)
    public String getCodigoAnt() {
        return this.codigoAnt;
    }
    
    public void setCodigoAnt(String codigoAnt) {
        this.codigoAnt = codigoAnt;
    }

    
    @Column(name="COD_COBR", length=4)
    public String getCodCobr() {
        return this.codCobr;
    }
    
    public void setCodCobr(String codCobr) {
        this.codCobr = codCobr;
    }

    
    @Column(name="INACTIVO", length=1)
    public String getInactivo() {
        return this.inactivo;
    }
    
    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }

    
    @Column(name="RUTERO", length=1)
    public String getRutero() {
        return this.rutero;
    }
    
    public void setRutero(String rutero) {
        this.rutero = rutero;
    }

    
    @Column(name="DIAS_GRACIA", precision=4, scale=0)
    public Short getDiasGracia() {
        return this.diasGracia;
    }
    
    public void setDiasGracia(Short diasGracia) {
        this.diasGracia = diasGracia;
    }

    
    @Column(name="CUENTA_COMISIONES", length=15)
    public String getCuentaComisiones() {
        return this.cuentaComisiones;
    }
    
    public void setCuentaComisiones(String cuentaComisiones) {
        this.cuentaComisiones = cuentaComisiones;
    }

    
    @Column(name="PUBLICIDAD", precision=12)
    public BigDecimal getPublicidad() {
        return this.publicidad;
    }
    
    public void setPublicidad(BigDecimal publicidad) {
        this.publicidad = publicidad;
    }




}


