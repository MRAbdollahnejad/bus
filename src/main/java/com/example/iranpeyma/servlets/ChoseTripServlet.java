package com.example.iranpeyma.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/chose-ticket")
public class ChoseTripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String index = req.getParameter("index");

        HttpSession session = req.getSession();
        session.setAttribute("index",index);
        resp.sendRedirect(req.getContextPath()+"/name.jsp");


    }
}
