
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcReserva;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcReservaBL extends BaseBL implements IBaseBL<BdcReserva, String>{

    public BdcReservaBL() {
        super();
    }
    
    @Override
    public void save(BdcReserva o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcReserva merge(BdcReserva o) {
        return (BdcReserva) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcReserva o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcReserva findById(String o) {
        return (BdcReserva) this.getDao(BdcReserva.class.getName()).findById(o);
    }

    @Override
    public List<BdcReserva> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
