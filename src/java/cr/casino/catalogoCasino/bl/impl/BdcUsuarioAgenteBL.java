
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcUsuarioAgente;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcUsuarioAgenteBL extends BaseBL implements IBaseBL<BdcUsuarioAgente, String>{

    public BdcUsuarioAgenteBL() {
        super();
    }
    
    @Override
    public void save(BdcUsuarioAgente o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcUsuarioAgente merge(BdcUsuarioAgente o) {
        return (BdcUsuarioAgente) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcUsuarioAgente o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcUsuarioAgente findById(String o) {
        return (BdcUsuarioAgente) this.getDao(BdcUsuarioAgente.class.getName()).findById(o);
    }

    @Override
    public List<BdcUsuarioAgente> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
