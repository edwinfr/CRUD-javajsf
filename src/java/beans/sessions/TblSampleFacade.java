/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans.sessions;

import entidades.TblSample;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author EDWIN
 */
@Stateless
public class TblSampleFacade extends AbstractFacade<TblSample> {
    @PersistenceContext(unitName = "ejemplo1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblSampleFacade() {
        super(TblSample.class);
    }
    
}
