/**
 *
 */
package com.rmsi.mast.studio.mobile.dao.hibernate;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.rmsi.mast.studio.dao.hibernate.GenericHibernateDAO;
import com.rmsi.mast.studio.domain.SpatialUnitPersonWithInterest;
import com.rmsi.mast.studio.mobile.dao.SpatialUnitPersonWithInterestDao;
import java.util.ArrayList;
import javax.persistence.Query;

/**
 * @author Shruti.Thakur
 *
 */
@Repository
public class SpatialUnitPersonWithInterestHibernateDao extends
        GenericHibernateDAO<SpatialUnitPersonWithInterest, Long> implements
        SpatialUnitPersonWithInterestDao {

    private static final Logger logger = Logger
            .getLogger(PersonHiberanteDao.class);

    @Override
    public SpatialUnitPersonWithInterest addNextOfKin(
            List<SpatialUnitPersonWithInterest> nextOfKinList, Long usin) {
        try {
            Iterator<SpatialUnitPersonWithInterest> nextOfKinIter = nextOfKinList
                    .iterator();

            SpatialUnitPersonWithInterest nextOfKin = null;

            while (nextOfKinIter.hasNext()) {

                nextOfKin = nextOfKinIter.next();
                nextOfKin.setUsin(usin);

                makePersistent(nextOfKin);

            }
        } catch (Exception ex) {
            logger.error(ex);
            throw ex;
        }
        return null;
    }

    @Override
    public List<SpatialUnitPersonWithInterest> findByUsin(Long usin) {
        try {
            Query query = getEntityManager().createQuery("Select sp from SpatialUnitPersonWithInterest sp where sp.usin = :usin order by sp.id asc ");
            List<SpatialUnitPersonWithInterest> personinterest = query.setParameter("usin", usin).getResultList();

            if (personinterest.size() > 0) {
                return personinterest;
            } else {
                return new ArrayList<SpatialUnitPersonWithInterest>();
            }
        } catch (Exception e) {
            logger.error(e);
            return new ArrayList<SpatialUnitPersonWithInterest>();
        }
    }
}
