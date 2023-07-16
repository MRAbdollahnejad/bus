package com.example.iranpeyma.servlets;


import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.convertor.TripSearchCommandToTrip;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.service.TripService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/buy-ticket")
public class BuyTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String select = req.getParameter("select");
        String select2 = req.getParameter("select2");
        String date=req.getParameter("date");

        TripSearchCommand tripSearchCommand=new TripSearchCommand();
        tripSearchCommand.setStartCity(select);
        tripSearchCommand.setDestinationCity(select2);
        TripSearchCommandToTrip tripSearchCommandToTrip=new TripSearchCommandToTrip();
        tripSearchCommand.setLocalDate(tripSearchCommandToTrip.convertServletDateToJavaDate(date));
        TripService tripService =ApplicationContext.getTripService();
        try {
            if (tripService.findTrips(tripSearchCommand).size()!=0){
                resp.sendRedirect("ticket-list.jsp");
            }else {
                PrintWriter out = resp.getWriter();
                out.println("no result found at this moment");
            }
        }catch (NoResultException e){
            e.printStackTrace();
        }
    }
}
