package com.example.emory.domain.auth.exception;

import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

public class InvalidTokenException extends EmoryException {

    public static final EmoryException EXCEPTION = new InvalidTokenException();

    public InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}