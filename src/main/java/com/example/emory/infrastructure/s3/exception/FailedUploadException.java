package com.example.emory.infrastructure.s3.exception;

import com.example.emory.global.error.exception.EmoryException;
import com.example.emory.global.error.exception.ErrorCode;

public class FailedUploadException extends EmoryException {
    public static final EmoryException EXCEPTION = new FailedUploadException();

    private FailedUploadException() {
        super(ErrorCode.FAILED_UPLOAD);
    }
}
