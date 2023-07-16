package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.repository.TripRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class TripRepositoryImpl extends BaseRepositoryImpl<Trip,Long> implements TripRepository {
    public TripRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Trip> getEntityClass() {
        return Trip.class;
    }

    @Override
    public List<Trip> findTrips(TripSearchCommand tripSearchCommand) throws NoResultException {
        TypedQuery<Trip> query = em
                .createQuery("select t from Trip t where " +
                        "t.localDate=:localDate and " +
                        "t.startCity.cityName=:S and " +
                        "t.destinationCity.cityName=:D " +
                        "order by t.localTime asc ", getEntityClass());
        query.setParameter("localDate",tripSearchCommand.getLocalDate());
        query.setParameter("S",tripSearchCommand.getStartCity());
        query.setParameter("D",tripSearchCommand.getDestinationCity());
        return query.getResultList();
    }

}
