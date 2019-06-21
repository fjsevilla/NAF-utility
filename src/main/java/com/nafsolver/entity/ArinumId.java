package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArinumId generated by hbm2java
 */
@Embeddable
public class ArinumId  implements java.io.Serializable {


     private String noCia;
     private String unidad;

    public ArinumId() {
    }

    public ArinumId(String noCia, String unidad) {
       this.noCia = noCia;
       this.unidad = unidad;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="UNIDAD", nullable=false, length=2)
    public String getUnidad() {
        return this.unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArinumId) ) return false;
		 ArinumId castOther = ( ArinumId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getUnidad()==castOther.getUnidad()) || ( this.getUnidad()!=null && castOther.getUnidad()!=null && this.getUnidad().equals(castOther.getUnidad()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getUnidad() == null ? 0 : this.getUnidad().hashCode() );
         return result;
   }   


}

