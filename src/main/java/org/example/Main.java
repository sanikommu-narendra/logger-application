package org.example;

public class Main {
    public static void main(String[] args) {

        // multiple loggers each one having a printwriter is causing inconsistency
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.logDeposit("0001", 82);
        logger2.logWithdrawal("0002", 100);
        logger3.logTansfer("0001", "0003", 100);
        logger1.logDeposit("0004", 45);
        logger2.logWithdrawal("0005", 67.4);


        //using singleton logger

        SingletonLogger singletonLogger1 = SingletonLogger.getSingletonLogger();
        SingletonLogger singletonLogger2 = SingletonLogger.getSingletonLogger();
        SingletonLogger singletonLogger3 = SingletonLogger.getSingletonLogger();

        singletonLogger1.logDeposit("0001", 82);
        singletonLogger2.logWithdrawal("0002", 100);
        singletonLogger3.logTansfer("0001", "0003", 100);
        singletonLogger1.logDeposit("0004", 45);
        singletonLogger2.logWithdrawal("0005", 67.4);
    }
}
