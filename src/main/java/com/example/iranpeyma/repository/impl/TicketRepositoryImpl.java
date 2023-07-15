package com.example.iranpeyma.repository.impl;

import com.example.iranpeyma.base.repository.BaseRepositoryImpl;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.repository.TicketRepository;

import javax.persistence.EntityManager;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket,Long> implements TicketRepository {

    public TicketRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }
}
