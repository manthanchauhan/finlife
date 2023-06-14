package com.manthan.finlife.signup.controllers;

import com.manthan.finlife.signup.dtos.UserSignupRequestDto;
import com.manthan.finlife.response.Response;
import com.manthan.finlife.response.ResponseManager;
import com.manthan.finlife.signup.interfaces.SignupService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/signup")
@AllArgsConstructor
public class SignupController {
    private SignupService signupService;

    @PostMapping("")
    public Response signup(@RequestBody @Valid UserSignupRequestDto request){
        String authToken = signupService.signup(request);
        return ResponseManager.buildResponse(HttpStatus.OK, "", null);
    }
}
