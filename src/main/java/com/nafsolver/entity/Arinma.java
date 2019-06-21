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
import javax.persistence.UniqueConstraint;

/**
 * Arinma generated by hbm2java
 */
@Entity
@Table(name="ARINMA"
    ,schema="DESA46"
    , uniqueConstraints = @UniqueConstraint(columnNames={"NO_CIA", "BODEGA", "NO_ARTI"}) 
)
public class Arinma  implements java.io.Serializable {


     private ArinmaId id;
     private String ubicacion;
     private BigDecimal salAntUn;
     private BigDecimal compUn;
     private BigDecimal otrsUn;
     private BigDecimal ventUn;
     private BigDecimal consUn;
     private BigDecimal salPendUn;
     private BigDecimal entPendUn;
     private BigDecimal pedidosPend;
     private BigDecimal manifiestopend;
     private BigDecimal salAntMo;
     private BigDecimal compMon;
     private BigDecimal otrsMon;
     private BigDecimal ventMon;
     private BigDecimal consMon;
     private BigDecimal costoUni;
     private BigDecimal tomFisic;
     private String procesoToma;
     private String procesoSoli;
     private String noSolic;
     private BigDecimal ultCosto;
     private BigDecimal existPrep;
     private BigDecimal costoPrep;
     private String afectaCosto;
     private Date fecUVen;
     private Long noConteo;
     private BigDecimal costoUniDol;
     private BigDecimal tipoCambio;
     private Date fecUEnt;
     private Date fecUTom;
     private Date tstamp;
     private String column1;
     private String column2;
     private String column3;
     private String column4;
     private String column5;
     private String column6;
     private String column7;
     private String column8;
     private String column9;
     private String column10;
     private String column11;
     private BigDecimal salAntMoRes;
     private BigDecimal otrsMonRes;
     private BigDecimal costoUniRes;
     private BigDecimal ultCostoRes;

    public Arinma() {
    }

	
    public Arinma(ArinmaId id, String procesoToma) {
        this.id = id;
        this.procesoToma = procesoToma;
    }
    public Arinma(ArinmaId id, String ubicacion, BigDecimal salAntUn, BigDecimal compUn, BigDecimal otrsUn, BigDecimal ventUn, BigDecimal consUn, BigDecimal salPendUn, BigDecimal entPendUn, BigDecimal pedidosPend, BigDecimal manifiestopend, BigDecimal salAntMo, BigDecimal compMon, BigDecimal otrsMon, BigDecimal ventMon, BigDecimal consMon, BigDecimal costoUni, BigDecimal tomFisic, String procesoToma, String procesoSoli, String noSolic, BigDecimal ultCosto, BigDecimal existPrep, BigDecimal costoPrep, String afectaCosto, Date fecUVen, Long noConteo, BigDecimal costoUniDol, BigDecimal tipoCambio, Date fecUEnt, Date fecUTom, Date tstamp, String column1, String column2, String column3, String column4, String column5, String column6, String column7, String column8, String column9, String column10, String column11, BigDecimal salAntMoRes, BigDecimal otrsMonRes, BigDecimal costoUniRes, BigDecimal ultCostoRes) {
       this.id = id;
       this.ubicacion = ubicacion;
       this.salAntUn = salAntUn;
       this.compUn = compUn;
       this.otrsUn = otrsUn;
       this.ventUn = ventUn;
       this.consUn = consUn;
       this.salPendUn = salPendUn;
       this.entPendUn = entPendUn;
       this.pedidosPend = pedidosPend;
       this.manifiestopend = manifiestopend;
       this.salAntMo = salAntMo;
       this.compMon = compMon;
       this.otrsMon = otrsMon;
       this.ventMon = ventMon;
       this.consMon = consMon;
       this.costoUni = costoUni;
       this.tomFisic = tomFisic;
       this.procesoToma = procesoToma;
       this.procesoSoli = procesoSoli;
       this.noSolic = noSolic;
       this.ultCosto = ultCosto;
       this.existPrep = existPrep;
       this.costoPrep = costoPrep;
       this.afectaCosto = afectaCosto;
       this.fecUVen = fecUVen;
       this.noConteo = noConteo;
       this.costoUniDol = costoUniDol;
       this.tipoCambio = tipoCambio;
       this.fecUEnt = fecUEnt;
       this.fecUTom = fecUTom;
       this.tstamp = tstamp;
       this.column1 = column1;
       this.column2 = column2;
       this.column3 = column3;
       this.column4 = column4;
       this.column5 = column5;
       this.column6 = column6;
       this.column7 = column7;
       this.column8 = column8;
       this.column9 = column9;
       this.column10 = column10;
       this.column11 = column11;
       this.salAntMoRes = salAntMoRes;
       this.otrsMonRes = otrsMonRes;
       this.costoUniRes = costoUniRes;
       this.ultCostoRes = ultCostoRes;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="noCia", column=@Column(name="NO_CIA", nullable=false, length=2) ), 
        @AttributeOverride(name="bodega", column=@Column(name="BODEGA", nullable=false, length=4) ), 
        @AttributeOverride(name="clase", column=@Column(name="CLASE", nullable=false, length=3) ), 
        @AttributeOverride(name="categoria", column=@Column(name="CATEGORIA", nullable=false, length=3) ), 
        @AttributeOverride(name="noArti", column=@Column(name="NO_ARTI", nullable=false, length=30) ) } )
    public ArinmaId getId() {
        return this.id;
    }
    
    public void setId(ArinmaId id) {
        this.id = id;
    }

    
    @Column(name="UBICACION", length=10)
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    @Column(name="SAL_ANT_UN", precision=17)
    public BigDecimal getSalAntUn() {
        return this.salAntUn;
    }
    
    public void setSalAntUn(BigDecimal salAntUn) {
        this.salAntUn = salAntUn;
    }

    
    @Column(name="COMP_UN", precision=17)
    public BigDecimal getCompUn() {
        return this.compUn;
    }
    
    public void setCompUn(BigDecimal compUn) {
        this.compUn = compUn;
    }

    
    @Column(name="OTRS_UN", precision=17)
    public BigDecimal getOtrsUn() {
        return this.otrsUn;
    }
    
    public void setOtrsUn(BigDecimal otrsUn) {
        this.otrsUn = otrsUn;
    }

    
    @Column(name="VENT_UN", precision=17)
    public BigDecimal getVentUn() {
        return this.ventUn;
    }
    
    public void setVentUn(BigDecimal ventUn) {
        this.ventUn = ventUn;
    }

    
    @Column(name="CONS_UN", precision=17)
    public BigDecimal getConsUn() {
        return this.consUn;
    }
    
    public void setConsUn(BigDecimal consUn) {
        this.consUn = consUn;
    }

    
    @Column(name="SAL_PEND_UN", precision=17)
    public BigDecimal getSalPendUn() {
        return this.salPendUn;
    }
    
    public void setSalPendUn(BigDecimal salPendUn) {
        this.salPendUn = salPendUn;
    }

    
    @Column(name="ENT_PEND_UN", precision=17)
    public BigDecimal getEntPendUn() {
        return this.entPendUn;
    }
    
    public void setEntPendUn(BigDecimal entPendUn) {
        this.entPendUn = entPendUn;
    }

    
    @Column(name="PEDIDOS_PEND", precision=17)
    public BigDecimal getPedidosPend() {
        return this.pedidosPend;
    }
    
    public void setPedidosPend(BigDecimal pedidosPend) {
        this.pedidosPend = pedidosPend;
    }

    
    @Column(name="MANIFIESTOPEND", precision=17)
    public BigDecimal getManifiestopend() {
        return this.manifiestopend;
    }
    
    public void setManifiestopend(BigDecimal manifiestopend) {
        this.manifiestopend = manifiestopend;
    }

    
    @Column(name="SAL_ANT_MO", precision=22)
    public BigDecimal getSalAntMo() {
        return this.salAntMo;
    }
    
    public void setSalAntMo(BigDecimal salAntMo) {
        this.salAntMo = salAntMo;
    }

    
    @Column(name="COMP_MON", precision=22)
    public BigDecimal getCompMon() {
        return this.compMon;
    }
    
    public void setCompMon(BigDecimal compMon) {
        this.compMon = compMon;
    }

    
    @Column(name="OTRS_MON", precision=22)
    public BigDecimal getOtrsMon() {
        return this.otrsMon;
    }
    
    public void setOtrsMon(BigDecimal otrsMon) {
        this.otrsMon = otrsMon;
    }

    
    @Column(name="VENT_MON", precision=22)
    public BigDecimal getVentMon() {
        return this.ventMon;
    }
    
    public void setVentMon(BigDecimal ventMon) {
        this.ventMon = ventMon;
    }

    
    @Column(name="CONS_MON", precision=22)
    public BigDecimal getConsMon() {
        return this.consMon;
    }
    
    public void setConsMon(BigDecimal consMon) {
        this.consMon = consMon;
    }

    
    @Column(name="COSTO_UNI", precision=22, scale=6)
    public BigDecimal getCostoUni() {
        return this.costoUni;
    }
    
    public void setCostoUni(BigDecimal costoUni) {
        this.costoUni = costoUni;
    }

    
    @Column(name="TOM_FISIC", precision=17)
    public BigDecimal getTomFisic() {
        return this.tomFisic;
    }
    
    public void setTomFisic(BigDecimal tomFisic) {
        this.tomFisic = tomFisic;
    }

    
    @Column(name="PROCESO_TOMA", nullable=false, length=1)
    public String getProcesoToma() {
        return this.procesoToma;
    }
    
    public void setProcesoToma(String procesoToma) {
        this.procesoToma = procesoToma;
    }

    
    @Column(name="PROCESO_SOLI", length=1)
    public String getProcesoSoli() {
        return this.procesoSoli;
    }
    
    public void setProcesoSoli(String procesoSoli) {
        this.procesoSoli = procesoSoli;
    }

    
    @Column(name="NO_SOLIC", length=8)
    public String getNoSolic() {
        return this.noSolic;
    }
    
    public void setNoSolic(String noSolic) {
        this.noSolic = noSolic;
    }

    
    @Column(name="ULT_COSTO", precision=22, scale=6)
    public BigDecimal getUltCosto() {
        return this.ultCosto;
    }
    
    public void setUltCosto(BigDecimal ultCosto) {
        this.ultCosto = ultCosto;
    }

    
    @Column(name="EXIST_PREP", precision=17)
    public BigDecimal getExistPrep() {
        return this.existPrep;
    }
    
    public void setExistPrep(BigDecimal existPrep) {
        this.existPrep = existPrep;
    }

    
    @Column(name="COSTO_PREP", precision=22, scale=6)
    public BigDecimal getCostoPrep() {
        return this.costoPrep;
    }
    
    public void setCostoPrep(BigDecimal costoPrep) {
        this.costoPrep = costoPrep;
    }

    
    @Column(name="AFECTA_COSTO", length=1)
    public String getAfectaCosto() {
        return this.afectaCosto;
    }
    
    public void setAfectaCosto(String afectaCosto) {
        this.afectaCosto = afectaCosto;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_U_VEN", length=7)
    public Date getFecUVen() {
        return this.fecUVen;
    }
    
    public void setFecUVen(Date fecUVen) {
        this.fecUVen = fecUVen;
    }

    
    @Column(name="NO_CONTEO", precision=15, scale=0)
    public Long getNoConteo() {
        return this.noConteo;
    }
    
    public void setNoConteo(Long noConteo) {
        this.noConteo = noConteo;
    }

    
    @Column(name="COSTO_UNI_DOL", precision=22, scale=6)
    public BigDecimal getCostoUniDol() {
        return this.costoUniDol;
    }
    
    public void setCostoUniDol(BigDecimal costoUniDol) {
        this.costoUniDol = costoUniDol;
    }

    
    @Column(name="TIPO_CAMBIO", precision=22, scale=4)
    public BigDecimal getTipoCambio() {
        return this.tipoCambio;
    }
    
    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_U_ENT", length=7)
    public Date getFecUEnt() {
        return this.fecUEnt;
    }
    
    public void setFecUEnt(Date fecUEnt) {
        this.fecUEnt = fecUEnt;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_U_TOM", length=7)
    public Date getFecUTom() {
        return this.fecUTom;
    }
    
    public void setFecUTom(Date fecUTom) {
        this.fecUTom = fecUTom;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TSTAMP", length=7)
    public Date getTstamp() {
        return this.tstamp;
    }
    
    public void setTstamp(Date tstamp) {
        this.tstamp = tstamp;
    }

    
    @Column(name="COLUMN1", length=20)
    public String getColumn1() {
        return this.column1;
    }
    
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    
    @Column(name="COLUMN2", length=20)
    public String getColumn2() {
        return this.column2;
    }
    
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    
    @Column(name="COLUMN3", length=20)
    public String getColumn3() {
        return this.column3;
    }
    
    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    
    @Column(name="COLUMN4", length=20)
    public String getColumn4() {
        return this.column4;
    }
    
    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    
    @Column(name="COLUMN5", length=20)
    public String getColumn5() {
        return this.column5;
    }
    
    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    
    @Column(name="COLUMN6", length=20)
    public String getColumn6() {
        return this.column6;
    }
    
    public void setColumn6(String column6) {
        this.column6 = column6;
    }

    
    @Column(name="COLUMN7", length=20)
    public String getColumn7() {
        return this.column7;
    }
    
    public void setColumn7(String column7) {
        this.column7 = column7;
    }

    
    @Column(name="COLUMN8", length=20)
    public String getColumn8() {
        return this.column8;
    }
    
    public void setColumn8(String column8) {
        this.column8 = column8;
    }

    
    @Column(name="COLUMN9", length=20)
    public String getColumn9() {
        return this.column9;
    }
    
    public void setColumn9(String column9) {
        this.column9 = column9;
    }

    
    @Column(name="COLUMN10", length=20)
    public String getColumn10() {
        return this.column10;
    }
    
    public void setColumn10(String column10) {
        this.column10 = column10;
    }

    
    @Column(name="COLUMN11", length=20)
    public String getColumn11() {
        return this.column11;
    }
    
    public void setColumn11(String column11) {
        this.column11 = column11;
    }

    
    @Column(name="SAL_ANT_MO_RES", precision=30)
    public BigDecimal getSalAntMoRes() {
        return this.salAntMoRes;
    }
    
    public void setSalAntMoRes(BigDecimal salAntMoRes) {
        this.salAntMoRes = salAntMoRes;
    }

    
    @Column(name="OTRS_MON_RES", precision=30)
    public BigDecimal getOtrsMonRes() {
        return this.otrsMonRes;
    }
    
    public void setOtrsMonRes(BigDecimal otrsMonRes) {
        this.otrsMonRes = otrsMonRes;
    }

    
    @Column(name="COSTO_UNI_RES", precision=30)
    public BigDecimal getCostoUniRes() {
        return this.costoUniRes;
    }
    
    public void setCostoUniRes(BigDecimal costoUniRes) {
        this.costoUniRes = costoUniRes;
    }

    
    @Column(name="ULT_COSTO_RES", precision=30)
    public BigDecimal getUltCostoRes() {
        return this.ultCostoRes;
    }
    
    public void setUltCostoRes(BigDecimal ultCostoRes) {
        this.ultCostoRes = ultCostoRes;
    }




}


