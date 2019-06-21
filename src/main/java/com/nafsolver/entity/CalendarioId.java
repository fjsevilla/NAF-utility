package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CalendarioId generated by hbm2java
 */
@Embeddable
public class CalendarioId  implements java.io.Serializable {


     private String noCia;
     private short ano;
     private byte semana;
     private String indicador;

    public CalendarioId() {
    }

    public CalendarioId(String noCia, short ano, byte semana, String indicador) {
       this.noCia = noCia;
       this.ano = ano;
       this.semana = semana;
       this.indicador = indicador;
    }
   


    @Column(name="NO_CIA", nullable=false, length=2)
    public String getNoCia() {
        return this.noCia;
    }
    
    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }


    @Column(name="ANO", nullable=false, precision=4, scale=0)
    public short getAno() {
        return this.ano;
    }
    
    public void setAno(short ano) {
        this.ano = ano;
    }


    @Column(name="SEMANA", nullable=false, precision=2, scale=0)
    public byte getSemana() {
        return this.semana;
    }
    
    public void setSemana(byte semana) {
        this.semana = semana;
    }


    @Column(name="INDICADOR", nullable=false, length=1)
    public String getIndicador() {
        return this.indicador;
    }
    
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CalendarioId) ) return false;
		 CalendarioId castOther = ( CalendarioId ) other; 
         
		 return ( (this.getNoCia()==castOther.getNoCia()) || ( this.getNoCia()!=null && castOther.getNoCia()!=null && this.getNoCia().equals(castOther.getNoCia()) ) )
 && (this.getAno()==castOther.getAno())
 && (this.getSemana()==castOther.getSemana())
 && ( (this.getIndicador()==castOther.getIndicador()) || ( this.getIndicador()!=null && castOther.getIndicador()!=null && this.getIndicador().equals(castOther.getIndicador()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNoCia() == null ? 0 : this.getNoCia().hashCode() );
         result = 37 * result + this.getAno();
         result = 37 * result + this.getSemana();
         result = 37 * result + ( getIndicador() == null ? 0 : this.getIndicador().hashCode() );
         return result;
   }   


}

