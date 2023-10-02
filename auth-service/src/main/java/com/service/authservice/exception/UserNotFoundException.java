package com.service.authservice.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
