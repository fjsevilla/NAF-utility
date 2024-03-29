package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArckmcId generated by hbm2java
 */
@Embeddable
public class ArckmcId  implements java.io.Serializable {


     private String noCta;
     private String noCia;

    public ArckmcId() {
    }

    public ArckmcId(String noCta, String noCia) {
       this.noCta = noCta;
       this.noCia = noCia;
    }
   


    @Column(name="NO_CTA", nullable=false, length=15)
    public String getNoCta() {
        return this.noCta;
    }
    
    public void setNoCta(String noCta) {
        this.noCta = noCta;
    }


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArckmcId) ) return false;
		 ArckmcId castOther = ( ArckmcId ) other; 
         
		 return ( (this.getNoCta()==castOther.getNoCta()) || ( this.getNoCta()!=null && castOther.getNoCta()!=null && this.getNoCta().equals(castOther.getNoCta()) ) )
 && ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCta() == null ? 0 : this.getNoCta().hashCode() );
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         return result;
   }   


}


