package cr.casino.catalogoCasino.domain;
// Generated 19/09/2018 07:56:15 PM by Hibernate Tools 4.3.1



/**
 * BdcVenta generated by hbm2java
 */
public class BdcVenta  implements java.io.Serializable {


     private String codigo;
     private BdcPedido bdcPedido;
     private Integer estado;

    public BdcVenta() {
    }

	
    public BdcVenta(String codigo) {
        this.codigo = codigo;
    }
    public BdcVenta(String codigo, BdcPedido bdcPedido, Integer estado) {
       this.codigo = codigo;
       this.bdcPedido = bdcPedido;
       this.estado = estado;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public BdcPedido getBdcPedido() {
        return this.bdcPedido;
    }
    
    public void setBdcPedido(BdcPedido bdcPedido) {
        this.bdcPedido = bdcPedido;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }




}


