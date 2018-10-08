
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcPedido;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcPedidoBL extends BaseBL implements IBaseBL<BdcPedido, String>{

    public BdcPedidoBL() {
        super();
    }
    
    @Override
    public void save(BdcPedido o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcPedido merge(BdcPedido o) {
        return (BdcPedido) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcPedido o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcPedido findById(String o) {
        return (BdcPedido) this.getDao(BdcPedido.class.getName()).findById(o);
    }

    @Override
    public List<BdcPedido> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
