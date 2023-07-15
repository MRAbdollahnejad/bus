package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.entity.City;
import com.example.iranpeyma.repository.CityRepository;
import com.example.iranpeyma.service.CityService;

public class CityServiceImpl extends BaseServiceImpl<City,Long, CityRepository> implements CityService {
    public CityServiceImpl(CityRepository repository) {
        super(repository);
    }
}
