package org.example.case_studies.logger;

public class ConsoleStrategy implements SinkStrategy{
    public void write(String msg){
        System.out.println("Writing to console: "+msg);
    }
}
