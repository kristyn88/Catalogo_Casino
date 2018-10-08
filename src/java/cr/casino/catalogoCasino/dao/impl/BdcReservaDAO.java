
package cr.casino.catalogoCasino.dao.impl;

import cr.casino.catalogoCasino.dao.IBaseDAO;
import cr.casino.catalogoCasino.domain.BdcReserva;
import cr.casino.catalogoCasino.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Jeremy
 */
public class BdcReservaDAO extends HibernateUtil implements IBaseDAO<BdcReserva, String>{

    @Override
    public void save(BdcReserva o) {
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
    public BdcReserva merge(BdcReserva o) {
        try {
            iniciaOperacion();
            o = (BdcReserva) getSesion().merge(o);
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
    public void delete(BdcReserva o) {
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
    public BdcReserva findById(String codigo) {
        BdcReserva reserva = null;

        try {
            iniciaOperacion();
            reserva = (BdcReserva) getSesion().get(BdcReserva.class, codigo);
        } finally {
            getSesion().close();
        }
        return reserva;
    }

    @Override
    public List<BdcReserva> findAll() {
        List<BdcReserva> listaReserva;
        try {
            iniciaOperacion();
            listaReserva = getSesion().createQuery("from BdcReserva").list();
        } finally {
            getSesion().close();
        }

        return listaReserva;
    }
    
}
