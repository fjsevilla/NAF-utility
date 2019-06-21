package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplcalId generated by hbm2java
 */
@Embeddable
public class ArplcalId  implements java.io.Serializable {


     private String noCia;
     private String codCal;

    public ArplcalId() {
    }

    public ArplcalId(String noCia, String codCal) {
       this.noCia = noCia;
       this.codCal = codCal;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="COD_CAL", nullable=false, length=10)
    public String getCodCal() {
        return this.codCal;
    }
    
    public void setCodCal(String codCal) {
        this.codCal = codCal;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplcalId) ) return false;
		 ArplcalId castOther = ( ArplcalId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCodCal()==castOther.getCodCal()) || ( this.getCodCal()!=null && castOther.getCodCal()!=null && this.getCodCal().equals(castOther.getCodCal()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCodCal() == null ? 0 : this.getCodCal().hashCode() );
         return result;
   }   


}

