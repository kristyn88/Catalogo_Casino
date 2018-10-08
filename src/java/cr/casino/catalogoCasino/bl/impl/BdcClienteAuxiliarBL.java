
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcClienteAuxiliar;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcClienteAuxiliarBL extends BaseBL implements IBaseBL<BdcClienteAuxiliar, String>{

    public BdcClienteAuxiliarBL() {
        super();
    }
    
    @Override
    public void save(BdcClienteAuxiliar o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcClienteAuxiliar merge(BdcClienteAuxiliar o) {
        return (BdcClienteAuxiliar) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcClienteAuxiliar o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcClienteAuxiliar findById(String o) {
        return (BdcClienteAuxiliar) this.getDao(BdcClienteAuxiliar.class.getName()).findById(o);
    }

    @Override
    public List<BdcClienteAuxiliar> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
