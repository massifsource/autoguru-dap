/**
 * Copyright 2015 MAssifSource
 *
 * @author Nikolay Sarychev <nikolaysarychev@gmail.com>
 */
package com.massifsource.autoguru.dap.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DapControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(DapControllerAdvice.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleHttpStatusException(RuntimeException e) {
        LOGGER.error(e.getMessage(), e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


