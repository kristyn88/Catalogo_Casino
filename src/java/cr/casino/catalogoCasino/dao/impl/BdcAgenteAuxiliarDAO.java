
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcAgenteAuxiliar;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcAgenteAuxiliarDAO extends HibernateUtil implements IBaseDAO<BdcAgenteAuxiliar, String>{

    @Override
    public void save(BdcAgenteAuxiliar o) {
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
    public BdcAgenteAuxiliar merge(BdcAgenteAuxiliar o) {
        try {
            iniciaOperacion();
            o = (BdcAgenteAuxiliar) getSesion().merge(o);
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
    public void delete(BdcAgenteAuxiliar o) {
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
    public BdcAgenteAuxiliar findById(String codigo) {
        BdcAgenteAuxiliar agenteAuxiliar = null;

        try {
            iniciaOperacion();
            agenteAuxiliar = (BdcAgenteAuxiliar) getSesion().get(BdcAgenteAuxiliar.class, codigo);
        } finally {
            getSesion().close();
        }
        return agenteAuxiliar;
    }

    @Override
    public List<BdcAgenteAuxiliar> findAll() {
        List<BdcAgenteAuxiliar> listaAgenteAuxiliar;
        try {
            iniciaOperacion();
            listaAgenteAuxiliar = getSesion().createQuery("from BdcAgenteAuxiliar").list();
        } finally {
            getSesion().close();
        }

        return listaAgenteAuxiliar;
    }
    
}
