/*
 * Copyright (c) 2004-2014 by UCweb All rights reserved
 */
package com.dd.myapp.exception;

import com.dd.myapp.common.StatusCode;

/**
 * 业务异常封装
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月20日
 * 
 */
public class BusinessArgumentException extends IllegalArgumentException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8484190239021413845L;

    /**
     * 业务错误代码
     */
    private int errorCode;

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param cause
     */
    public BusinessArgumentException(Throwable cause) {
        super(cause);
        this.errorCode = StatusCode.INVALID_BUSINESS_PARAMETER.getCode();
    }

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param message
     */
    public BusinessArgumentException(String message) {
        this(StatusCode.INVALID_BUSINESS_PARAMETER, message);
    }

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param errorCode
     * @param message
     */
    public BusinessArgumentException(StatusCode statusCode, String message) {
        super(message);
        this.errorCode = statusCode.getCode();
    }

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param errorCode
     * @param message
     */
    public BusinessArgumentException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param errorCode
     * @param message
     * @param args
     */
    public BusinessArgumentException(int errorCode, String message, Object... args) {
        this(errorCode, String.format(message, args));
    }

    /**
     * 
     * Creates a new instance of BusinessArgumentException.
     * 
     * @param errorCode
     * @param message
     * @param args
     */
    public BusinessArgumentException(StatusCode statusCode, String message, Object... args) {
        this(statusCode, String.format(message, args));
    }

    /**
     * 获取错误码
     * 
     * @return int
     */
    public int getErrorCode() {
        return errorCode;
    }
}