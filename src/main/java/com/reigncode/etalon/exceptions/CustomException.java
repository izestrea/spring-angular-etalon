package com.reigncode.etalon.exceptions;

/**
 * Created by denchiosa on 4/8/15.
 */
public class CustomException extends RuntimeException {

    private int type;
    private String message;


    public CustomException(String message, int type) {
        this.message = message;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

