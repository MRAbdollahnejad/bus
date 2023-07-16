package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.repository.TripRepository;
import com.example.iranpeyma.service.TripService;

import javax.persistence.NoResultException;
import java.time.LocalDate;
import java.util.List;

public class TripServiceImpl extends BaseServiceImpl<Trip,Long, TripRepository> implements TripService {
    public TripServiceImpl(TripRepository repository) {
        super(repository);
    }

    @Override
    public List<Trip> findTrips(TripSearchCommand tripSearchCommand) throws NoResultException {
        return repository.findTrips(tripSearchCommand);
    }
}
