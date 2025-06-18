package com.example.emory.domain.auth.exception;

import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

public class PasswordMismatchException extends EmoryException {

    public static final EmoryException EXCEPTION = new PasswordMismatchException();

    public PasswordMismatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
