package cr.casino.catalogoCasino.domain;
// Generated 19/09/2018 07:56:15 PM by Hibernate Tools 4.3.1



/**
 * BdcAdministrador generated by hbm2java
 */
public class BdcAdministrador  implements java.io.Serializable {


     private String identificacion;
     private String nombre;
     private String clave;

    public BdcAdministrador() {
    }

	
    public BdcAdministrador(String identificacion) {
        this.identificacion = identificacion;
    }
    public BdcAdministrador(String identificacion, String nombre, String clave) {
       this.identificacion = identificacion;
       this.nombre = nombre;
       this.clave = clave;
    }
   
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }




}

