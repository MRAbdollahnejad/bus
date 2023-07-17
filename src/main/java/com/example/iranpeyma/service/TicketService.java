package com.example.iranpeyma.service;

import com.example.iranpeyma.base.service.BaseService;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;

public interface TicketService extends BaseService<Ticket,Long> {
    TicketCommand createTicket(TicketCommand ticketCommand);
    Ticket findByNationalCodeAndTrip(TicketCommand ticketCommand);
    boolean isExistWithNationalCodeAndTrip(TicketCommand ticketCommand);
}
