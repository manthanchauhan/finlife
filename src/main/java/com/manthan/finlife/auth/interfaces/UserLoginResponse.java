package com.manthan.finlife.auth.interfaces;

import com.manthan.finlife.user.interfaces.User;

public interface UserLoginResponse {
    String getAuthToken();
    User getUser();
}
