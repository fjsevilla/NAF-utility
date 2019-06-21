package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArinrelacionId generated by hbm2java
 */
@Embeddable
public class ArinrelacionId  implements java.io.Serializable {


     private String noCia;
     private String noArti;
     private String vendedor;
     private String barra;

    public ArinrelacionId() {
    }

    public ArinrelacionId(String noCia, String noArti, String vendedor, String barra) {
       this.noCia = noCia;
       this.noArti = noArti;
       this.vendedor = vendedor;
       this.barra = barra;
    }
   


    @Column(name="NO_CIA", nullable=false, length=3)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_ARTI", nullable=false, length=30)
    public String getNoArti() {
        return this.noArti;
    }
    
    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }


    @Column(name="VENDEDOR", nullable=false, length=3)
    public String getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }


    @Column(name="BARRA", nullable=false, length=24)
    public String getBarra() {
        return this.barra;
    }
    
    public void setBarra(String barra) {
        this.barra = barra;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArinrelacionId) ) return false;
		 ArinrelacionId castOther = ( ArinrelacionId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoArti()==castOther.getNoArti()) || ( this.getNoArti()!=null && castOther.getNoArti()!=null && this.getNoArti().equals(castOther.getNoArti()) ) )
 && ( (this.getVendedor()==castOther.getVendedor()) || ( this.getVendedor()!=null && castOther.getVendedor()!=null && this.getVendedor().equals(castOther.getVendedor()) ) )
 && ( (this.getBarra()==castOther.getBarra()) || ( this.getBarra()!=null && castOther.getBarra()!=null && this.getBarra().equals(castOther.getBarra()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoArti() == null ? 0 : this.getNoArti().hashCode() );
         result = 37 * result + ( getVendedor() == null ? 0 : this.getVendedor().hashCode() );
         result = 37 * result + ( getBarra() == null ? 0 : this.getBarra().hashCode() );
         return result;
   }   


}

