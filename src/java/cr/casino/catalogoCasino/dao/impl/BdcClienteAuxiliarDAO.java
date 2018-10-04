
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcClienteAuxiliar;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcClienteAuxiliarDAO extends HibernateUtil implements IBaseDAO<BdcClienteAuxiliar, String>{

    @Override
    public void save(BdcClienteAuxiliar o) {
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
    public BdcClienteAuxiliar merge(BdcClienteAuxiliar o) {
        try {
            iniciaOperacion();
            o = (BdcClienteAuxiliar) getSesion().merge(o);
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
    public void delete(BdcClienteAuxiliar o) {
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
    public BdcClienteAuxiliar findById(String codigo) {
        BdcClienteAuxiliar clienteAuxiliar = null;

        try {
            iniciaOperacion();
            clienteAuxiliar = (BdcClienteAuxiliar) getSesion().get(BdcClienteAuxiliar.class, codigo);
        } finally {
            getSesion().close();
        }
        return clienteAuxiliar;
    }

    @Override
    public List<BdcClienteAuxiliar> findAll() {
        List<BdcClienteAuxiliar> listaClienteAuxiliar;
        try {
            iniciaOperacion();
            listaClienteAuxiliar = getSesion().createQuery("from BdcClienteAuxiliar").list();
        } finally {
            getSesion().close();
        }

        return listaClienteAuxiliar;
    }
    
}
