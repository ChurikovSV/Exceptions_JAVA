package org.example.Final_work;


public class CheckCountException extends RuntimeException{
    public CheckCountException(String message ) {
        super(message);
    }

    public CheckCountException() {
        super();
    }
}
