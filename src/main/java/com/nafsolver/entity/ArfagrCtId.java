package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArfagrCtId generated by hbm2java
 */
@Embeddable
public class ArfagrCtId  implements java.io.Serializable {


     private String noCia;
     private String tipoDoc;
     private String clase;

    public ArfagrCtId() {
    }

    public ArfagrCtId(String noCia, String tipoDoc, String clase) {
       this.noCia = noCia;
       this.tipoDoc = tipoDoc;
       this.clase = clase;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="TIPO_DOC", nullable=false, length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    @Column(name="CLASE", nullable=false, length=4)
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArfagrCtId) ) return false;
		 ArfagrCtId castOther = ( ArfagrCtId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getTipoDoc()==castOther.getTipoDoc()) || ( this.getTipoDoc()!=null && castOther.getTipoDoc()!=null && this.getTipoDoc().equals(castOther.getTipoDoc()) ) )
 && ( (this.getClase()==castOther.getClase()) || ( this.getClase()!=null && castOther.getClase()!=null && this.getClase().equals(castOther.getClase()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getTipoDoc() == null ? 0 : this.getTipoDoc().hashCode() );
         result = 37 * result + ( getClase() == null ? 0 : this.getClase().hashCode() );
         return result;
   }   


}


