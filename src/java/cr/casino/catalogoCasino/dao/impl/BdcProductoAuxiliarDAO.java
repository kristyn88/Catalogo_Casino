
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcProductoAuxiliar;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcProductoAuxiliarDAO extends HibernateUtil implements IBaseDAO<BdcProductoAuxiliar, String>{

    @Override
    public void save(BdcProductoAuxiliar o) {
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
    public BdcProductoAuxiliar merge(BdcProductoAuxiliar o) {
        try {
            iniciaOperacion();
            o = (BdcProductoAuxiliar) getSesion().merge(o);
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
    public void delete(BdcProductoAuxiliar o) {
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
    public BdcProductoAuxiliar findById(String codigo) {
        BdcProductoAuxiliar productoAuxiliar = null;

        try {
            iniciaOperacion();
            productoAuxiliar = (BdcProductoAuxiliar) getSesion().get(BdcProductoAuxiliar.class, codigo);
        } finally {
            getSesion().close();
        }
        return productoAuxiliar;
    }

    @Override
    public List<BdcProductoAuxiliar> findAll() {
        List<BdcProductoAuxiliar> listaProductoAuxiliar;
        try {
            iniciaOperacion();
            listaProductoAuxiliar = getSesion().createQuery("from BdcProductoAuxiliar").list();
        } finally {
            getSesion().close();
        }

        return listaProductoAuxiliar;
    }
    
}
