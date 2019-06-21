package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Modelos generated by hbm2java
 */
@Entity
@Table(name="MODELOS"
    ,schema="DESA46"
)
public class Modelos  implements java.io.Serializable {


     private ModelosId id;
     private String xmodelo;

    public Modelos() {
    }

	
    public Modelos(ModelosId id) {
        this.id = id;
    }
    public Modelos(ModelosId id, String xmodelo) {
       this.id = id;
       this.xmodelo = xmodelo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="cmarca", column=@Column(name="CMARCA", nullable=false, length=6) ), 
        @AttributeOverride(name="cmodelo", column=@Column(name="CMODELO", nullable=false, length=25) ) } )
    public ModelosId getId() {
        return this.id;
    }
    
    public void setId(ModelosId id) {
        this.id = id;
    }

    
    @Column(name="XMODELO", length=50)
    public String getXmodelo() {
        return this.xmodelo;
    }
    
    public void setXmodelo(String xmodelo) {
        this.xmodelo = xmodelo;
    }




}

