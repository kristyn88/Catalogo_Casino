
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcProducto;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcProductoBL extends BaseBL implements IBaseBL<BdcProducto, String>{

    public BdcProductoBL() {
        super();
    }
    
    @Override
    public void save(BdcProducto o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcProducto merge(BdcProducto o) {
        return (BdcProducto) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcProducto o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcProducto findById(String o) {
        return (BdcProducto) this.getDao(BdcProducto.class.getName()).findById(o);
    }

    @Override
    public List<BdcProducto> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
