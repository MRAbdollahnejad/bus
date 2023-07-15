package com.example.iranpeyma.servlets;

import com.example.iranpeyma.dto.LoginDto;
import com.example.iranpeyma.security.HashedPassword;
import com.example.iranpeyma.service.UserService;
import com.example.iranpeyma.util.Validation;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

import static com.example.iranpeyma.util.ApplicationContext.getUserService;
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
                UserService userService=getUserService();
                try {
                    if (userService.isUserExist(loginDto)){
                        //create session
                        // go to another page
                        //TODO
//                    HttpSession session = req.getSession();
                        PrintWriter out = resp.getWriter();
                        out.println("welcome"+ username);
                    }
                }catch (NoResultException e){
                    PrintWriter out = resp.getWriter();
                    out.println("username or password is wrong");

                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        } else {
            resp.sendRedirect("login.jsp");
        }

    }
}
