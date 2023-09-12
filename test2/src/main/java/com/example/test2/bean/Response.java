package com.example.test2.bean;

import java.io.Serializable;

/**
 * @author nmy
 * @title: Response
 * @date 2023/9/12 15:52
 */
public class Response implements Serializable {
    private int code;
    private String message;
    private Object result;

    public Response() {
    }

    public Response(int code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
