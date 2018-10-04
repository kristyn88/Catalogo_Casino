
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcAgenteAuxiliar;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcAgenteAuxiliarBL extends BaseBL implements IBaseBL<BdcAgenteAuxiliar, String>{

    public BdcAgenteAuxiliarBL() {
        super();
    }
    
    @Override
    public void save(BdcAgenteAuxiliar o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcAgenteAuxiliar merge(BdcAgenteAuxiliar o) {
        return (BdcAgenteAuxiliar) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcAgenteAuxiliar o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcAgenteAuxiliar findById(String o) {
        return (BdcAgenteAuxiliar) this.getDao(BdcAgenteAuxiliar.class.getName()).findById(o);
    }

    @Override
    public List<BdcAgenteAuxiliar> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
