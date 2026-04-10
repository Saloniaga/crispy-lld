package org.example.case_studies.logger;

public class TimestampLogger extends LogDecorator{
    //not required
//    public Logger logger;
    TimestampLogger(Logger logger){
        super(logger);
    }
    public void log(String msg){
        String newMsg  = System.currentTimeMillis()+" : "+msg;
        logger.log(newMsg);//
    }
}
