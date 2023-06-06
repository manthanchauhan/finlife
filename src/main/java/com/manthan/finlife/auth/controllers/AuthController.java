package com.manthan.finlife.auth.controllers;

import com.manthan.finlife.auth.dtos.UserLoginRequestDto;
import com.manthan.finlife.response.Response;
import com.manthan.finlife.response.ResponseManager;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/login")
    public Response login(@RequestBody @Valid UserLoginRequestDto requestDto){
        return ResponseManager.buildResponse(HttpStatus.OK, "", null);
    }
}
