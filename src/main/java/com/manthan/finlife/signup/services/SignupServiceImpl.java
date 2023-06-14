package com.manthan.finlife.signup.services;

import com.manthan.finlife.signup.interfaces.UserSignupRequest;
import com.manthan.finlife.signup.interfaces.SignupService;
import com.manthan.finlife.user.interfaces.User;
import com.manthan.finlife.user.interfaces.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SignupServiceImpl implements SignupService {
    private UserService userService;

    @Override
    public String signup(UserSignupRequest request) {
        User user = userService.getUserByEmail(request.getEmail());

//        if (user != null){
//            throw new RestClientException();
//        }
        return null;
    }
}
