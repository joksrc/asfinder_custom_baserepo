package com.asfinder.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

//pretending to be used for userRepository
public interface MyRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID> {

        void sharedCustomMethodJoksrc(ID id);
}
