package com.manthan.finlife.signup.interfaces;

import com.manthan.finlife.user.interfaces.User;

public interface SignupService {
    User signup(UserSignupRequest request);
}
