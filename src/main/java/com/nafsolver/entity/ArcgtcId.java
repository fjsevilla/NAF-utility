package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArcgtcId generated by hbm2java
 */
@Embeddable
public class ArcgtcId  implements java.io.Serializable {


     private String claseCambio;
     private Date fecha;

    public ArcgtcId() {
    }

    public ArcgtcId(String claseCambio, Date fecha) {
       this.claseCambio = claseCambio;
       this.fecha = fecha;
    }
   


    @Column(name="CLASE_CAMBIO", nullable=false, length=3)
    public String getClaseCambio() {
        return this.claseCambio;
    }
    
    public void setClaseCambio(String claseCambio) {
        this.claseCambio = claseCambio;
    }


    @Column(name="FECHA", nullable=false, length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArcgtcId) ) return false;
		 ArcgtcId castOther = ( ArcgtcId ) other; 
         
		 return ( (this.getClaseCambio()==castOther.getClaseCambio()) || ( this.getClaseCambio()!=null && castOther.getClaseCambio()!=null && this.getClaseCambio().equals(castOther.getClaseCambio()) ) )
 && ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getClaseCambio() == null ? 0 : this.getClaseCambio().hashCode() );
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         return result;
   }   


}


