package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArfaflchId generated by hbm2java
 */
@Embeddable
public class ArfaflchId  implements java.io.Serializable {


     private String noCia;
     private String noFactu;
     private Integer noLinea;

    public ArfaflchId() {
    }

    public ArfaflchId(String noCia, String noFactu, Integer noLinea) {
       this.noCia = noCia;
       this.noFactu = noFactu;
       this.noLinea = noLinea;
    }
   


    @Column(name="NO_CIA", length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_FACTU", length=19)
    public String getNoFactu() {
        return this.noFactu;
    }
    
    public void setNoFactu(String noFactu) {
        this.noFactu = noFactu;
    }


    @Column(name="NO_LINEA", precision=5, scale=0)
    public Integer getNoLinea() {
        return this.noLinea;
    }
    
    public void setNoLinea(Integer noLinea) {
        this.noLinea = noLinea;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArfaflchId) ) return false;
		 ArfaflchId castOther = ( ArfaflchId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoFactu()==castOther.getNoFactu()) || ( this.getNoFactu()!=null && castOther.getNoFactu()!=null && this.getNoFactu().equals(castOther.getNoFactu()) ) )
 && ( (this.getNoLinea()==castOther.getNoLinea()) || ( this.getNoLinea()!=null && castOther.getNoLinea()!=null && this.getNoLinea().equals(castOther.getNoLinea()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoFactu() == null ? 0 : this.getNoFactu().hashCode() );
         result = 37 * result + ( getNoLinea() == null ? 0 : this.getNoLinea().hashCode() );
         return result;
   }   


}


