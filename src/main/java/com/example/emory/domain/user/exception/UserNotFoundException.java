package com.example.emory.domain.user.exception;

import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

public class UserNotFoundException extends EmoryException {
    public static final EmoryException EXCEPTION = new UserNotFoundException();

    private UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
