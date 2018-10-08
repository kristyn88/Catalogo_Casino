
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcVenta;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcVentaDAO extends HibernateUtil implements IBaseDAO<BdcVenta, String>{

    @Override
    public void save(BdcVenta o) {
        try {
            iniciaOperacion();
            getSesion().save(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public BdcVenta merge(BdcVenta o) {
        try {
            iniciaOperacion();
            o = (BdcVenta) getSesion().merge(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
        return o;
    }

    @Override
    public void delete(BdcVenta o) {
        try {
            iniciaOperacion();
            getSesion().delete(o);
            getTransac().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public BdcVenta findById(String codigo) {
        BdcVenta venta = null;

        try {
            iniciaOperacion();
            venta = (BdcVenta) getSesion().get(BdcVenta.class, codigo);
        } finally {
            getSesion().close();
        }
        return venta;
    }

    @Override
    public List<BdcVenta> findAll() {
        List<BdcVenta> listaVenta;
        try {
            iniciaOperacion();
            listaVenta = getSesion().createQuery("from BdcVenta").list();
        } finally {
            getSesion().close();
        }

        return listaVenta;
    }
    
}
