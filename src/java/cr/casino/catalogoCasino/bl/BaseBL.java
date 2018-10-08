
package cr.casino.catalogoCasino.bl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.dao.impl.BdcAdministradorDAO;
import cr.casino.catalogoCasino.dao.impl.BdcAgenteAuxiliarDAO;
import cr.casino.catalogoCasino.dao.impl.BdcAgenteDAO;
import cr.casino.catalogoCasino.dao.impl.BdcClienteAuxiliarDAO;
import cr.casino.catalogoCasino.dao.impl.BdcClienteDAO;
import cr.casino.catalogoCasino.dao.impl.BdcDetallePedidoDAO;
import cr.casino.catalogoCasino.dao.impl.BdcImgProductoDAO;
import cr.casino.catalogoCasino.dao.impl.BdcPedidoDAO;
import cr.casino.catalogoCasino.dao.impl.BdcProductoAuxiliarDAO;
import cr.casino.catalogoCasino.dao.impl.BdcProductoDAO;
import cr.casino.catalogoCasino.dao.impl.BdcReservaDAO;
import cr.casino.catalogoCasino.dao.impl.BdcUsuarioAgenteDAO;
import cr.casino.catalogoCasino.dao.impl.BdcVentaDAO;
import java.util.LinkedHashMap;

/**
 *
 * @author Jeremy
 */
public class BaseBL {
    private final LinkedHashMap<String, IBaseDAO> daos;

    public BaseBL() {
        daos = new LinkedHashMap();
        daos.put("cr.casino.catalogoCasino.domain.BdcAdministrador", new BdcAdministradorDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcAgenteAuxiliar", new BdcAgenteAuxiliarDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcAgente", new BdcAgenteDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcClienteAuxiliar", new BdcClienteAuxiliarDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcCliente", new BdcClienteDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcDetallePedido", new BdcDetallePedidoDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcImgProducto", new BdcImgProductoDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcPedido", new BdcPedidoDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcProductoAuxiliar", new BdcProductoAuxiliarDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcProducto", new BdcProductoDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcReserva", new BdcReservaDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcUsuarioAgente", new BdcUsuarioAgenteDAO());
        daos.put("cr.casino.catalogoCasino.domain.BdcVenta", new BdcVentaDAO());
    }
    
    public IBaseDAO getDao(String className){
        return daos.get(className);
    }
}

