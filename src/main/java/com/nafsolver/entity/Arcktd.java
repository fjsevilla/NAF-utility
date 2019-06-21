package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arcktd generated by hbm2java
 */
@Entity
@Table(name="ARCKTD"
    ,schema="DESA46"
)
public class Arcktd  implements java.io.Serializable {


     private ArcktdId id;
     private String descrip;
     private String tipoMov;
     private String tipoComprobante;
     private String formularioCtrl;
     private String noFisicoRequerido;

    public Arcktd() {
    }

	
    public Arcktd(ArcktdId id) {
        this.id = id;
    }
    public Arcktd(ArcktdId id, String descrip, String tipoMov, String tipoComprobante, String formularioCtrl, String noFisicoRequerido) {
       this.id = id;
       this.descrip = descrip;
       this.tipoMov = tipoMov;
       this.tipoComprobante = tipoComprobante;
       this.formularioCtrl = formularioCtrl;
       this.noFisicoRequerido = noFisicoRequerido;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="tipoDoc", column=@Column(name="TIPO_DOC", nullable=false, length=2) ) } )
    public ArcktdId getId() {
        return this.id;
    }
    
    public void setId(ArcktdId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIP", length=20)
    public String getDescrip() {
        return this.descrip;
    }
    
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    
    @Column(name="TIPO_MOV", length=1)
    public String getTipoMov() {
        return this.tipoMov;
    }
    
    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    
    @Column(name="TIPO_COMPROBANTE", length=1)
    public String getTipoComprobante() {
        return this.tipoComprobante;
    }
    
    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    
    @Column(name="FORMULARIO_CTRL", length=10)
    public String getFormularioCtrl() {
        return this.formularioCtrl;
    }
    
    public void setFormularioCtrl(String formularioCtrl) {
        this.formularioCtrl = formularioCtrl;
    }

    
    @Column(name="NO_FISICO_REQUERIDO", length=1)
    public String getNoFisicoRequerido() {
        return this.noFisicoRequerido;
    }
    
    public void setNoFisicoRequerido(String noFisicoRequerido) {
        this.noFisicoRequerido = noFisicoRequerido;
    }




}


