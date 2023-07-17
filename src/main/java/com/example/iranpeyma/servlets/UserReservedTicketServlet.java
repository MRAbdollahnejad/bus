package com.example.iranpeyma.servlets;

import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/reserved-tickets")
public class UserReservedTicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TicketService ticketService = ApplicationContext.getTicketService();
        LoginCommand loginCommand = new LoginCommand();
        String username = (String) req.getSession().getAttribute("username");
        loginCommand.setUName(username);
        List<Ticket> ticketList = new ArrayList<>();
        try {
            List<Ticket> byUsername = ticketService.findByUsername(loginCommand);
            ticketList.addAll(byUsername);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (ticketList.size()!=0){
            HttpSession session = req.getSession();
            session.setAttribute("tickets-by-user",ticketList);
            resp.sendRedirect(req.getContextPath() + "/all-ticket.jsp");
        }else {
            resp.getWriter().println("no result found for this user");
        }
    }
}
