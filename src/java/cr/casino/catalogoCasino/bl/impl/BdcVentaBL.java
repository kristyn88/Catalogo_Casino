
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcVenta;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcVentaBL extends BaseBL implements IBaseBL<BdcVenta, String>{

    public BdcVentaBL() {
        super();
    }
    
    @Override
    public void save(BdcVenta o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcVenta merge(BdcVenta o) {
        return (BdcVenta) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcVenta o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcVenta findById(String o) {
        return (BdcVenta) this.getDao(BdcVenta.class.getName()).findById(o);
    }

    @Override
    public List<BdcVenta> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
