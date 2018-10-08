package cr.casino.catalogoCasino.domain;
// Generated 19/09/2018 07:56:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * BdcPedido generated by hbm2java
 */
public class BdcPedido  implements java.io.Serializable {


     private String codigo;
     private BdcAgente bdcAgente;
     private BdcCliente bdcCliente;
     private Date fecha;
     private Integer estado;
     private List<BdcVenta> bdcVentas;
     private List<BdcReserva> bdcReservas;
     private List<BdcDetallePedido> bdcDetallePedidos;

    public BdcPedido() {
    }

	
    public BdcPedido(String codigo) {
        this.codigo = codigo;
    }
    public BdcPedido(String codigo, BdcAgente bdcAgente, BdcCliente bdcCliente, Date fecha, Integer estado, List<BdcVenta> bdcVentas, List<BdcReserva> bdcReservas, List<BdcDetallePedido> bdcDetallePedidos) {
       this.codigo = codigo;
       this.bdcAgente = bdcAgente;
       this.bdcCliente = bdcCliente;
       this.fecha = fecha;
       this.estado = estado;
       this.bdcVentas = bdcVentas;
       this.bdcReservas = bdcReservas;
       this.bdcDetallePedidos = bdcDetallePedidos;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public BdcAgente getBdcAgente() {
        return this.bdcAgente;
    }
    
    public void setBdcAgente(BdcAgente bdcAgente) {
        this.bdcAgente = bdcAgente;
    }
    public BdcCliente getBdcCliente() {
        return this.bdcCliente;
    }
    
    public void setBdcCliente(BdcCliente bdcCliente) {
        this.bdcCliente = bdcCliente;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public List<BdcVenta> getBdcVentas() {
        return this.bdcVentas;
    }
    
    public void setBdcVentas(List<BdcVenta> bdcVentas) {
        this.bdcVentas = bdcVentas;
    }
    public List<BdcReserva> getBdcReservas() {
        return this.bdcReservas;
    }
    
    public void setBdcReservas(List<BdcReserva> bdcReservas) {
        this.bdcReservas = bdcReservas;
    }
    public List<BdcDetallePedido> getBdcDetallePedidos() {
        return this.bdcDetallePedidos;
    }
    
    public void setBdcDetallePedidos(List<BdcDetallePedido> bdcDetallePedidos) {
        this.bdcDetallePedidos = bdcDetallePedidos;
    }




}


