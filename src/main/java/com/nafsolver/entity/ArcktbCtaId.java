package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcktbCtaId generated by hbm2java
 */
@Embeddable
public class ArcktbCtaId  implements java.io.Serializable {


     private String noCia;
     private String noCta;
     private String tipoMovExt;

    public ArcktbCtaId() {
    }

    public ArcktbCtaId(String noCia, String noCta, String tipoMovExt) {
       this.noCia = noCia;
       this.noCta = noCta;
       this.tipoMovExt = tipoMovExt;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_CTA", nullable=false, length=15)
    public String getNoCta() {
        return this.noCta;
    }
    
    public void setNoCta(String noCta) {
        this.noCta = noCta;
    }


    @Column(name="TIPO_MOV_EXT", nullable=false, length=30)
    public String getTipoMovExt() {
        return this.tipoMovExt;
    }
    
    public void setTipoMovExt(String tipoMovExt) {
        this.tipoMovExt = tipoMovExt;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcktbCtaId) ) return false;
		 ArcktbCtaId castOther = ( ArcktbCtaId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoCta()==castOther.getNoCta()) || ( this.getNoCta()!=null && castOther.getNoCta()!=null && this.getNoCta().equals(castOther.getNoCta()) ) )
 && ( (this.getTipoMovExt()==castOther.getTipoMovExt()) || ( this.getTipoMovExt()!=null && castOther.getTipoMovExt()!=null && this.getTipoMovExt().equals(castOther.getTipoMovExt()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoCta() == null ? 0 : this.getNoCta().hashCode() );
         result = 37 * result + ( getTipoMovExt() == null ? 0 : this.getTipoMovExt().hashCode() );
         return result;
   }   


}


