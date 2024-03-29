package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArckmmId generated by hbm2java
 */
@Embeddable
public class ArckmmId  implements java.io.Serializable {


     private int noDocu;
     private String noCia;

    public ArckmmId() {
    }

    public ArckmmId(int noDocu, String noCia) {
       this.noDocu = noDocu;
       this.noCia = noCia;
    }
   


    @Column(name="NO_DOCU", nullable=false, precision=8, scale=0)
    public int getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(int noDocu) {
        this.noDocu = noDocu;
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
		 if ( !(other instanceof ArckmmId) ) return false;
		 ArckmmId castOther = ( ArckmmId ) other; 
         
		 return (this.getNoDocu()==castOther.getNoDocu())
 && ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNoDocu();
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         return result;
   }   


}


