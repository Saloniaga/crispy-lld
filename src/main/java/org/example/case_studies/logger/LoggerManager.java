package org.example.case_studies.logger;

public class LoggerManager {

    private static class Instantiate{
        private static LoggerManager INSTANCE = new LoggerManager();
    }
    public static LoggerManager getInstance(){
        return Instantiate.INSTANCE;
    }

    private Logger logger;
    private LoggerManager(){
        buildMyLogger();
    }
    private void buildMyLogger(){
        SinkStrategy sink = new FileStrategy();
        Logger myLogger = new BasicLogger(sink);
        myLogger = new TimestampLogger(myLogger);
        myLogger = new LevelDecorator(LogLevel.INFO, myLogger);
        logger = myLogger;
    }
    public void log(String msg){
        logger.log(msg);
    }

}
