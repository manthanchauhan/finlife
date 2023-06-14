package com.manthan.finlife.auth.dtos;

import com.manthan.finlife.auth.interfaces.UserLoginResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserLoginResponseDto implements UserLoginResponse {
    private String authToken;
}
