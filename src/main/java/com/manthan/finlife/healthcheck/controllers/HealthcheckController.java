package com.manthan.finlife.healthcheck.controllers;

import com.manthan.finlife.response.Response;
import com.manthan.finlife.response.ResponseManager;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/healthcheck")
public class HealthcheckController {
    @GetMapping("")
    public Response get() {
        return ResponseManager.buildResponse(HttpStatus.OK, "Success", null);
    }
}
