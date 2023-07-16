package com.example.iranpeyma.servlets;

import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.security.HashedPassword;
import com.example.iranpeyma.service.UserService;

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
                LoginCommand loginCommand =new LoginCommand();
                loginCommand.setUName(username);
                loginCommand.setPass(hashedPassword);
                UserService userService=getUserService();
                try {
                    if (userService.isUserExist(loginCommand)){
                        //create session
                        // go to another page
                        //TODO
                    HttpSession session = req.getSession();
                    session.setAttribute("username",username);
                        /*PrintWriter out = resp.getWriter();
                        out.println("welcome"+ username);*/
                        resp.sendRedirect("home.jsp");
                    }
                }catch (NoResultException e){
                    PrintWriter out = resp.getWriter();
                    out.println("username or password is wrong");
//                    resp.sendRedirect("login.jsp");
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        } else {
            resp.sendRedirect("login.jsp");
        }

    }
}
