package com.example.iranpeyma.servlets;


import com.example.iranpeyma.command.TripSearchCommand;
import com.example.iranpeyma.convertor.TripSearchCommandToTrip;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.service.TripService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

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
            List<Trip> trips = tripService.findTrips(tripSearchCommand);
            if (trips.size()!=0){
                HttpSession result = req.getSession();
                result.setAttribute("trips",trips);
                resp.sendRedirect(req.getContextPath()+"/ticket-list.jsp");
            }else {
                PrintWriter out = resp.getWriter();
                out.println("no result found at this moment");
            }
        }catch (NoResultException e){
            e.printStackTrace();
        }
    }
}
