package com.yuzarsif.eticaret.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TelNoNotFoundException extends RuntimeException {

    public TelNoNotFoundException(String message) {
        super(message);
    }
}
