package org.example.case_studies.logger;

public class Main {
    public static void main(String[] args) {

        LoggerManager logger = LoggerManager.getInstance();
        logger.log("This is my first log. Should be an INFO log written in a file and have a timestamp!");

        LoggerManager logger2 = LoggerManager.getInstance();
        logger2.log("Again same logger!!");
    }
}
/*
1. Use Enum for log level
enum LogLevel { INFO, DEBUG, ERROR }
2. Add Strategy for output
Instead of FileLogger, ConsoleLogger → use Strategy pattern
 */