package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.Optional;

public class UserRepositoryImpl extends BaseRepositoryImpl<Users, Long> implements UserRepository {
    public UserRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Users> getEntityClass() {
        return Users.class;
    }


    public Optional<Users> findUserByUsernameAndPassword(String username, byte[] password) throws NoResultException {
        TypedQuery<Users> query =
                em.createQuery("select u from Users u where u.uName=:uname and u.pass=:pass"
                        , getEntityClass());
        query.setParameter("uname", username);
        query.setParameter("pass", password);

        return Optional.of(query.getSingleResult());
    }
}
