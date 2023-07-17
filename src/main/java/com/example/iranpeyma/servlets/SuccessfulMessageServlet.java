package com.example.iranpeyma.servlets;

import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successful")
public class SuccessfulMessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Trip trip = (Trip) req.getSession().getAttribute("trip-for-search");

        TicketService ticketService = ApplicationContext.getTicketService();
        TicketCommand ticketCommand = new TicketCommand();
        ticketCommand.setOwnerCode((String) req.getSession().getAttribute("national-code"));
        ticketCommand.setTrip(trip);

        Ticket ticket = ticketService.findByNationalCodeAndTrip(ticketCommand);
        req.getSession().setAttribute("ticket",ticket);

        resp.sendRedirect(req.getContextPath()+"/successful.jsp");


    }
}
