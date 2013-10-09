package com.springapp.mvc;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Submit extends HttpServlet {

    private static Logger logger = Logger.getLogger(Submit.class);

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String sender = request.getParameter("sender");
        String receiver = request.getParameter("receiver");
        String amount = request.getParameter("amount");
        int amountInt = Integer.parseInt(amount);

        Transaction t = new Transaction(sender, receiver, amountInt);
        TransactionLog tl = new TransactionLog();
        try {
            tl.addTransaction(t);
            TransactionWriter.print(tl.getAllTransactions());
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info(" sender " + t.getSender());
        logger.info(" receiver " + t.getReceiver());
        logger.info(" amount " + t.getAmount());
        request.getRequestDispatcher("WEB-INF/thenksform.jsp").include(request, response);
    }

}

