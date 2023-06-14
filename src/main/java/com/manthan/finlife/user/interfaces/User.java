package com.manthan.finlife.user.interfaces;

import org.springframework.security.core.userdetails.UserDetails;

public interface User extends UserDetails {
    String getFirstName();
    String getLastName();
    Long getId();
    String getEmail();
    String getEncryptedPassword();
}
