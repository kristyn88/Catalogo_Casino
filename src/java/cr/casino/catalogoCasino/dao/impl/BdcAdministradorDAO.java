
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcAdministrador;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcAdministradorDAO extends HibernateUtil implements IBaseDAO<BdcAdministrador, String>{

    @Override
    public void save(BdcAdministrador o) {
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
    public BdcAdministrador merge(BdcAdministrador o) {
        try {
            iniciaOperacion();
            o = (BdcAdministrador) getSesion().merge(o);
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
    public void delete(BdcAdministrador o) {
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
    public BdcAdministrador findById(String codigo) {
        BdcAdministrador administrador = null;

        try {
            iniciaOperacion();
            administrador = (BdcAdministrador) getSesion().get(BdcAdministrador.class, codigo);
        } finally {
            getSesion().close();
        }
        return administrador;
    }

    @Override
    public List<BdcAdministrador> findAll() {
        List<BdcAdministrador> listaAdministrador;
        try {
            iniciaOperacion();
            listaAdministrador = getSesion().createQuery("from BdcAdministrador").list();
        } finally {
            getSesion().close();
        }

        return listaAdministrador;
    }
    
}
