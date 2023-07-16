package com.example.iranpeyma.repository;

import com.example.iranpeyma.base.repository.BaseRepository;
import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.entity.Trip;

import java.time.LocalDate;
import java.util.List;

public interface TripRepository extends BaseRepository<Trip,Long> {
    List<Trip> findTrips(TripSearchCommand tripSearchCommand);
}
