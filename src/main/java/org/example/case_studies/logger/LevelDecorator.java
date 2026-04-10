package org.example.case_studies.logger;

public class LevelDecorator extends LogDecorator{
    public LogLevel level;
    LevelDecorator(LogLevel level, Logger logger){
        super(logger);
        this.level = level;
    }
    public void log(String msg){
        String msg2= "["+level+"]" + msg;
        logger.log(msg2);
    }
}
