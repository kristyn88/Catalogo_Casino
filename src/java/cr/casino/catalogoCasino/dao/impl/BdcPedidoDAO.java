
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcPedido;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcPedidoDAO extends HibernateUtil implements IBaseDAO<BdcPedido, String>{

    @Override
    public void save(BdcPedido o) {
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
    public BdcPedido merge(BdcPedido o) {
         try {
            iniciaOperacion();
            o = (BdcPedido) getSesion().merge(o);
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
    public void delete(BdcPedido o) {
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
    public BdcPedido findById(String codigo) {
        BdcPedido pedido = null;

        try {
            iniciaOperacion();
            pedido = (BdcPedido) getSesion().get(BdcPedido.class, codigo);
        } finally {
            getSesion().close();
        }
        return pedido;
    }

    @Override
    public List<BdcPedido> findAll() {
        List<BdcPedido> listaPedido;
        try {
            iniciaOperacion();
            listaPedido = getSesion().createQuery("from BdcPedido").list();
        } finally {
            getSesion().close();
        }

        return listaPedido;
    }
    
}
