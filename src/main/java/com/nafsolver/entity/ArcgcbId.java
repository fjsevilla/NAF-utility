package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcgcbId generated by hbm2java
 */
@Embeddable
public class ArcgcbId  implements java.io.Serializable {


     private String noCia;
     private String codBalance;
     private String cuenta;

    public ArcgcbId() {
    }

    public ArcgcbId(String noCia, String codBalance, String cuenta) {
       this.noCia = noCia;
       this.codBalance = codBalance;
       this.cuenta = cuenta;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="COD_BALANCE", nullable=false, length=2)
    public String getCodBalance() {
        return this.codBalance;
    }
    
    public void setCodBalance(String codBalance) {
        this.codBalance = codBalance;
    }


    @Column(name="CUENTA", nullable=false, length=15)
    public String getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcgcbId) ) return false;
		 ArcgcbId castOther = ( ArcgcbId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCodBalance()==castOther.getCodBalance()) || ( this.getCodBalance()!=null && castOther.getCodBalance()!=null && this.getCodBalance().equals(castOther.getCodBalance()) ) )
 && ( (this.getCuenta()==castOther.getCuenta()) || ( this.getCuenta()!=null && castOther.getCuenta()!=null && this.getCuenta().equals(castOther.getCuenta()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCodBalance() == null ? 0 : this.getCodBalance().hashCode() );
         result = 37 * result + ( getCuenta() == null ? 0 : this.getCuenta().hashCode() );
         return result;
   }   


}

