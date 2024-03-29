package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArinvtmId generated by hbm2java
 */
@Embeddable
public class ArinvtmId  implements java.io.Serializable {


     private String noCia;
     private String tipoM;

    public ArinvtmId() {
    }

    public ArinvtmId(String noCia, String tipoM) {
       this.noCia = noCia;
       this.tipoM = tipoM;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="TIPO_M", nullable=false, length=2)
    public String getTipoM() {
        return this.tipoM;
    }
    
    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArinvtmId) ) return false;
		 ArinvtmId castOther = ( ArinvtmId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getTipoM()==castOther.getTipoM()) || ( this.getTipoM()!=null && castOther.getTipoM()!=null && this.getTipoM().equals(castOther.getTipoM()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getTipoM() == null ? 0 : this.getTipoM().hashCode() );
         return result;
   }   


}


