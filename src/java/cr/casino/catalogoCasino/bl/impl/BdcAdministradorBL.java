
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcAdministrador;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcAdministradorBL extends BaseBL implements IBaseBL<BdcAdministrador, String>{

    public BdcAdministradorBL() {
        super();
    }
    
    @Override
    public void save(BdcAdministrador o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcAdministrador merge(BdcAdministrador o) {
        return (BdcAdministrador) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcAdministrador o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcAdministrador findById(String o) {
        return (BdcAdministrador) this.getDao(BdcAdministrador.class.getName()).findById(o);
    }

    @Override
    public List<BdcAdministrador> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
