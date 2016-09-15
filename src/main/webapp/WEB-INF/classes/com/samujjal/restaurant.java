package com.samujjal;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by samujjal on 16/09/16.
 */
public class restaurant extends HttpServlet {

    protected String myParam = null;

    public void init(ServletConfig servletConfig) throws ServletException{
        this.myParam = servletConfig.getInitParameter("myParam");
    }
    protected void doGet( HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("user");
        response.getWriter().write("<html><body>GET response, Hello " + name+ "</body></html>");
    }
}
