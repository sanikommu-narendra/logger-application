package org.example;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.logDeposit("0001", 82);
        logger2.logWithdrawal("0002", 100);
        logger3.logTansfer("0001", "0003", 100);
        logger1.logDeposit("0004", 45);
        logger2.logWithdrawal("0005", 67.4);
    }
}
