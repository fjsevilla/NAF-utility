package com.nafsolver.entity;
// Generated 15/06/2019 08:00:29 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArgeimpoTxtId generated by hbm2java
 */
@Embeddable
public class ArgeimpoTxtId  implements java.io.Serializable {


     private short id;
     private short numLinea;

    public ArgeimpoTxtId() {
    }

    public ArgeimpoTxtId(short id, short numLinea) {
       this.id = id;
       this.numLinea = numLinea;
    }
   


    @Column(name="ID", nullable=false, precision=4, scale=0)
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }


    @Column(name="NUM_LINEA", nullable=false, precision=4, scale=0)
    public short getNumLinea() {
        return this.numLinea;
    }
    
    public void setNumLinea(short numLinea) {
        this.numLinea = numLinea;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ArgeimpoTxtId) ) return false;
		 ArgeimpoTxtId castOther = ( ArgeimpoTxtId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getNumLinea()==castOther.getNumLinea());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getNumLinea();
         return result;
   }   


}


