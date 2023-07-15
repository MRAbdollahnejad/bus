package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.repository.TripRepository;
import com.example.iranpeyma.service.TripService;

public class TripServiceImpl extends BaseServiceImpl<Trip,Long, TripRepository> implements TripService {
    public TripServiceImpl(TripRepository repository) {
        super(repository);
    }
}
