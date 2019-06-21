package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


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
 * ArcgctC generated by hbm2java
 */
@Entity
@Table(name="ARCGCT_C"
    ,schema="DESA46"
)
public class ArcgctC  implements java.io.Serializable {


     private ArcgctCId id;
     private Short anoProce;
     private Byte mesProce;
     private Date fecArranque;

    public ArcgctC() {
    }

	
    public ArcgctC(ArcgctCId id) {
        this.id = id;
    }
    public ArcgctC(ArcgctCId id, Short anoProce, Byte mesProce, Date fecArranque) {
       this.id = id;
       this.anoProce = anoProce;
       this.mesProce = mesProce;
       this.fecArranque = fecArranque;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="modulo", column=@Column(name="MODULO", nullable=false, length=20) ), 
        @AttributeOverride(name="subModulo", column=@Column(name="SUB_MODULO", nullable=false, length=15) ) } )
    public ArcgctCId getId() {
        return this.id;
    }
    
    public void setId(ArcgctCId id) {
        this.id = id;
    }

    
    @Column(name="ANO_PROCE", precision=4, scale=0)
    public Short getAnoProce() {
        return this.anoProce;
    }
    
    public void setAnoProce(Short anoProce) {
        this.anoProce = anoProce;
    }

    
    @Column(name="MES_PROCE", precision=2, scale=0)
    public Byte getMesProce() {
        return this.mesProce;
    }
    
    public void setMesProce(Byte mesProce) {
        this.mesProce = mesProce;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_ARRANQUE", length=7)
    public Date getFecArranque() {
        return this.fecArranque;
    }
    
    public void setFecArranque(Date fecArranque) {
        this.fecArranque = fecArranque;
    }




}


