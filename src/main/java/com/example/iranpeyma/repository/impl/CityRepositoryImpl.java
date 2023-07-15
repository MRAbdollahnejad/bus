package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.entity.City;
import com.example.iranpeyma.repository.CityRepository;

import javax.persistence.EntityManager;

public class CityRepositoryImpl extends BaseRepositoryImpl<City,Long> implements CityRepository {
    public CityRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<City> getEntityClass() {
        return City.class;
    }
}
