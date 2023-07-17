package com.example.iranpeyma.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebFilter("/buy-ticket")
public class SameTargetCity implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest= (HttpServletRequest) servletRequest;
        String select = httpRequest.getParameter("select");
        String select2 = httpRequest.getParameter("select2");

        HttpServletResponse httpResponse=(HttpServletResponse) servletResponse;

        PrintWriter out = httpResponse.getWriter();
        if (!Objects.equals(select, select2)){
            filterChain.doFilter(servletRequest,servletResponse);

        }else {
            out.println("start city and destination are same please check it again");
        }
    }


}
