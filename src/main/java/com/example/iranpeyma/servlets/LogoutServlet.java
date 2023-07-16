package com.example.iranpeyma.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute("username");
        session.invalidate();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("you Logged out successfully");
        out.println("<br>");
        out.print("<a href='login.jsp'>back to login page</a>");
    }
}
