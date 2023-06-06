package com.manthan.finlife.auth.dtos;

import com.manthan.finlife.auth.interfaces.UserLoginRequest;
import com.manthan.finlife.auth.validators.ValidPassword;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDto implements UserLoginRequest {
    @NotNull(message = "email is missing")
    @Pattern(regexp = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email")
    private String email;

    @ValidPassword
    private String password;
}
