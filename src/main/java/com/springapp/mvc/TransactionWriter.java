package com.springapp.mvc;


import java.util.List;

public class TransactionWriter {

    public static void print(List<Transaction> transactions) {
        System.out.println("All transactions: ");
        for(Transaction transaction : transactions){
            System.out.println(transaction);
        }
    }

}
