package com.example.iranpeyma.servlets;

import com.example.iranpeyma.dto.LoginDto;
import com.example.iranpeyma.security.HashedPassword;
import com.example.iranpeyma.util.Validation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

import static com.example.iranpeyma.util.Validation.passwordValidation;
import static com.example.iranpeyma.util.Validation.usernameValidation;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String pass = req.getParameter("pass");
        if (passwordValidation(pass) && usernameValidation(username)) {
            HashedPassword newPassword = new HashedPassword();
            byte[] hashedPassword;
            try {
                hashedPassword = newPassword.createHashedPassword(pass);
                LoginDto loginDto=new LoginDto();
                loginDto.setUName(username);
                loginDto.setPass(hashedPassword);


            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        } else {
            resp.sendRedirect("login.jsp");
        }

    }
}
