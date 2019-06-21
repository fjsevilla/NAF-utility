package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArincatTipoId generated by hbm2java
 */
@Embeddable
public class ArincatTipoId  implements java.io.Serializable {


     private String noCia;
     private String clase;
     private String categoria;
     private String tipo;

    public ArincatTipoId() {
    }

    public ArincatTipoId(String noCia, String clase, String categoria, String tipo) {
       this.noCia = noCia;
       this.clase = clase;
       this.categoria = categoria;
       this.tipo = tipo;
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


    @Column(name="CATEGORIA", nullable=false, length=3)
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Column(name="TIPO", nullable=false, length=30)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArincatTipoId) ) return false;
		 ArincatTipoId castOther = ( ArincatTipoId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getClase()==castOther.getClase()) || ( this.getClase()!=null && castOther.getClase()!=null && this.getClase().equals(castOther.getClase()) ) )
 && ( (this.getCategoria()==castOther.getCategoria()) || ( this.getCategoria()!=null && castOther.getCategoria()!=null && this.getCategoria().equals(castOther.getCategoria()) ) )
 && ( (this.getTipo()==castOther.getTipo()) || ( this.getTipo()!=null && castOther.getTipo()!=null && this.getTipo().equals(castOther.getTipo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getClase() == null ? 0 : this.getClase().hashCode() );
         result = 37 * result + ( getCategoria() == null ? 0 : this.getCategoria().hashCode() );
         result = 37 * result + ( getTipo() == null ? 0 : this.getTipo().hashCode() );
         return result;
   }   


}


