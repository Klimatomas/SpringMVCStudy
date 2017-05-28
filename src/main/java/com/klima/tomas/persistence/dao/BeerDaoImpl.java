package com.klima.tomas.persistence.dao;

import com.klima.tomas.persistence.entity.Beer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.text.MessageFormat;
import java.util.List;

@Transactional
@Repository
public class BeerDaoImpl implements BeerDao{

    @PersistenceContext
    protected EntityManager em;

    @Override
    public void create(Beer beer) {
        em.persist(beer);

    }

    @Override
    public List<Beer> getAll() {

//        String select = MessageFormat.format("Select x from {0} x", Beer.class.getAnnotation(Table.class).name());
        CriteriaBuilder builder = em.getEntityManagerFactory().getCriteriaBuilder();
        CriteriaQuery<Beer> criteria = builder.createQuery(Beer.class);
        Root<Beer> from = criteria.from(Beer.class);
        criteria.select(from);
        return em.createQuery(criteria).getResultList();

    }
}
