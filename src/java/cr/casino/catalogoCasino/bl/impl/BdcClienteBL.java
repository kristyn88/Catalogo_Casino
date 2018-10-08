
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcCliente;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcClienteBL extends BaseBL implements IBaseBL<BdcCliente, String>{

    public BdcClienteBL() {
        super();
    }
    
    @Override
    public void save(BdcCliente o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcCliente merge(BdcCliente o) {
        return (BdcCliente) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcCliente o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcCliente findById(String o) {
        return (BdcCliente) this.getDao(BdcCliente.class.getName()).findById(o);
    }

    @Override
    public List<BdcCliente> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
