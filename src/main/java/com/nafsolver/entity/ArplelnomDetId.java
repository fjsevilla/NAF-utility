package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplelnomDetId generated by hbm2java
 */
@Embeddable
public class ArplelnomDetId  implements java.io.Serializable {


     private String noCia;
     private String noElnom;
     private String codpla;
     private String tipoEmp;
     private String noEmple;
     private String noCpto;

    public ArplelnomDetId() {
    }

    public ArplelnomDetId(String noCia, String noElnom, String codpla, String tipoEmp, String noEmple, String noCpto) {
       this.noCia = noCia;
       this.noElnom = noElnom;
       this.codpla = codpla;
       this.tipoEmp = tipoEmp;
       this.noEmple = noEmple;
       this.noCpto = noCpto;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_ELNOM", nullable=false, length=10)
    public String getNoElnom() {
        return this.noElnom;
    }
    
    public void setNoElnom(String noElnom) {
        this.noElnom = noElnom;
    }


    @Column(name="CODPLA", nullable=false, length=2)
    public String getCodpla() {
        return this.codpla;
    }
    
    public void setCodpla(String codpla) {
        this.codpla = codpla;
    }


    @Column(name="TIPO_EMP", nullable=false, length=2)
    public String getTipoEmp() {
        return this.tipoEmp;
    }
    
    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }


    @Column(name="NO_EMPLE", nullable=false, length=10)
    public String getNoEmple() {
        return this.noEmple;
    }
    
    public void setNoEmple(String noEmple) {
        this.noEmple = noEmple;
    }


    @Column(name="NO_CPTO", nullable=false, length=10)
    public String getNoCpto() {
        return this.noCpto;
    }
    
    public void setNoCpto(String noCpto) {
        this.noCpto = noCpto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplelnomDetId) ) return false;
		 ArplelnomDetId castOther = ( ArplelnomDetId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoElnom()==castOther.getNoElnom()) || ( this.getNoElnom()!=null && castOther.getNoElnom()!=null && this.getNoElnom().equals(castOther.getNoElnom()) ) )
 && ( (this.getCodpla()==castOther.getCodpla()) || ( this.getCodpla()!=null && castOther.getCodpla()!=null && this.getCodpla().equals(castOther.getCodpla()) ) )
 && ( (this.getTipoEmp()==castOther.getTipoEmp()) || ( this.getTipoEmp()!=null && castOther.getTipoEmp()!=null && this.getTipoEmp().equals(castOther.getTipoEmp()) ) )
 && ( (this.getNoEmple()==castOther.getNoEmple()) || ( this.getNoEmple()!=null && castOther.getNoEmple()!=null && this.getNoEmple().equals(castOther.getNoEmple()) ) )
 && ( (this.getNoCpto()==castOther.getNoCpto()) || ( this.getNoCpto()!=null && castOther.getNoCpto()!=null && this.getNoCpto().equals(castOther.getNoCpto()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoElnom() == null ? 0 : this.getNoElnom().hashCode() );
         result = 37 * result + ( getCodpla() == null ? 0 : this.getCodpla().hashCode() );
         result = 37 * result + ( getTipoEmp() == null ? 0 : this.getTipoEmp().hashCode() );
         result = 37 * result + ( getNoEmple() == null ? 0 : this.getNoEmple().hashCode() );
         result = 37 * result + ( getNoCpto() == null ? 0 : this.getNoCpto().hashCode() );
         return result;
   }   


}

