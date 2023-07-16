package com.example.iranpeyma.service;

import com.example.iranpeyma.base.service.BaseService;
import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.entity.Trip;

import java.time.LocalDate;
import java.util.List;

public interface TripService extends BaseService<Trip,Long> {
    List<Trip> findTrips(TripSearchCommand tripSearchCommand);
}
