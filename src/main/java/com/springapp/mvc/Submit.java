package com.springapp.mvc;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Submit extends HttpServlet {

    private static Logger logger = Logger.getLogger(Submit.class);

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        String sender = request.getParameter("sender");
        String receiver = request.getParameter("receiver");
        String amount = request.getParameter("amount");

        logger.error("===========================================================================");
        logger.error(amount);
        logger.error(sender);
        logger.error(receiver);


        logger.warn(sender);
        logger.warn(receiver);
        logger.warn(amount);
        request.getRequestDispatcher("WEB-INF/thenksform.jsp").include(request, response);

    }

}
