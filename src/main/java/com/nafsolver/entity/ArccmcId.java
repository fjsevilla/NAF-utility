package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArccmcId generated by hbm2java
 */
@Embeddable
public class ArccmcId  implements java.io.Serializable {


     private String noCia;
     private String grupo;
     private String noCliente;

    public ArccmcId() {
    }

    public ArccmcId(String noCia, String grupo, String noCliente) {
       this.noCia = noCia;
       this.grupo = grupo;
       this.noCliente = noCliente;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArccmcId) ) return false;
		 ArccmcId castOther = ( ArccmcId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getGrupo()==castOther.getGrupo()) || ( this.getGrupo()!=null && castOther.getGrupo()!=null && this.getGrupo().equals(castOther.getGrupo()) ) )
 && ( (this.getNoCliente()==castOther.getNoCliente()) || ( this.getNoCliente()!=null && castOther.getNoCliente()!=null && this.getNoCliente().equals(castOther.getNoCliente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getGrupo() == null ? 0 : this.getGrupo().hashCode() );
         result = 37 * result + ( getNoCliente() == null ? 0 : this.getNoCliente().hashCode() );
         return result;
   }   


}

