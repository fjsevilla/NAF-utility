package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArplmovimiId generated by hbm2java
 */
@Embeddable
public class ArplmovimiId  implements java.io.Serializable {


     private String codigo;
     private String desMovimiento;

    public ArplmovimiId() {
    }

    public ArplmovimiId(String codigo, String desMovimiento) {
       this.codigo = codigo;
       this.desMovimiento = desMovimiento;
    }
   


    @Column(name="CODIGO", nullable=false, length=10)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Column(name="DES_MOVIMIENTO", nullable=false, length=200)
    public String getDesMovimiento() {
        return this.desMovimiento;
    }
    
    public void setDesMovimiento(String desMovimiento) {
        this.desMovimiento = desMovimiento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArplmovimiId) ) return false;
		 ArplmovimiId castOther = ( ArplmovimiId ) other; 
         
		 return ( (this.getCodigo()==castOther.getCodigo()) || ( this.getCodigo()!=null && castOther.getCodigo()!=null && this.getCodigo().equals(castOther.getCodigo()) ) )
 && ( (this.getDesMovimiento()==castOther.getDesMovimiento()) || ( this.getDesMovimiento()!=null && castOther.getDesMovimiento()!=null && this.getDesMovimiento().equals(castOther.getDesMovimiento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodigo() == null ? 0 : this.getCodigo().hashCode() );
         result = 37 * result + ( getDesMovimiento() == null ? 0 : this.getDesMovimiento().hashCode() );
         return result;
   }   


}


