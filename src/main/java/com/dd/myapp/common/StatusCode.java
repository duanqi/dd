/*
 * Copyright (c) 2004-2014 by UCweb All rights reserved
 */
package com.dd.myapp.common;

/**
 * 通用状态码
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月20日
 * 
 */
public enum StatusCode {

    // 操作成功
    SUCCESS(200, "success"),

    INVALID_BUSINESS_PARAMETER(400, "参数出错");

    private int code;

    private String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
