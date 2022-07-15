package com.clientui.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProducetBadRequestException extends RuntimeException {
    public ProducetBadRequestException(String message) {
        super(message);
    }
}
