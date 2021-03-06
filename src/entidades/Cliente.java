package entidades;
// Generated 12-09-2016 05:39:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombreCliente;
     private String apellidoCliente;
     private String rutCliente;
     private String telefonoCliente;
     private String direccionCliente;
     private String referenciaCliente;
     private boolean morosoCliente;
     private boolean activoCliente;
     private int totalcomprasCliente;
     private int totalabonoCliente;
     private int numeroCliente;
     private Set ventas = new HashSet(0);
     private Set abonos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombreCliente, String apellidoCliente, String rutCliente, String telefonoCliente, String direccionCliente, boolean morosoCliente, boolean activoCliente, int totalcomprasCliente, int totalabonoCliente, int numeroCliente) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.rutCliente = rutCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
        this.morosoCliente = morosoCliente;
        this.activoCliente = activoCliente;
        this.totalcomprasCliente = totalcomprasCliente;
        this.totalabonoCliente = totalabonoCliente;
        this.numeroCliente = numeroCliente;
    }
    public Cliente(String nombreCliente, String apellidoCliente, String rutCliente, String telefonoCliente, String direccionCliente, String referenciaCliente, boolean morosoCliente, boolean activoCliente, int totalcomprasCliente, int totalabonoCliente, int numeroCliente, Set ventas, Set abonos) {
       this.nombreCliente = nombreCliente;
       this.apellidoCliente = apellidoCliente;
       this.rutCliente = rutCliente;
       this.telefonoCliente = telefonoCliente;
       this.direccionCliente = direccionCliente;
       this.referenciaCliente = referenciaCliente;
       this.morosoCliente = morosoCliente;
       this.activoCliente = activoCliente;
       this.totalcomprasCliente = totalcomprasCliente;
       this.totalabonoCliente = totalabonoCliente;
       this.numeroCliente = numeroCliente;
       this.ventas = ventas;
       this.abonos = abonos;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidoCliente() {
        return this.apellidoCliente;
    }
    
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public String getRutCliente() {
        return this.rutCliente;
    }
    
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    public String getTelefonoCliente() {
        return this.telefonoCliente;
    }
    
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getDireccionCliente() {
        return this.direccionCliente;
    }
    
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    public String getReferenciaCliente() {
        return this.referenciaCliente;
    }
    
    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }
    public boolean isMorosoCliente() {
        return this.morosoCliente;
    }
    
    public void setMorosoCliente(boolean morosoCliente) {
        this.morosoCliente = morosoCliente;
    }
    public boolean isActivoCliente() {
        return this.activoCliente;
    }
    
    public void setActivoCliente(boolean activoCliente) {
        this.activoCliente = activoCliente;
    }
    public int getTotalcomprasCliente() {
        return this.totalcomprasCliente;
    }
    
    public void setTotalcomprasCliente(int totalcomprasCliente) {
        this.totalcomprasCliente = totalcomprasCliente;
    }
    public int getTotalabonoCliente() {
        return this.totalabonoCliente;
    }
    
    public void setTotalabonoCliente(int totalabonoCliente) {
        this.totalabonoCliente = totalabonoCliente;
    }
    public int getNumeroCliente() {
        return this.numeroCliente;
    }
    
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }
    public Set getAbonos() {
        return this.abonos;
    }
    
    public void setAbonos(Set abonos) {
        this.abonos = abonos;
    }




}


