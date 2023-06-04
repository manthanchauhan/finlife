package com.manthan.finlife.response;

import org.springframework.http.HttpStatus;

public interface ResponseManager {
    static Response buildResponse(HttpStatus status, String message, Object data) {
        ResponseBody body = new ResponseBody(status.value(), message, data);
        return new Response(body, status);
    }
}
