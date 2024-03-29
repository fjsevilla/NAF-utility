package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcgcdmId generated by hbm2java
 */
@Embeddable
public class ArcgcdmId  implements java.io.Serializable {


     private String noCia;
     private String codDiario;
     private String modulo;

    public ArcgcdmId() {
    }

    public ArcgcdmId(String noCia, String codDiario, String modulo) {
       this.noCia = noCia;
       this.codDiario = codDiario;
       this.modulo = modulo;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="COD_DIARIO", nullable=false, length=5)
    public String getCodDiario() {
        return this.codDiario;
    }
    
    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }


    @Column(name="MODULO", nullable=false, length=2)
    public String getModulo() {
        return this.modulo;
    }
    
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcgcdmId) ) return false;
		 ArcgcdmId castOther = ( ArcgcdmId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCodDiario()==castOther.getCodDiario()) || ( this.getCodDiario()!=null && castOther.getCodDiario()!=null && this.getCodDiario().equals(castOther.getCodDiario()) ) )
 && ( (this.getModulo()==castOther.getModulo()) || ( this.getModulo()!=null && castOther.getModulo()!=null && this.getModulo().equals(castOther.getModulo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCodDiario() == null ? 0 : this.getCodDiario().hashCode() );
         result = 37 * result + ( getModulo() == null ? 0 : this.getModulo().hashCode() );
         return result;
   }   


}


