package com.example.iranpeyma.servlets;

import com.example.iranpeyma.security.HashedPassword;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pass = req.getParameter("pass");
        HashedPassword newPassword=new HashedPassword();
        byte[] hashedPassword;
        try {
            hashedPassword = newPassword.createHashedPassword(pass);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
