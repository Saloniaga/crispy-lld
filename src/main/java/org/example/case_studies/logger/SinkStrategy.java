package org.example.case_studies.logger;

public interface SinkStrategy {
    public void write(String msg);
}
