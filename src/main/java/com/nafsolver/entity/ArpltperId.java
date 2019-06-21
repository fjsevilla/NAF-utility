package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArpltperId generated by hbm2java
 */
@Embeddable
public class ArpltperId  implements java.io.Serializable {


     private String noCia;
     private String codTp;

    public ArpltperId() {
    }

    public ArpltperId(String noCia, String codTp) {
       this.noCia = noCia;
       this.codTp = codTp;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="COD_TP", nullable=false, length=2)
    public String getCodTp() {
        return this.codTp;
    }
    
    public void setCodTp(String codTp) {
        this.codTp = codTp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArpltperId) ) return false;
		 ArpltperId castOther = ( ArpltperId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCodTp()==castOther.getCodTp()) || ( this.getCodTp()!=null && castOther.getCodTp()!=null && this.getCodTp().equals(castOther.getCodTp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCodTp() == null ? 0 : this.getCodTp().hashCode() );
         return result;
   }   


}

