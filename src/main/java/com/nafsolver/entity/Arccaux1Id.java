package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Arccaux1Id generated by hbm2java
 */
@Embeddable
public class Arccaux1Id  implements java.io.Serializable {


     private String noCia;
     private String centro;
     private String tipoDoc;
     private String periodo;
     private String ruta;
     private String noDocu;
     private String grupo;
     private String noCliente;

    public Arccaux1Id() {
    }

    public Arccaux1Id(String noCia, String centro, String tipoDoc, String periodo, String ruta, String noDocu, String grupo, String noCliente) {
       this.noCia = noCia;
       this.centro = centro;
       this.tipoDoc = tipoDoc;
       this.periodo = periodo;
       this.ruta = ruta;
       this.noDocu = noDocu;
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


    @Column(name="CENTRO", nullable=false, length=2)
    public String getCentro() {
        return this.centro;
    }
    
    public void setCentro(String centro) {
        this.centro = centro;
    }


    @Column(name="TIPO_DOC", nullable=false, length=2)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    @Column(name="PERIODO", nullable=false, length=4)
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


    @Column(name="RUTA", nullable=false, length=4)
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }


    @Column(name="NO_DOCU", nullable=false, length=12)
    public String getNoDocu() {
        return this.noDocu;
    }
    
    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
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
		 if ( !(other instanceof Arccaux1Id) ) return false;
		 Arccaux1Id castOther = ( Arccaux1Id ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getCentro()==castOther.getCentro()) || ( this.getCentro()!=null && castOther.getCentro()!=null && this.getCentro().equals(castOther.getCentro()) ) )
 && ( (this.getTipoDoc()==castOther.getTipoDoc()) || ( this.getTipoDoc()!=null && castOther.getTipoDoc()!=null && this.getTipoDoc().equals(castOther.getTipoDoc()) ) )
 && ( (this.getPeriodo()==castOther.getPeriodo()) || ( this.getPeriodo()!=null && castOther.getPeriodo()!=null && this.getPeriodo().equals(castOther.getPeriodo()) ) )
 && ( (this.getRuta()==castOther.getRuta()) || ( this.getRuta()!=null && castOther.getRuta()!=null && this.getRuta().equals(castOther.getRuta()) ) )
 && ( (this.getNoDocu()==castOther.getNoDocu()) || ( this.getNoDocu()!=null && castOther.getNoDocu()!=null && this.getNoDocu().equals(castOther.getNoDocu()) ) )
 && ( (this.getGrupo()==castOther.getGrupo()) || ( this.getGrupo()!=null && castOther.getGrupo()!=null && this.getGrupo().equals(castOther.getGrupo()) ) )
 && ( (this.getNoCliente()==castOther.getNoCliente()) || ( this.getNoCliente()!=null && castOther.getNoCliente()!=null && this.getNoCliente().equals(castOther.getNoCliente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getCentro() == null ? 0 : this.getCentro().hashCode() );
         result = 37 * result + ( getTipoDoc() == null ? 0 : this.getTipoDoc().hashCode() );
         result = 37 * result + ( getPeriodo() == null ? 0 : this.getPeriodo().hashCode() );
         result = 37 * result + ( getRuta() == null ? 0 : this.getRuta().hashCode() );
         result = 37 * result + ( getNoDocu() == null ? 0 : this.getNoDocu().hashCode() );
         result = 37 * result + ( getGrupo() == null ? 0 : this.getGrupo().hashCode() );
         result = 37 * result + ( getNoCliente() == null ? 0 : this.getNoCliente().hashCode() );
         return result;
   }   


}


