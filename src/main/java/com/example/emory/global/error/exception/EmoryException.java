package com.example.emory.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmoryException extends RuntimeException {
    private final ErrorCode errorCode;
}
