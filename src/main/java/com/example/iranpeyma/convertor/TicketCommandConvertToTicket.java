package com.example.iranpeyma.convertor;

import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;

public class TicketCommandConvertToTicket {
    public Ticket convert(TicketCommand ticketCommand){
        Ticket ticket=new Ticket();
        ticket.setTrip(ticketCommand.getTrip());
        ticket.setOwner(ticketCommand.getOwner());
        ticket.setUsers(ticketCommand.getUsers());
        ticket.setGender(ticketCommand.getGender());
        ticket.setUuid(ticketCommand.getUuid());
        return ticket;
    }
}
