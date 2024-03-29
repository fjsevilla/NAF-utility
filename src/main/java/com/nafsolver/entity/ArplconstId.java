package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplconstId generated by hbm2java
 */
@Embeddable
public class ArplconstId  implements java.io.Serializable {


     private String noCia;
     private String noConst;

    public ArplconstId() {
    }

    public ArplconstId(String noCia, String noConst) {
       this.noCia = noCia;
       this.noConst = noConst;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_CONST", nullable=false, length=10)
    public String getNoConst() {
        return this.noConst;
    }
    
    public void setNoConst(String noConst) {
        this.noConst = noConst;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplconstId) ) return false;
		 ArplconstId castOther = ( ArplconstId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoConst()==castOther.getNoConst()) || ( this.getNoConst()!=null && castOther.getNoConst()!=null && this.getNoConst().equals(castOther.getNoConst()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoConst() == null ? 0 : this.getNoConst().hashCode() );
         return result;
   }   


}


