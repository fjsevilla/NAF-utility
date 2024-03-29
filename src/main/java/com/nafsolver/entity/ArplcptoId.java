package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplcptoId generated by hbm2java
 */
@Embeddable
public class ArplcptoId  implements java.io.Serializable {


     private String noCia;
     private String noCpto;
     private String tipoMov;
     private String tipo;

    public ArplcptoId() {
    }

    public ArplcptoId(String noCia, String noCpto, String tipoMov, String tipo) {
       this.noCia = noCia;
       this.noCpto = noCpto;
       this.tipoMov = tipoMov;
       this.tipo = tipo;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="NO_CPTO", nullable=false, length=10)
    public String getNoCpto() {
        return this.noCpto;
    }
    
    public void setNoCpto(String noCpto) {
        this.noCpto = noCpto;
    }


    @Column(name="TIPO_MOV", nullable=false, length=10)
    public String getTipoMov() {
        return this.tipoMov;
    }
    
    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }


    @Column(name="TIPO", nullable=false, length=1)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplcptoId) ) return false;
		 ArplcptoId castOther = ( ArplcptoId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getNoCpto()==castOther.getNoCpto()) || ( this.getNoCpto()!=null && castOther.getNoCpto()!=null && this.getNoCpto().equals(castOther.getNoCpto()) ) )
 && ( (this.getTipoMov()==castOther.getTipoMov()) || ( this.getTipoMov()!=null && castOther.getTipoMov()!=null && this.getTipoMov().equals(castOther.getTipoMov()) ) )
 && ( (this.getTipo()==castOther.getTipo()) || ( this.getTipo()!=null && castOther.getTipo()!=null && this.getTipo().equals(castOther.getTipo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getNoCpto() == null ? 0 : this.getNoCpto().hashCode() );
         result = 37 * result + ( getTipoMov() == null ? 0 : this.getTipoMov().hashCode() );
         result = 37 * result + ( getTipo() == null ? 0 : this.getTipo().hashCode() );
         return result;
   }   


}


