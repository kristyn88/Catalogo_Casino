
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcAgente;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcAgenteBL extends BaseBL implements IBaseBL<BdcAgente, String>{

    public BdcAgenteBL() {
        super();
    }
    
    @Override
    public void save(BdcAgente o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcAgente merge(BdcAgente o) {
        return (BdcAgente) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcAgente o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcAgente findById(String o) {
        return (BdcAgente) this.getDao(BdcAgente.class.getName()).findById(o);
    }

    @Override
    public List<BdcAgente> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
