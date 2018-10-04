
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcCliente;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcClienteDAO extends HibernateUtil implements IBaseDAO<BdcCliente, String>{

    @Override
    public void save(BdcCliente o) {
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
    public BdcCliente merge(BdcCliente o) {
        try {
            iniciaOperacion();
            o = (BdcCliente) getSesion().merge(o);
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
    public void delete(BdcCliente o) {
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
    public BdcCliente findById(String codigo) {
        BdcCliente cliente = null;

        try {
            iniciaOperacion();
            cliente = (BdcCliente) getSesion().get(BdcCliente.class, codigo);
        } finally {
            getSesion().close();
        }
        return cliente;
    }

    @Override
    public List<BdcCliente> findAll() {
        List<BdcCliente> listaCliente;
        try {
            iniciaOperacion();
            listaCliente = getSesion().createQuery("from BdcCliente").list();
        } finally {
            getSesion().close();
        }

        return listaCliente;
    }
    
}
