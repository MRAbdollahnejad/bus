package com.example.iranpeyma.repository;

import com.example.iranpeyma.base.repository.BaseRepository;
import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;

import java.util.List;

public interface TicketRepository extends BaseRepository<Ticket,Long> {
     Ticket findByNationalCodeAndTrip(TicketCommand ticketCommand);
     List<Ticket> findByUsername(LoginCommand loginCommand);
}
