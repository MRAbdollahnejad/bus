package com.example.iranpeyma.service;

import com.example.iranpeyma.base.service.BaseService;
import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;

import javax.persistence.NoResultException;
import java.util.List;

public interface TicketService extends BaseService<Ticket, Long> {
    TicketCommand createTicket(TicketCommand ticketCommand);

    Ticket findByNationalCodeAndTrip(TicketCommand ticketCommand);

    boolean isExistWithNationalCodeAndTrip(TicketCommand ticketCommand);

    List<Ticket> findByUsername(LoginCommand loginCommand);

}
