package com.springsecurity.springsecurity.configs;


import javax.servlet.*;
import java.io.IOException;

public class CustomFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before Custom Filter");
        filterChain.doFilter(servletRequest,servletResponse); // Passes request and response to next filter
        System.out.println("After Custom Filter");
    }
}
