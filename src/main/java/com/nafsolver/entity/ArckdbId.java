package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArckdbId generated by hbm2java
 */
@Embeddable
public class ArckdbId  implements java.io.Serializable {


     private String noCia;
     private String banco;
     private String tipoDocb;

    public ArckdbId() {
    }

    public ArckdbId(String noCia, String banco, String tipoDocb) {
       this.noCia = noCia;
       this.banco = banco;
       this.tipoDocb = tipoDocb;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="BANCO", nullable=false, length=2)
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }


    @Column(name="TIPO_DOCB", nullable=false, length=10)
    public String getTipoDocb() {
        return this.tipoDocb;
    }
    
    public void setTipoDocb(String tipoDocb) {
        this.tipoDocb = tipoDocb;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArckdbId) ) return false;
		 ArckdbId castOther = ( ArckdbId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getBanco()==castOther.getBanco()) || ( this.getBanco()!=null && castOther.getBanco()!=null && this.getBanco().equals(castOther.getBanco()) ) )
 && ( (this.getTipoDocb()==castOther.getTipoDocb()) || ( this.getTipoDocb()!=null && castOther.getTipoDocb()!=null && this.getTipoDocb().equals(castOther.getTipoDocb()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getBanco() == null ? 0 : this.getBanco().hashCode() );
         result = 37 * result + ( getTipoDocb() == null ? 0 : this.getTipoDocb().hashCode() );
         return result;
   }   


}


