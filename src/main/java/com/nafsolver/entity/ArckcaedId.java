package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArckcaedId generated by hbm2java
 */
@Embeddable
public class ArckcaedId  implements java.io.Serializable {


     private String noCia;
     private int noDocu;
     private int noDocuR;

    public ArckcaedId() {
    }

    public ArckcaedId(String noCia, int noDocu, int noDocuR) {
       this.noCia = noCia;
       this.noDocu = noDocu;
       this.noDocuR = noDocuR;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_DOCU", nullable=false, precision=8, scale=0)
    public int getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(int noDocu) {
        this.noDocu = noDocu;
    }


    @Column(name="NO_DOCU_R", nullable=false, precision=8, scale=0)
    public int getNoDocuR() {
        return this.noDocuR;
    }
    
    public void setNoDocuR(int noDocuR) {
        this.noDocuR = noDocuR;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArckcaedId) ) return false;
		 ArckcaedId castOther = ( ArckcaedId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && (this.getNoDocu()==castOther.getNoDocu())
 && (this.getNoDocuR()==castOther.getNoDocuR());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + this.getNoDocu();
         result = 37 * result + this.getNoDocuR();
         return result;
   }   


}


