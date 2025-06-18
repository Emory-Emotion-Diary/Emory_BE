package com.example.emory.domain.auth.exception;


import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

import javax.swing.*;

public class InvalidUserException extends EmoryException {

    public static final EmoryException EXCEPTION = new InvalidUserException();

    public InvalidUserException() {
        super(ErrorCode.INVALID_USER);
    }
}
