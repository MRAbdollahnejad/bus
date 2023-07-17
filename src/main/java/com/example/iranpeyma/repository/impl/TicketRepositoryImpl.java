package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.repository.TicketRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket,Long> implements TicketRepository {

    public TicketRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }

    @Override
    public Ticket findByNationalCodeAndTrip(TicketCommand ticketCommand) throws NoResultException {
        TypedQuery<Ticket> query = em
                .createQuery("select t from Ticket t where " +
                        "t.ownerCode=:cod and " +
                        "t.trip=:trip", getEntityClass());
        query.setParameter("cod",ticketCommand.getOwnerCode());
        query.setParameter("trip",ticketCommand.getTrip());
        return query.getSingleResult();
    }
}
