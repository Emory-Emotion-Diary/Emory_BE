package com.example.emory.domain.auth.exception;

import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

public class ExpiredTokenException extends EmoryException {

    public static final EmoryException EXCEPTION = new ExpiredTokenException();

    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
