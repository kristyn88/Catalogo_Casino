
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcProductoAuxiliar;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcProductoAuxiliarBL extends BaseBL implements IBaseBL<BdcProductoAuxiliar, String>{

    public BdcProductoAuxiliarBL() {
        super();
    }
    
    @Override
    public void save(BdcProductoAuxiliar o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcProductoAuxiliar merge(BdcProductoAuxiliar o) {
        return (BdcProductoAuxiliar) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcProductoAuxiliar o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcProductoAuxiliar findById(String o) {
        return (BdcProductoAuxiliar) this.getDao(BdcProductoAuxiliar.class.getName()).findById(o);
    }

    @Override
    public List<BdcProductoAuxiliar> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
