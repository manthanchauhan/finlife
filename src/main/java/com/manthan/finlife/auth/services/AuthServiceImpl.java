package com.manthan.finlife.auth.services;

import com.manthan.finlife.auth.dtos.UserLoginResponseDto;
import com.manthan.finlife.auth.interfaces.AuthService;
import com.manthan.finlife.auth.interfaces.UserLoginRequest;
import com.manthan.finlife.auth.interfaces.UserLoginResponse;
import com.manthan.finlife.security.JwtTokenUtil;
import com.manthan.finlife.user.interfaces.User;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;

    public UserLoginResponse login(UserLoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        User user = (User) authentication.getPrincipal();

        String authToken = jwtTokenUtil.generateToken(user);

        return new UserLoginResponseDto(authToken);
    }
}
