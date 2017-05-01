package com.auxibudget.api.repository;

import com.querydsl.core.types.EntityPath;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public abstract class AbstractRepository<PK extends Serializable, T> {

    @Autowired
    private SessionFactory sessionFactory;

    protected abstract EntityPath<T> getEntityPath();

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    public void update(T entity) {
        getSession().update(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }
}
