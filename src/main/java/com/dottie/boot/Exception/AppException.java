package com.dottie.boot.Exception;

import lombok.Data;

@Data
public class AppException extends RuntimeException{
    private Integer code;

    private String message;

    public AppException(String message, Integer code) {
        this.code = code;
        this.message = message;
    }
}
