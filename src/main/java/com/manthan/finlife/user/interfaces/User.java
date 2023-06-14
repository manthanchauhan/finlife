package com.manthan.finlife.user.interfaces;

import org.springframework.security.core.userdetails.UserDetails;

public interface User extends UserDetails {
    void setEncryptedPassword(String s);
}
