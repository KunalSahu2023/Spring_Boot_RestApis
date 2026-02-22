package com.javaDeveloper.springbootapi.payload;

import java.time.LocalDateTime;

public class ApiResponse <T> {
    private int code;
    private String message;
    private T data;   // ✅ GENERIC TYPE
    private LocalDateTime timestamp;

    public ApiResponse() {
    }

    public ApiResponse(int code, String message, T data, LocalDateTime timestamp) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
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

    public T getData() {        // ✅ GENERIC
        return data;
    }

    public void setData(T data) {   // ✅ GENERIC
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}
