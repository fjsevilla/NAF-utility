package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcctiId generated by hbm2java
 */
@Embeddable
public class ArcctiId  implements java.io.Serializable {


     private String noCia;
     private String grupo;
     private String noCliente;
     private String tipoDoc;
     private String noDocu;
     private String clave;

    public ArcctiId() {
    }

    public ArcctiId(String noCia, String grupo, String noCliente, String tipoDoc, String noDocu, String clave) {
       this.noCia = noCia;
       this.grupo = grupo;
       this.noCliente = noCliente;
       this.tipoDoc = tipoDoc;
       this.noDocu = noDocu;
       this.clave = clave;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="GRUPO", nullable=false, length=2)
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    @Column(name="NO_CLIENTE", nullable=false, length=15)
    public String getNoCliente() {
        return this.noCliente;
    }
    
    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
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
		 if ( !(other instanceof ArcctiId) ) return false;
		 ArcctiId castOther = ( ArcctiId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getGrupo()==castOther.getGrupo()) || ( this.getGrupo()!=null && castOther.getGrupo()!=null && this.getGrupo().equals(castOther.getGrupo()) ) )
 && ( (this.getNoCliente()==castOther.getNoCliente()) || ( this.getNoCliente()!=null && castOther.getNoCliente()!=null && this.getNoCliente().equals(castOther.getNoCliente()) ) )
 && ( (this.getTipoDoc()==castOther.getTipoDoc()) || ( this.getTipoDoc()!=null && castOther.getTipoDoc()!=null && this.getTipoDoc().equals(castOther.getTipoDoc()) ) )
 && ( (this.getNoDocu()==castOther.getNoDocu()) || ( this.getNoDocu()!=null && castOther.getNoDocu()!=null && this.getNoDocu().equals(castOther.getNoDocu()) ) )
 && ( (this.getClave()==castOther.getClave()) || ( this.getClave()!=null && castOther.getClave()!=null && this.getClave().equals(castOther.getClave()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getGrupo() == null ? 0 : this.getGrupo().hashCode() );
         result = 37 * result + ( getNoCliente() == null ? 0 : this.getNoCliente().hashCode() );
         result = 37 * result + ( getTipoDoc() == null ? 0 : this.getTipoDoc().hashCode() );
         result = 37 * result + ( getNoDocu() == null ? 0 : this.getNoDocu().hashCode() );
         result = 37 * result + ( getClave() == null ? 0 : this.getClave().hashCode() );
         return result;
   }   


}


