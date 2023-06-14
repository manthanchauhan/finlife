package com.manthan.finlife.signup.services;

import com.manthan.finlife.signup.interfaces.UserSignupRequest;
import com.manthan.finlife.signup.interfaces.SignupService;
import com.manthan.finlife.user.interfaces.User;
import com.manthan.finlife.user.interfaces.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class SignupServiceImpl implements SignupService {
    private UserService userService;

    @Override
    public User signup(UserSignupRequest request) {
        User user = userService.getUserByEmailOrNull(request.getEmail());

        if (user != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User with this email already exists. Please Login.");
        }

        return userService.createUser(request);
    }
}
