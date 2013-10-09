package com.springapp.mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionLog {

    public void addTransaction(Transaction transaction) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypal", "root", "masterkey");
        String insertTableSQL = "INSERT INTO transactions (debetor, creditor, amount) VALUES (?,?,?)";

        PreparedStatement statement = connection.prepareStatement(insertTableSQL);
        statement.setString(1, transaction.getSender());
        statement.setString(2, transaction.getReceiver());
        statement.setInt(3, transaction.getAmount());

        statement.executeUpdate();
    }

    public List<Transaction> getAllTransactions() throws ClassNotFoundException, SQLException {
        List<Transaction> result = new ArrayList<Transaction>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypal", "root", "masterkey");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT debetor, creditor, amount from transactions");

        while(rs.next()) {
            result.add(new Transaction(rs));
        }

        statement.close();
        connection.close();

        return result;
    }

    public void printAllTransactions() throws SQLException, ClassNotFoundException {
        System.out.println("All transactions: ");
        List<Transaction> transactions = getAllTransactions();
        for(Transaction transaction : transactions){
            transaction.print();
        }
    }

}
