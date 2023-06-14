package com.manthan.finlife.user.interfaces;

import com.manthan.finlife.signup.interfaces.UserSignupRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User createUser(UserSignupRequest signupRequest);
    User getUserByEmailOrNull(String email);
}
