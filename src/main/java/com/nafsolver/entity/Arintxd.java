package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Arintxd generated by hbm2java
 */
@Entity
@Table(name="ARINTXD"
    ,schema="DESA46"
)
public class Arintxd  implements java.io.Serializable {


     private ArintxdId id;

    public Arintxd() {
    }

    public Arintxd(ArintxdId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="tipoClasif", column=@Column(name="TIPO_CLASIF", nullable=false, length=2) ), 
        @AttributeOverride(name="codClasif", column=@Column(name="COD_CLASIF", nullable=false, length=15) ), 
        @AttributeOverride(name="talla", column=@Column(name="TALLA", nullable=false, precision=4, scale=1) ) } )
    public ArintxdId getId() {
        return this.id;
    }
    
    public void setId(ArintxdId id) {
        this.id = id;
    }




}

