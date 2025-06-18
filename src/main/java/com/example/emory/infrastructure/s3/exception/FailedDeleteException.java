package com.example.emory.infrastructure.s3.exception;

import com.example.emory.global.error.exception.EmoryException;
import com.example.emory.global.error.exception.ErrorCode;

public class FailedDeleteException extends EmoryException {
    public static final EmoryException EXCEPTION = new FailedDeleteException();

    private FailedDeleteException() {
        super(ErrorCode.FAILED_DELETE);
    }
}
