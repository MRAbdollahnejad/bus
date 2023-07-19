package com.example.iranpeyma.servlets;

import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.command.TicketCommand;
import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.entity.enums.Gender;
import com.example.iranpeyma.service.TicketService;
import com.example.iranpeyma.service.UserService;
import com.example.iranpeyma.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet("/create-ticket")
public class CreateTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        List<Trip> trips = new ArrayList<>((Collection<Trip>) session.getAttribute("trips"));

        int index = Integer.parseInt((String) req.getSession().getAttribute("index"));
        Trip trip = trips.get(index);

        req.getSession().setAttribute("trip-for-search", trip);

        TicketService ticketService = ApplicationContext.getTicketService();
        TicketCommand ticketCommand = new TicketCommand();
        String gender = req.getParameter("gender");
        Gender gender1;
        if (gender.equals("man")) {
            gender1 = Gender.MAN;
        } else gender1 = Gender.WOMAN;
        ticketCommand.setGender(gender1);

        String name = req.getParameter("name");
        ticketCommand.setOwner(name);

        ticketCommand.setTrip(trip);

        HttpSession session1 = req.getSession();
        String username = (String) session1.getAttribute("username");
        LoginCommand loginCommand = new LoginCommand();
        loginCommand.setUName(username);

        UserService userService = ApplicationContext.getUserService();
        Users userByUsername = userService.findUserByUsername(loginCommand);
        ticketCommand.setUsers(userByUsername);

        String nationalCode = req.getParameter("national-code");
        ticketCommand.setOwnerCode(nationalCode);

        if (!ticketService.isExistWithNationalCodeAndTrip(ticketCommand)) {

            ticketService.createTicket(ticketCommand);


            HttpSession session2 = req.getSession();
            session2.setAttribute("gender", gender);

            HttpSession session3 = req.getSession();
            session3.setAttribute("name", name);

            HttpSession session4 = req.getSession();
            session4.setAttribute("national-code", nationalCode);

            resp.sendRedirect(req.getContextPath() + "/successful");


        } else {
            //TODO optional go on another page or stay same page
            resp.getWriter().println("not allowed to have more than one ticket with same way and national code");
        }
    }
}
