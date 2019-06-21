package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcprdId generated by hbm2java
 */
@Embeddable
public class ArcprdId  implements java.io.Serializable {


     private String noCia;
     private String noProve;
     private String tipoDoc;
     private String noDocu;
     private String tipoRefe;
     private String noRefe;

    public ArcprdId() {
    }

    public ArcprdId(String noCia, String noProve, String tipoDoc, String noDocu, String tipoRefe, String noRefe) {
       this.noCia = noCia;
       this.noProve = noProve;
       this.tipoDoc = tipoDoc;
       this.noDocu = noDocu;
       this.tipoRefe = tipoRefe;
       this.noRefe = noRefe;
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


    @Column(name="TIPO_DOC", nullable=false, length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    @Column(name="NO_DOCU", nullable=false, length=8)
    public String getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }


    @Column(name="TIPO_REFE", nullable=false, length=2)
    public String getTipoRefe() {
        return this.tipoRefe;
    }
    
    public void setTipoRefe(String tipoRefe) {
        this.tipoRefe = tipoRefe;
    }


    @Column(name="NO_REFE", nullable=false, length=8)
    public String getNoRefe() {
        return this.noRefe;
    }
    
    public void setNoRefe(String noRefe) {
        this.noRefe = noRefe;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcprdId) ) return false;
		 ArcprdId castOther = ( ArcprdId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoProve()==castOther.getNoProve()) || ( this.getNoProve()!=null && castOther.getNoProve()!=null && this.getNoProve().equals(castOther.getNoProve()) ) )
 && ( (this.getTipoDoc()==castOther.getTipoDoc()) || ( this.getTipoDoc()!=null && castOther.getTipoDoc()!=null && this.getTipoDoc().equals(castOther.getTipoDoc()) ) )
 && ( (this.getNoDocu()==castOther.getNoDocu()) || ( this.getNoDocu()!=null && castOther.getNoDocu()!=null && this.getNoDocu().equals(castOther.getNoDocu()) ) )
 && ( (this.getTipoRefe()==castOther.getTipoRefe()) || ( this.getTipoRefe()!=null && castOther.getTipoRefe()!=null && this.getTipoRefe().equals(castOther.getTipoRefe()) ) )
 && ( (this.getNoRefe()==castOther.getNoRefe()) || ( this.getNoRefe()!=null && castOther.getNoRefe()!=null && this.getNoRefe().equals(castOther.getNoRefe()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoProve() == null ? 0 : this.getNoProve().hashCode() );
         result = 37 * result + ( getTipoDoc() == null ? 0 : this.getTipoDoc().hashCode() );
         result = 37 * result + ( getNoDocu() == null ? 0 : this.getNoDocu().hashCode() );
         result = 37 * result + ( getTipoRefe() == null ? 0 : this.getTipoRefe().hashCode() );
         result = 37 * result + ( getNoRefe() == null ? 0 : this.getNoRefe().hashCode() );
         return result;
   }   


}


