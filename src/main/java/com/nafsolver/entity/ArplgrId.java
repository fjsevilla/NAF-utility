package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplgrId generated by hbm2java
 */
@Embeddable
public class ArplgrId  implements java.io.Serializable {


     private String noCia;
     private String noAcumgr;

    public ArplgrId() {
    }

    public ArplgrId(String noCia, String noAcumgr) {
       this.noCia = noCia;
       this.noAcumgr = noAcumgr;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_ACUMGR", nullable=false, length=10)
    public String getNoAcumgr() {
        return this.noAcumgr;
    }
    
    public void setNoAcumgr(String noAcumgr) {
        this.noAcumgr = noAcumgr;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplgrId) ) return false;
		 ArplgrId castOther = ( ArplgrId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoAcumgr()==castOther.getNoAcumgr()) || ( this.getNoAcumgr()!=null && castOther.getNoAcumgr()!=null && this.getNoAcumgr().equals(castOther.getNoAcumgr()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoAcumgr() == null ? 0 : this.getNoAcumgr().hashCode() );
         return result;
   }   


}


