package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplteId generated by hbm2java
 */
@Embeddable
public class ArplteId  implements java.io.Serializable {


     private String noCia;
     private String tipoEmp;

    public ArplteId() {
    }

    public ArplteId(String noCia, String tipoEmp) {
       this.noCia = noCia;
       this.tipoEmp = tipoEmp;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="TIPO_EMP", nullable=false, length=2)
    public String getTipoEmp() {
        return this.tipoEmp;
    }
    
    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplteId) ) return false;
		 ArplteId castOther = ( ArplteId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getTipoEmp()==castOther.getTipoEmp()) || ( this.getTipoEmp()!=null && castOther.getTipoEmp()!=null && this.getTipoEmp().equals(castOther.getTipoEmp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getTipoEmp() == null ? 0 : this.getTipoEmp().hashCode() );
         return result;
   }   


}

