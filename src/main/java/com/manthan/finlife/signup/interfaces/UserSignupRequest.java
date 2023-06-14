package com.manthan.finlife.signup.interfaces;

import jakarta.validation.constraints.NotNull;

public interface UserSignupRequest {
    @NotNull String getEmail();
    String getPassword();
    String getFirstName();
    String getLastName();
}
