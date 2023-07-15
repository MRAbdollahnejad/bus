package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.repository.TripRepository;

import javax.persistence.EntityManager;

public class TripRepositoryImpl extends BaseRepositoryImpl<Trip,Long> implements TripRepository {
    public TripRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Trip> getEntityClass() {
        return Trip.class;
    }
}
