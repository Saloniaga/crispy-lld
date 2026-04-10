package org.example.case_studies.logger;

public class FileStrategy implements SinkStrategy{
    public void write(String msg){
        System.out.println("Writing to file: "+msg);
    }
}
