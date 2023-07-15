package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.repository.TicketRepository;
import com.example.iranpeyma.service.TicketService;

public class TicketServiceImpl extends BaseServiceImpl<Ticket,Long, TicketRepository> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }
}
