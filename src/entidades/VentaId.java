package entidades;
// Generated 14-08-2016 0:15:48 by Hibernate Tools 4.3.1



/**
 * VentaId generated by hbm2java
 */
public class VentaId  implements java.io.Serializable {


     private int idCliente;
     private int idProducto;

    public VentaId() {
    }

    public VentaId(int idCliente, int idProducto) {
       this.idCliente = idCliente;
       this.idProducto = idProducto;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VentaId) ) return false;
		 VentaId castOther = ( VentaId ) other; 
         
		 return (this.getIdCliente()==castOther.getIdCliente())
 && (this.getIdProducto()==castOther.getIdProducto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCliente();
         result = 37 * result + this.getIdProducto();
         return result;
   }   


}


