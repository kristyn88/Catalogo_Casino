
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcUsuarioAgente;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcUsuarioAgenteDAO extends HibernateUtil implements IBaseDAO<BdcUsuarioAgente, String>{

    @Override
    public void save(BdcUsuarioAgente o) {
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
    public BdcUsuarioAgente merge(BdcUsuarioAgente o) {
        try {
            iniciaOperacion();
            o = (BdcUsuarioAgente) getSesion().merge(o);
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
    public void delete(BdcUsuarioAgente o) {
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
    public BdcUsuarioAgente findById(String codigo) {
        BdcUsuarioAgente usuarioAgente = null;

        try {
            iniciaOperacion();
            usuarioAgente = (BdcUsuarioAgente) getSesion().get(BdcUsuarioAgente.class, codigo);
        } finally {
            getSesion().close();
        }
        return usuarioAgente;
    }

    @Override
    public List<BdcUsuarioAgente> findAll() {
        List<BdcUsuarioAgente> listaUsuarioAgente;
        try {
            iniciaOperacion();
            listaUsuarioAgente = getSesion().createQuery("from BdcUsuarioAgente").list();
        } finally {
            getSesion().close();
        }

        return listaUsuarioAgente;
    }
    
}
