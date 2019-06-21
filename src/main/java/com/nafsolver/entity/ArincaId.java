package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArincaId generated by hbm2java
 */
@Embeddable
public class ArincaId  implements java.io.Serializable {


     private String noCia;
     private String codigo;

    public ArincaId() {
    }

    public ArincaId(String noCia, String codigo) {
       this.noCia = noCia;
       this.codigo = codigo;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="CODIGO", nullable=false, length=3)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArincaId) ) return false;
		 ArincaId castOther = ( ArincaId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCodigo()==castOther.getCodigo()) || ( this.getCodigo()!=null && castOther.getCodigo()!=null && this.getCodigo().equals(castOther.getCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCodigo() == null ? 0 : this.getCodigo().hashCode() );
         return result;
   }   


}


