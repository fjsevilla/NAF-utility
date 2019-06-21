package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcglveId generated by hbm2java
 */
@Embeddable
public class ArcglveId  implements java.io.Serializable {


     private String noCia;
     private String tipoDoc;
     private String noDocu;

    public ArcglveId() {
    }

    public ArcglveId(String noCia, String tipoDoc, String noDocu) {
       this.noCia = noCia;
       this.tipoDoc = tipoDoc;
       this.noDocu = noDocu;
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


    @Column(name="NO_DOCU", nullable=false, length=12)
    public String getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcglveId) ) return false;
		 ArcglveId castOther = ( ArcglveId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getTipoDoc()==castOther.getTipoDoc()) || ( this.getTipoDoc()!=null && castOther.getTipoDoc()!=null && this.getTipoDoc().equals(castOther.getTipoDoc()) ) )
 && ( (this.getNoDocu()==castOther.getNoDocu()) || ( this.getNoDocu()!=null && castOther.getNoDocu()!=null && this.getNoDocu().equals(castOther.getNoDocu()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getTipoDoc() == null ? 0 : this.getTipoDoc().hashCode() );
         result = 37 * result + ( getNoDocu() == null ? 0 : this.getNoDocu().hashCode() );
         return result;
   }   


}


