package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private final String fileName = "log.txt";
    private PrintWriter printWriter;

    public Logger() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter = new PrintWriter(fileWriter, true);
    }

    public void logDeposit(String account, double amount) {
        printWriter.println("Deposit ( " + account + " ) " + amount);
    }

    public void logWithdrawal(String account, double amount) {
        printWriter.println("Withdraw ( " + account + " ) " + amount);
    }

    public void logTansfer(String sender, String receiver, double amount) {
        printWriter.println("Transfer from ( " + sender + " ) to ( " + receiver + " )" + amount);
    }
}
