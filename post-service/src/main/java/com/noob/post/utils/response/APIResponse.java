package com.noob.post.utils.response;

import org.springframework.http.HttpStatus;

public class APIResponse<T> {

    private int code;

    private String message;

    private T data;

    public APIResponse() {
    }

    public APIResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> APIResponse<T> newSuccessResponse() {
        return new APIResponse<>(HttpStatus.OK.value(), "Thao tác thành công.", null);
    }

    public static <T> APIResponse<T> newSuccessResponse(String message) {
        return new APIResponse<>(HttpStatus.OK.value(), message, null);
    }

    public static <T> APIResponse<T> newSuccessResponse(int code, String message) {
        return new APIResponse<>(code, message, null);
    }

    public static <T> APIResponse<T> newSuccessResponse(T data) {
        return new APIResponse<>(HttpStatus.OK.value(), "Thao tác thành công.", data);
    }

    public static <T> APIResponse<T> newSuccessResponse(String message, T data) {
        return new APIResponse<>(HttpStatus.OK.value(), message, data);
    }

    public static <T> APIResponse<T> newSuccessResponse(int code, String message, T data) {
        return new APIResponse<>(code, message, data);
    }

    public static <T> APIResponse<T> newFailureResponse() {
        return new APIResponse<>(HttpStatus.BAD_REQUEST.value(), "Thao tác thất bại.", null);
    }

    public static <T> APIResponse<T> newFailureResponse(int code) {
        return new APIResponse<>(code, "Thao tác thất bại", null);
    }

    public static <T> APIResponse<T> newFailureResponse(int code, String message) {
        return new APIResponse<>(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
