package com.manthan.finlife.user.services;

import com.manthan.finlife.user.domains.UserImpl;
import com.manthan.finlife.user.interfaces.User;
import com.manthan.finlife.user.interfaces.UserService;
import com.manthan.finlife.user.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return getUserByEmail(username);
    }

    @Override
    public User getUserByEmail(String email){
        Optional<UserImpl> optionalUser = userRepository.findOne(UserRepository.hasEmail(email));

        return optionalUser.orElseThrow(
                () -> new UsernameNotFoundException(String.format("User with email '%s' not found", email))
        );
    }
}
