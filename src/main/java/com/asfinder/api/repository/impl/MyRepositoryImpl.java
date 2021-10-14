package com.asfinder.api.repository.impl;

import com.asfinder.api.repository.MyRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Repository
public class MyRepositoryImpl <T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID> {

    private EntityManager entityManager;

    public MyRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
    }

    @Override
    public void sharedCustomMethodJoksrc(ID id) {

    }
}
