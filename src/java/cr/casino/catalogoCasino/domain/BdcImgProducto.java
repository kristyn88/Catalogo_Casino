package cr.casino.catalogoCasino.domain;
// Generated 19/09/2018 07:56:15 PM by Hibernate Tools 4.3.1



/**
 * BdcImgProducto generated by hbm2java
 */
public class BdcImgProducto  implements java.io.Serializable {


     private String producto;
     private BdcProducto bdcProducto;
     private String imagen;

    public BdcImgProducto() {
    }

	
    public BdcImgProducto(BdcProducto bdcProducto) {
        this.bdcProducto = bdcProducto;
    }
    public BdcImgProducto(BdcProducto bdcProducto, String imagen) {
       this.bdcProducto = bdcProducto;
       this.imagen = imagen;
    }
   
    public String getProducto() {
        return this.producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public BdcProducto getBdcProducto() {
        return this.bdcProducto;
    }
    
    public void setBdcProducto(BdcProducto bdcProducto) {
        this.bdcProducto = bdcProducto;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}


