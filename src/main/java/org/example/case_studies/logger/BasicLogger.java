package org.example.case_studies.logger;

public class BasicLogger implements Logger{
    public SinkStrategy sink;
    BasicLogger(SinkStrategy sink){
        this.sink = sink;
    }
    public void log(String msg){
//        System.out.println(msg);
        sink.write(msg);
    }
}
