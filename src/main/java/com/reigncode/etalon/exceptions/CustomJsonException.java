package com.reigncode.etalon.exceptions;

/**
 * Created by denchiosa on 4/8/15.
 * used to be converted in JSON and sent to user
 */
public class CustomJsonException {
    private int type;
    private String message;

    public CustomJsonException(CustomException e) {
        this.type = e.getType();
        this.message = e.getMessage();
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
