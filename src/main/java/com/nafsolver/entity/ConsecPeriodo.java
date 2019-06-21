package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ConsecPeriodo generated by hbm2java
 */
@Entity
@Table(name="CONSEC_PERIODO"
    ,schema="DESA46"
)
public class ConsecPeriodo  implements java.io.Serializable {


     private ConsecPeriodoId id;
     private Long siguiente;
     private Long numInicial;
     private Long numFinal;

    public ConsecPeriodo() {
    }

	
    public ConsecPeriodo(ConsecPeriodoId id) {
        this.id = id;
    }
    public ConsecPeriodo(ConsecPeriodoId id, Long siguiente, Long numInicial, Long numFinal) {
       this.id = id;
       this.siguiente = siguiente;
       this.numInicial = numInicial;
       this.numFinal = numFinal;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="formulario", column=@Column(name="FORMULARIO", nullable=false, length=10) ), 
        @AttributeOverride(name="periodo", column=@Column(name="PERIODO", nullable=false, precision=6, scale=0) ) } )
    public ConsecPeriodoId getId() {
        return this.id;
    }
    
    public void setId(ConsecPeriodoId id) {
        this.id = id;
    }

    
    @Column(name="SIGUIENTE", precision=10, scale=0)
    public Long getSiguiente() {
        return this.siguiente;
    }
    
    public void setSiguiente(Long siguiente) {
        this.siguiente = siguiente;
    }

    
    @Column(name="NUM_INICIAL", precision=10, scale=0)
    public Long getNumInicial() {
        return this.numInicial;
    }
    
    public void setNumInicial(Long numInicial) {
        this.numInicial = numInicial;
    }

    
    @Column(name="NUM_FINAL", precision=10, scale=0)
    public Long getNumFinal() {
        return this.numFinal;
    }
    
    public void setNumFinal(Long numFinal) {
        this.numFinal = numFinal;
    }




}

