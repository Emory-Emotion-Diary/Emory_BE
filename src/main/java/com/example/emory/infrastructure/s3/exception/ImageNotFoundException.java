package com.example.emory.infrastructure.s3.exception;

import com.example.emory.global.error.exception.EmoryException;
import com.example.emory.global.error.exception.ErrorCode;

public class ImageNotFoundException extends EmoryException {
    public static final EmoryException EXCEPTION = new ImageNotFoundException();

    public ImageNotFoundException() {
        super(ErrorCode.IMAGE_NOT_FOUND);
    }
}
