package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcpretapId generated by hbm2java
 */
@Embeddable
public class ArcpretapId  implements java.io.Serializable {


     private String noCia;
     private String noDocu;
     private String noRefe;
     private String clave;

    public ArcpretapId() {
    }

    public ArcpretapId(String noCia, String noDocu, String noRefe, String clave) {
       this.noCia = noCia;
       this.noDocu = noDocu;
       this.noRefe = noRefe;
       this.clave = clave;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_DOCU", nullable=false, length=8)
    public String getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }


    @Column(name="NO_REFE", nullable=false, length=8)
    public String getNoRefe() {
        return this.noRefe;
    }
    
    public void setNoRefe(String noRefe) {
        this.noRefe = noRefe;
    }


    @Column(name="CLAVE", nullable=false, length=2)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcpretapId) ) return false;
		 ArcpretapId castOther = ( ArcpretapId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoDocu()==castOther.getNoDocu()) || ( this.getNoDocu()!=null && castOther.getNoDocu()!=null && this.getNoDocu().equals(castOther.getNoDocu()) ) )
 && ( (this.getNoRefe()==castOther.getNoRefe()) || ( this.getNoRefe()!=null && castOther.getNoRefe()!=null && this.getNoRefe().equals(castOther.getNoRefe()) ) )
 && ( (this.getClave()==castOther.getClave()) || ( this.getClave()!=null && castOther.getClave()!=null && this.getClave().equals(castOther.getClave()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoDocu() == null ? 0 : this.getNoDocu().hashCode() );
         result = 37 * result + ( getNoRefe() == null ? 0 : this.getNoRefe().hashCode() );
         result = 37 * result + ( getClave() == null ? 0 : this.getClave().hashCode() );
         return result;
   }   


}


