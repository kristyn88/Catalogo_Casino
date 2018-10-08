
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcImgProducto;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcImgProductoDAO extends HibernateUtil implements IBaseDAO<BdcImgProducto, String>{

    @Override
    public void save(BdcImgProducto o) {
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
    public BdcImgProducto merge(BdcImgProducto o) {
        try {
            iniciaOperacion();
            o = (BdcImgProducto) getSesion().merge(o);
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
    public void delete(BdcImgProducto o) {
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
    public BdcImgProducto findById(String codigo) {
        BdcImgProducto imgProducto = null;

        try {
            iniciaOperacion();
            imgProducto = (BdcImgProducto) getSesion().get(BdcImgProducto.class, codigo);
        } finally {
            getSesion().close();
        }
        return imgProducto;
    }

    @Override
    public List<BdcImgProducto> findAll() {
        List<BdcImgProducto> listaImgProducto;
        try {
            iniciaOperacion();
            listaImgProducto = getSesion().createQuery("from BdcImgProducto").list();
        } finally {
            getSesion().close();
        }

        return listaImgProducto;
    }
    
}
