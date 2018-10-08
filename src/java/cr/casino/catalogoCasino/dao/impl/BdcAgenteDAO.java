
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcAgente;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcAgenteDAO extends HibernateUtil implements IBaseDAO<BdcAgente, String>{

    @Override
    public void save(BdcAgente o) {
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
    public BdcAgente merge(BdcAgente o) {
        try {
            iniciaOperacion();
            o = (BdcAgente) getSesion().merge(o);
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
    public void delete(BdcAgente o) {
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
    public BdcAgente findById(String codigo) {
        BdcAgente agente = null;

        try {
            iniciaOperacion();
            agente = (BdcAgente) getSesion().get(BdcAgente.class, codigo);
        } finally {
            getSesion().close();
        }
        return agente;
    }

    @Override
    public List<BdcAgente> findAll() {
        List<BdcAgente> listaAgente;
        try {
            iniciaOperacion();
            listaAgente = getSesion().createQuery("from BdcAgente").list();
        } finally {
            getSesion().close();
        }

        return listaAgente;
    }
    
}
