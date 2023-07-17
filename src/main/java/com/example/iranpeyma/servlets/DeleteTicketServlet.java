package com.example.iranpeyma.servlets;

import com.example.iranpeyma.entity.Ticket;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/delete-ticket")
public class DeleteTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ticket> ticketList =new ArrayList<>();
        List<Ticket> attribute = (List<Ticket>) req.getSession().getAttribute("tickets-by-user");
        ticketList.addAll(attribute) ;
        Integer index = (Integer) req.getSession().getAttribute("indexTwo");

        TicketService ticketService = ApplicationContext.getTicketService();
        try {
            ticketService.deleteById(ticketList.get(index).getId());
//            resp.getWriter().println("ticket deleted successfully");
            resp.sendRedirect(req.getContextPath()+"/home.jsp");
        }catch (Exception e){
            e.printStackTrace();
            resp.getWriter().println("the ticket has already been deleted");
//            resp.sendRedirect(req.getContextPath()+"/home.jsp");
        }
    }
}
