package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arckcaed generated by hbm2java
 */
@Entity
@Table(name="ARCKCAED"
    ,schema="DESA46"
)
public class Arckcaed  implements java.io.Serializable {


     private ArckcaedId id;
     private String noCta;
     private String proce;
     private String tipoDoc;
     private String procedenciaR;
     private String tipoDocR;

    public Arckcaed() {
    }

	
    public Arckcaed(ArckcaedId id) {
        this.id = id;
    }
    public Arckcaed(ArckcaedId id, String noCta, String proce, String tipoDoc, String procedenciaR, String tipoDocR) {
       this.id = id;
       this.noCta = noCta;
       this.proce = proce;
       this.tipoDoc = tipoDoc;
       this.procedenciaR = procedenciaR;
       this.tipoDocR = tipoDocR;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="noDocu", column=@Column(name="NO_DOCU", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="noDocuR", column=@Column(name="NO_DOCU_R", nullable=false, precision=8, scale=0) ) } )
    public ArckcaedId getId() {
        return this.id;
    }
    
    public void setId(ArckcaedId id) {
        this.id = id;
    }

    
    @Column(name="NO_CTA", length=15)
    public String getNoCta() {
        return this.noCta;
    }
    
    public void setNoCta(String noCta) {
        this.noCta = noCta;
    }

    
    @Column(name="PROCE", length=1)
    public String getProce() {
        return this.proce;
    }
    
    public void setProce(String proce) {
        this.proce = proce;
    }

    
    @Column(name="TIPO_DOC", length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    
    @Column(name="PROCEDENCIA_R", length=1)
    public String getProcedenciaR() {
        return this.procedenciaR;
    }
    
    public void setProcedenciaR(String procedenciaR) {
        this.procedenciaR = procedenciaR;
    }

    
    @Column(name="TIPO_DOC_R", length=2)
    public String getTipoDocR() {
        return this.tipoDocR;
    }
    
    public void setTipoDocR(String tipoDocR) {
        this.tipoDocR = tipoDocR;
    }




}


