package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DetTransporte generated by hbm2java
 */
@Entity
@Table(name="DET_TRANSPORTE"
    ,schema="DESA46"
)
public class DetTransporte  implements java.io.Serializable {


     private DetTransporteId id;
     private String noCliente;
     private Long pares;
     private Long bulto;
     private String noDocu;
     private String noCia;
     private String estatus;
     private String observaciones;
     private String noVendedor;
     private Long devuelto;

    public DetTransporte() {
    }

	
    public DetTransporte(DetTransporteId id) {
        this.id = id;
    }
    public DetTransporte(DetTransporteId id, String noCliente, Long pares, Long bulto, String noDocu, String noCia, String estatus, String observaciones, String noVendedor, Long devuelto) {
       this.id = id;
       this.noCliente = noCliente;
       this.pares = pares;
       this.bulto = bulto;
       this.noDocu = noDocu;
       this.noCia = noCia;
       this.estatus = estatus;
       this.observaciones = observaciones;
       this.noVendedor = noVendedor;
       this.devuelto = devuelto;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="numero", column=@Column(name="NUMERO", nullable=false, precision=17, scale=0) ), 
        @AttributeOverride(name="linea", column=@Column(name="LINEA", nullable=false, precision=17, scale=0) ) } )
    public DetTransporteId getId() {
        return this.id;
    }
    
    public void setId(DetTransporteId id) {
        this.id = id;
    }

    
    @Column(name="NO_CLIENTE", length=15)
    public String getNoCliente() {
        return this.noCliente;
    }
    
    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    
    @Column(name="PARES", precision=17, scale=0)
    public Long getPares() {
        return this.pares;
    }
    
    public void setPares(Long pares) {
        this.pares = pares;
    }

    
    @Column(name="BULTO", precision=17, scale=0)
    public Long getBulto() {
        return this.bulto;
    }
    
    public void setBulto(Long bulto) {
        this.bulto = bulto;
    }

    
    @Column(name="NO_DOCU", length=12)
    public String getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }

    
    @Column(name="NO_CIA", length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    
    @Column(name="ESTATUS", length=3)
    public String getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    
    @Column(name="OBSERVACIONES", length=500)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    @Column(name="NO_VENDEDOR", length=4)
    public String getNoVendedor() {
        return this.noVendedor;
    }
    
    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    
    @Column(name="DEVUELTO", precision=18, scale=0)
    public Long getDevuelto() {
        return this.devuelto;
    }
    
    public void setDevuelto(Long devuelto) {
        this.devuelto = devuelto;
    }




}


