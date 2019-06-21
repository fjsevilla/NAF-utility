package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArinmaTaId generated by hbm2java
 */
@Embeddable
public class ArinmaTaId  implements java.io.Serializable {


     private String noCia;
     private String bodega;
     private String clase;
     private String categoria;
     private String noArti;
     private BigDecimal talla;

    public ArinmaTaId() {
    }

    public ArinmaTaId(String noCia, String bodega, String clase, String categoria, String noArti, BigDecimal talla) {
       this.noCia = noCia;
       this.bodega = bodega;
       this.clase = clase;
       this.categoria = categoria;
       this.noArti = noArti;
       this.talla = talla;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="BODEGA", nullable=false, length=4)
    public String getBodega() {
        return this.bodega;
    }
    
    public void setBodega(String bodega) {
        this.bodega = bodega;
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


    @Column(name="NO_ARTI", nullable=false, length=30)
    public String getNoArti() {
        return this.noArti;
    }
    
    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }


    @Column(name="TALLA", nullable=false, precision=4, scale=1)
    public BigDecimal getTalla() {
        return this.talla;
    }
    
    public void setTalla(BigDecimal talla) {
        this.talla = talla;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArinmaTaId) ) return false;
		 ArinmaTaId castOther = ( ArinmaTaId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && ( (this.getBodega()==castOther.getBodega()) || ( this.getBodega()!=null && castOther.getBodega()!=null && this.getBodega().equals(castOther.getBodega()) ) )
 && ( (this.getClase()==castOther.getClase()) || ( this.getClase()!=null && castOther.getClase()!=null && this.getClase().equals(castOther.getClase()) ) )
 && ( (this.getCategoria()==castOther.getCategoria()) || ( this.getCategoria()!=null && castOther.getCategoria()!=null && this.getCategoria().equals(castOther.getCategoria()) ) )
 && ( (this.getNoArti()==castOther.getNoArti()) || ( this.getNoArti()!=null && castOther.getNoArti()!=null && this.getNoArti().equals(castOther.getNoArti()) ) )
 && ( (this.getTalla()==castOther.getTalla()) || ( this.getTalla()!=null && castOther.getTalla()!=null && this.getTalla().equals(castOther.getTalla()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + ( getBodega() == null ? 0 : this.getBodega().hashCode() );
         result = 37 * result + ( getClase() == null ? 0 : this.getClase().hashCode() );
         result = 37 * result + ( getCategoria() == null ? 0 : this.getCategoria().hashCode() );
         result = 37 * result + ( getNoArti() == null ? 0 : this.getNoArti().hashCode() );
         result = 37 * result + ( getTalla() == null ? 0 : this.getTalla().hashCode() );
         return result;
   }   


}


