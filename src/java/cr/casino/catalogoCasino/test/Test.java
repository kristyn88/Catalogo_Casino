package cr.casino.catalogoCasino.test;

import cr.casino.catalogoCasino.bl.impl.BdcAgenteBL;
import cr.casino.catalogoCasino.bl.impl.BdcClienteBL;
import cr.casino.catalogoCasino.bl.impl.BdcDetallePedidoBL;
import cr.casino.catalogoCasino.bl.impl.BdcPedidoBL;
import cr.casino.catalogoCasino.bl.impl.BdcProductoBL;
import cr.casino.catalogoCasino.bl.impl.BdcVentaBL;
import cr.casino.catalogoCasino.domain.BdcAgente;
import cr.casino.catalogoCasino.domain.BdcCliente;
import cr.casino.catalogoCasino.domain.BdcDetallePedido;
import cr.casino.catalogoCasino.domain.BdcDetallePedidoId;
import cr.casino.catalogoCasino.domain.BdcPedido;
import cr.casino.catalogoCasino.domain.BdcProducto;
import cr.casino.catalogoCasino.domain.BdcVenta;
import java.util.Date;

public class Test {

    public static void main(String arg[]) {
        
//        BdcAgenteBL aBL = new BdcAgenteBL();
//        BdcClienteBL cBL = new BdcClienteBL();
//        BdcPedidoBL pBL = new BdcPedidoBL();
//        BdcVentaBL vBL = new BdcVentaBL();
//        BdcAgente a = new BdcAgente("123", "juan", "4", "A", "88", null);
//        BdcCliente c = new BdcCliente("Merceria Paquita", "juan", "Pedro", "1", "123", "Mani", "8", "1", "3", "4", null);
//        BdcPedido p = new BdcPedido("123", a, c, new Date(), 1, null, null, null);
//        BdcVenta v = new BdcVenta("123", p, 0);
        
//        aBL.save(a);
//        cBL.save(c);
//        pBL.save(p);
//        vBL.save(v);
//        vBL.merge(v);
//        System.out.println(vBL.findById("123").getEstado());
//        for (BdcVenta a1 : vBL.findAll(BdcVenta.class.getName())) {
//            System.out.println(a1.getEstado());
//        }
//        vBL.delete(v);
//        pBL.delete(p);
//        aBL.delete(a);
//        cBL.delete(c);
        
        
//        BdcPedidoBL pBL = new BdcPedidoBL();
//        BdcAgenteBL aBL = new BdcAgenteBL();
//        BdcClienteBL cBL = new BdcClienteBL();
        BdcProductoBL prBL = new BdcProductoBL();
//        BdcDetallePedidoBL dBL = new BdcDetallePedidoBL();
//        BdcAgente a = new BdcAgente("123", "juan", "4", "A", "88", null);
//        BdcCliente c = new BdcCliente("Merceria Paquita", "juan", "Pedro", "1", "123", "Mani", "8", "1", "3", "4", null);
//        BdcPedido p = new BdcPedido("123", a, c, new Date(), 1, null, null, null);
        BdcProducto pr = new BdcProducto("123", "medias", "lana", "M", "H", "A", "100", null);
//        BdcDetallePedidoId d = new BdcDetallePedidoId(p.getCodigo(), pr.getCodigo());
//        BdcDetallePedido de = new BdcDetallePedido(d, p, pr);
//        
        prBL.save(pr);
//        cBL.save(c);
//        aBL.merge(a);
//        
//
//        for (BdcDetallePedido a1 : dBL.findAll(BdcDetallePedido.class.getName())) {
//            dBL.delete(a1);
////            System.out.println(a1.getBdcProducto().getCategoria());
//        }
//        for (BdcPedido a2 : pBL.findAll(BdcPedido.class.getName())) {
//            pBL.delete(a2);
//        }
//        for (BdcCliente a3 : cBL.findAll(BdcCliente.class.getName())) {
//            cBL.delete(a3);
//        }
//        for (BdcAgente a4 : aBL.findAll(BdcAgente.class.getName())) {
//            aBL.delete(a4);
//        }
//        for (BdcProducto a5 : prBL.findAll(BdcProducto.class.getName())) {
//            prBL.delete(a5);
//        }
////
////        System.out.println(dBL.findById("123").getBdcProducto().getCategoria());
    }
}
