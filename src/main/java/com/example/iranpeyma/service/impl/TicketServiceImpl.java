package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.convertor.TicketCommandConvertToTicket;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.repository.TicketRepository;
import com.example.iranpeyma.service.TicketService;

public class TicketServiceImpl extends BaseServiceImpl<Ticket,Long, TicketRepository> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

    @Override
    public TicketCommand createTicket(TicketCommand ticketCommand) {
        TicketCommandConvertToTicket ticketCommandConvertToTicket =new TicketCommandConvertToTicket();
        Ticket ticket=ticketCommandConvertToTicket.convert(ticketCommand);
        this.save(ticket);
        return ticketCommand;
    }
}
