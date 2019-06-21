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
 * CierreEfe generated by hbm2java
 */
@Entity
@Table(name="CIERRE_EFE"
    ,schema="DESA46"
)
public class CierreEfe  implements java.io.Serializable {


     private CierreEfeId id;
     private BigDecimal saldo;

    public CierreEfe() {
    }

	
    public CierreEfe(CierreEfeId id) {
        this.id = id;
    }
    public CierreEfe(CierreEfeId id, BigDecimal saldo) {
       this.id = id;
       this.saldo = saldo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="anoCierre", column=@Column(name="ANO_CIERRE", nullable=false, length=4) ), 
        @AttributeOverride(name="mesCierre", column=@Column(name="MES_CIERRE", nullable=false, length=2) ) } )
    public CierreEfeId getId() {
        return this.id;
    }
    
    public void setId(CierreEfeId id) {
        this.id = id;
    }

    
    @Column(name="SALDO", precision=17)
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }




}


