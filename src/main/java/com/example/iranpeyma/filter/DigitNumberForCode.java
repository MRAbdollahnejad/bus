package com.example.iranpeyma.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DigitNumberForCode implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        String parameter = httpRequest.getParameter("national-code");
        char[] chars = parameter.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(parameter.charAt(i))) {
                flag = true;
            }
        }
        if (!flag) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            httpServletResponse.getWriter().println("code must be digit");
        }
    }

    @Override
    public void destroy() {

    }
}
