package org.example.case_studies.logger;

public abstract class LogDecorator implements Logger {
    public Logger logger;//why protected here?
    LogDecorator(Logger logger){
        this.logger = logger;
    }
    //not required
//    public void log(){
//        System.out.println();
//    }
}
