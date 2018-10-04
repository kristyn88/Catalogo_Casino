package cr.casino.catalogoCasino.domain;
// Generated 19/09/2018 07:56:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * BdcProducto generated by hbm2java
 */
public class BdcProducto  implements java.io.Serializable {


     private String codigo;
     private String categoria;
     private String material;
     private String talla;
     private String descripcion;
     private String estado;
     private String inventario;
     private List<BdcDetallePedido> bdcDetallePedidos;
    public BdcProducto() {
    }

	
    public BdcProducto(String codigo) {
        this.codigo = codigo;
    }
    public BdcProducto(String codigo, String categoria, String material, String talla, String descripcion, String estado, String inventario, List<BdcDetallePedido> bdcDetallePedidos) {
       this.codigo = codigo;
       this.categoria = categoria;
       this.material = material;
       this.talla = talla;
       this.descripcion = descripcion;
       this.estado = estado;
       this.inventario = inventario;
       this.bdcDetallePedidos = bdcDetallePedidos;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getMaterial() {
        return this.material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTalla() {
        return this.talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getInventario() {
        return this.inventario;
    }
    
    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    public List<BdcDetallePedido> getBdcDetallePedidos() {
        return this.bdcDetallePedidos;
    }
    
    public void setBdcDetallePedidos(List<BdcDetallePedido> bdcDetallePedidos) {
        this.bdcDetallePedidos = bdcDetallePedidos;
    }
}


