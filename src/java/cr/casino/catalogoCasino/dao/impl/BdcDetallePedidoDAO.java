
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcDetallePedido;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcDetallePedidoDAO extends HibernateUtil implements IBaseDAO<BdcDetallePedido, String>{

    @Override
    public void save(BdcDetallePedido o) {
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
    public BdcDetallePedido merge(BdcDetallePedido o) {
        try {
            iniciaOperacion();
            o = (BdcDetallePedido) getSesion().merge(o);
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
    public void delete(BdcDetallePedido o) {
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
    public BdcDetallePedido findById(String codigo) {
        BdcDetallePedido detallePedido = null;

        try {
            iniciaOperacion();
            detallePedido = (BdcDetallePedido) getSesion().get(BdcDetallePedido.class, codigo);
        } finally {
            getSesion().close();
        }
        return detallePedido;
    }

    @Override
    public List<BdcDetallePedido> findAll() {
        List<BdcDetallePedido> listaDetallePedido;
        try {
            iniciaOperacion();
            listaDetallePedido = getSesion().createQuery("from BdcDetallePedido").list();
        } finally {
            getSesion().close();
        }

        return listaDetallePedido;
    }
    
}
