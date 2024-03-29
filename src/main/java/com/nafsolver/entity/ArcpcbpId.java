package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcpcbpId generated by hbm2java
 */
@Embeddable
public class ArcpcbpId  implements java.io.Serializable {


     private String noCia;
     private String noProve;
     private String banco;
     private String ctaBancaria;

    public ArcpcbpId() {
    }

    public ArcpcbpId(String noCia, String noProve, String banco, String ctaBancaria) {
       this.noCia = noCia;
       this.noProve = noProve;
       this.banco = banco;
       this.ctaBancaria = ctaBancaria;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_PROVE", nullable=false, length=15)
    public String getNoProve() {
        return this.noProve;
    }
    
    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }


    @Column(name="BANCO", nullable=false, length=2)
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }


    @Column(name="CTA_BANCARIA", nullable=false, length=20)
    public String getCtaBancaria() {
        return this.ctaBancaria;
    }
    
    public void setCtaBancaria(String ctaBancaria) {
        this.ctaBancaria = ctaBancaria;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcpcbpId) ) return false;
		 ArcpcbpId castOther = ( ArcpcbpId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoProve()==castOther.getNoProve()) || ( this.getNoProve()!=null && castOther.getNoProve()!=null && this.getNoProve().equals(castOther.getNoProve()) ) )
 && ( (this.getBanco()==castOther.getBanco()) || ( this.getBanco()!=null && castOther.getBanco()!=null && this.getBanco().equals(castOther.getBanco()) ) )
 && ( (this.getCtaBancaria()==castOther.getCtaBancaria()) || ( this.getCtaBancaria()!=null && castOther.getCtaBancaria()!=null && this.getCtaBancaria().equals(castOther.getCtaBancaria()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoProve() == null ? 0 : this.getNoProve().hashCode() );
         result = 37 * result + ( getBanco() == null ? 0 : this.getBanco().hashCode() );
         result = 37 * result + ( getCtaBancaria() == null ? 0 : this.getCtaBancaria().hashCode() );
         return result;
   }   


}


