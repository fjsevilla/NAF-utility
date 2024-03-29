package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Calendario generated by hbm2java
 */
@Entity
@Table(name="CALENDARIO"
    ,schema="DESA46"
)
public class Calendario  implements java.io.Serializable {


     private CalendarioId id;
     private Date fecha1;
     private Date fecha2;
     private BigDecimal mes;
     private BigDecimal diasHabiles;

    public Calendario() {
    }

	
    public Calendario(CalendarioId id) {
        this.id = id;
    }
    public Calendario(CalendarioId id, Date fecha1, Date fecha2, BigDecimal mes, BigDecimal diasHabiles) {
       this.id = id;
       this.fecha1 = fecha1;
       this.fecha2 = fecha2;
       this.mes = mes;
       this.diasHabiles = diasHabiles;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="ano", column=@Column(name="ANO", nullable=false, precision=4, scale=0) ), 
        @AttributeOverride(name="semana", column=@Column(name="SEMANA", nullable=false, precision=2, scale=0) ), 
        @AttributeOverride(name="indicador", column=@Column(name="INDICADOR", nullable=false, length=1) ) } )
    public CalendarioId getId() {
        return this.id;
    }
    
    public void setId(CalendarioId id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA1", length=7)
    public Date getFecha1() {
        return this.fecha1;
    }
    
    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA2", length=7)
    public Date getFecha2() {
        return this.fecha2;
    }
    
    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    
    @Column(name="MES", precision=22, scale=0)
    public BigDecimal getMes() {
        return this.mes;
    }
    
    public void setMes(BigDecimal mes) {
        this.mes = mes;
    }

    
    @Column(name="DIAS_HABILES", precision=22, scale=0)
    public BigDecimal getDiasHabiles() {
        return this.diasHabiles;
    }
    
    public void setDiasHabiles(BigDecimal diasHabiles) {
        this.diasHabiles = diasHabiles;
    }




}


