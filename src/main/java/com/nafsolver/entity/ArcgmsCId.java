package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcgmsCId generated by hbm2java
 */
@Embeddable
public class ArcgmsCId  implements java.io.Serializable {


     private String cc1;
     private String cc2;
     private String cc3;
     private String cuenta;
     private String noCia;

    public ArcgmsCId() {
    }

    public ArcgmsCId(String cc1, String cc2, String cc3, String cuenta, String noCia) {
       this.cc1 = cc1;
       this.cc2 = cc2;
       this.cc3 = cc3;
       this.cuenta = cuenta;
       this.noCia = noCia;
    }
   


    @Column(name="CC_1", nullable=false, length=3)
    public String getCc1() {
        return this.cc1;
    }
    
    public void setCc1(String cc1) {
        this.cc1 = cc1;
    }


    @Column(name="CC_2", nullable=false, length=3)
    public String getCc2() {
        return this.cc2;
    }
    
    public void setCc2(String cc2) {
        this.cc2 = cc2;
    }


    @Column(name="CC_3", nullable=false, length=3)
    public String getCc3() {
        return this.cc3;
    }
    
    public void setCc3(String cc3) {
        this.cc3 = cc3;
    }


    @Column(name="CUENTA", nullable=false, length=15)
    public String getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
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
		 if ( !(other instanceof ArcgmsCId) ) return false;
		 ArcgmsCId castOther = ( ArcgmsCId ) other; 
         
		 return ( (this.getCc1()==castOther.getCc1()) || ( this.getCc1()!=null && castOther.getCc1()!=null && this.getCc1().equals(castOther.getCc1()) ) )
 && ( (this.getCc2()==castOther.getCc2()) || ( this.getCc2()!=null && castOther.getCc2()!=null && this.getCc2().equals(castOther.getCc2()) ) )
 && ( (this.getCc3()==castOther.getCc3()) || ( this.getCc3()!=null && castOther.getCc3()!=null && this.getCc3().equals(castOther.getCc3()) ) )
 && ( (this.getCuenta()==castOther.getCuenta()) || ( this.getCuenta()!=null && castOther.getCuenta()!=null && this.getCuenta().equals(castOther.getCuenta()) ) )
 && ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCc1() == null ? 0 : this.getCc1().hashCode() );
         result = 37 * result + ( getCc2() == null ? 0 : this.getCc2().hashCode() );
         result = 37 * result + ( getCc3() == null ? 0 : this.getCc3().hashCode() );
         result = 37 * result + ( getCuenta() == null ? 0 : this.getCuenta().hashCode() );
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         return result;
   }   


}


