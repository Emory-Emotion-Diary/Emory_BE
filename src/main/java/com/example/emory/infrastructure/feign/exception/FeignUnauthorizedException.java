package com.example.emory.infrastructure.feign.exception;

import com.example.emory.global.error.exception.ErrorCode;
import com.example.emory.global.error.exception.EmoryException;

public class FeignUnauthorizedException extends EmoryException {

    public static final EmoryException EXCEPTION = new FeignUnauthorizedException();

    private FeignUnauthorizedException(){
        super(ErrorCode.FEIGN_UNAUTHORIZED_EXCEPTION);
    }
}
