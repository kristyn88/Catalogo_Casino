
package cr.casino.catalogoCasino.bl.impl;

import cr.casino.catalogoCasino.bl.BaseBL;
import cr.casino.catalogoCasino.bl.IBaseBL;
import cr.casino.catalogoCasino.domain.BdcImgProducto;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class BdcImgProductoBL extends BaseBL implements IBaseBL<BdcImgProducto, String>{

    public BdcImgProductoBL() {
        super();
    }
    
    @Override
    public void save(BdcImgProducto o) {
        this.getDao(o.getClass().getName()).save(o);
    }

    @Override
    public BdcImgProducto merge(BdcImgProducto o) {
        return (BdcImgProducto) this.getDao(o.getClass().getName()).merge(o);
    }

    @Override
    public void delete(BdcImgProducto o) {
        this.getDao(o.getClass().getName()).delete(o);
    }

    @Override
    public BdcImgProducto findById(String o) {
        return (BdcImgProducto) this.getDao(BdcImgProducto.class.getName()).findById(o);
    }

    @Override
    public List<BdcImgProducto> findAll(String className) {
        return this.getDao(className).findAll();
    }
    
}
