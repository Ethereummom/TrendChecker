package com.pingpong.jlab.pingpong.global.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {
    
    private int responseCode;
    private String message;
    private T data;


    public ApiResponse(int responseCode, String message){
        this.responseCode = responseCode;
        this.message = message;
        this.data = null;
    }

    public ApiResponse(int responseCode, String message, T data){
        this.responseCode = responseCode;
        this.message = message;
        this.data = data;
    }
}
