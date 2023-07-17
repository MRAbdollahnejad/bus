package com.example.iranpeyma.repository;

import com.example.iranpeyma.base.repository.BaseRepository;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;

public interface TicketRepository extends BaseRepository<Ticket,Long> {
     Ticket findByNationalCodeAndTrip(TicketCommand ticketCommand);
}
