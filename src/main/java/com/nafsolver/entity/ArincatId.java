package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArincatId generated by hbm2java
 */
@Embeddable
public class ArincatId  implements java.io.Serializable {


     private String noCia;
     private String clase;
     private String codigo;

    public ArincatId() {
    }

    public ArincatId(String noCia, String clase, String codigo) {
       this.noCia = noCia;
       this.clase = clase;
       this.codigo = codigo;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="CLASE", nullable=false, length=3)
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
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
		 if ( !(other instanceof ArincatId) ) return false;
		 ArincatId castOther = ( ArincatId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getClase()==castOther.getClase()) || ( this.getClase()!=null && castOther.getClase()!=null && this.getClase().equals(castOther.getClase()) ) )
 && ( (this.getCodigo()==castOther.getCodigo()) || ( this.getCodigo()!=null && castOther.getCodigo()!=null && this.getCodigo().equals(castOther.getCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getClase() == null ? 0 : this.getClase().hashCode() );
         result = 37 * result + ( getCodigo() == null ? 0 : this.getCodigo().hashCode() );
         return result;
   }   


}


