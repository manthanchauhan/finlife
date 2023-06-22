package com.manthan.finlife.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class Response extends ResponseEntity<ResponseBody> {

    public Response(ResponseBody body, HttpStatusCode status) {
        super(body, status);
    }

    public static Response SuccessWithData(Object data){
        ResponseBody body = new ResponseBody(HttpStatus.OK.value(), "Success", data);
        return new Response(body, HttpStatus.OK);
    }
}
