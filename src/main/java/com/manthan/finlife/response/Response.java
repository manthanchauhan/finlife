package com.manthan.finlife.response;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class Response extends ResponseEntity<ResponseBody> {

    public Response(ResponseBody body, HttpStatusCode status) {
        super(body, status);
    }
}
