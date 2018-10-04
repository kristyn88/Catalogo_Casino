
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcProducto;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcProductoDAO extends HibernateUtil implements IBaseDAO<BdcProducto, String>{

    @Override
    public void save(BdcProducto o) {
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
    public BdcProducto merge(BdcProducto o) {
        try {
            iniciaOperacion();
            o = (BdcProducto) getSesion().merge(o);
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
    public void delete(BdcProducto o) {
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
    public BdcProducto findById(String codigo) {
        BdcProducto producto = null;

        try {
            iniciaOperacion();
            producto = (BdcProducto) getSesion().get(BdcProducto.class, codigo);
        } finally {
            getSesion().close();
        }
        return producto;
    }

    @Override
    public List<BdcProducto> findAll() {
        List<BdcProducto> listaProducto;
        try {
            iniciaOperacion();
            listaProducto = getSesion().createQuery("from BdcProducto").list();
        } finally {
            getSesion().close();
        }

        return listaProducto;
    }
    
}
