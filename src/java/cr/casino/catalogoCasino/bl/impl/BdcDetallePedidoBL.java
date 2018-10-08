
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcDetallePedido;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcDetallePedidoBL extends BaseBL implements IBaseBL<BdcDetallePedido, String>{

    public BdcDetallePedidoBL() {
        super();
    }
    
    @Override
    public void save(BdcDetallePedido o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcDetallePedido merge(BdcDetallePedido o) {
        return (BdcDetallePedido) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcDetallePedido o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcDetallePedido findById(String o) {
        return (BdcDetallePedido) this.getDao(BdcDetallePedido.class.getName()).findById(o);
    }

    @Override
    public List<BdcDetallePedido> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
