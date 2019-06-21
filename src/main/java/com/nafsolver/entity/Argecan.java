package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Argecan generated by hbm2java
 */
@Entity
@Table(name="ARGECAN"
    ,schema="DESA46"
)
public class Argecan  implements java.io.Serializable {


     private ArgecanId id;
     private String descripcion;
     private Byte jerarquia;

    public Argecan() {
    }

	
    public Argecan(ArgecanId id) {
        this.id = id;
    }
    public Argecan(ArgecanId id, String descripcion, Byte jerarquia) {
       this.id = id;
       this.descripcion = descripcion;
       this.jerarquia = jerarquia;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pais", column=@Column(name="PAIS", nullable=false, length=6) ), 
        @AttributeOverride(name="provincia", column=@Column(name="PROVINCIA", nullable=false, length=6) ), 
        @AttributeOverride(name="canton", column=@Column(name="CANTON", nullable=false, length=6) ) } )
    public ArgecanId getId() {
        return this.id;
    }
    
    public void setId(ArgecanId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPCION", length=25)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="JERARQUIA", precision=2, scale=0)
    public Byte getJerarquia() {
        return this.jerarquia;
    }
    
    public void setJerarquia(Byte jerarquia) {
        this.jerarquia = jerarquia;
    }




}

