package com.springapp.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Transaction {

    String sender;
    String receiver;
    int amount;

    public Transaction(ResultSet rs){
        try {

            this.sender = rs.getString("debetor");
            this.receiver = rs.getString("creditor");
            this.amount = rs.getInt("amount");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Transaction init failed.");
        }
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(String sender, String receiver, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

}
