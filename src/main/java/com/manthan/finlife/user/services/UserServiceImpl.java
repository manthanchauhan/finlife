package com.manthan.finlife.user.services;

import com.manthan.finlife.security.PasswordEncoder;
import com.manthan.finlife.signup.interfaces.UserSignupRequest;
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
    private final PasswordEncoder passwordEncoder;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUserByEmailOrNull(username);

        if (user == null){
            throw new UsernameNotFoundException(String.format("User with email '%s' not found", user));
        }

        return user;
    }

    @Override
    public User createUser(UserSignupRequest signupRequest) {
        UserImpl userImpl = UserImpl.fromUserSignupRequest(signupRequest);

        String encryptedPassword = passwordEncoder.encode(signupRequest.getPassword());
        userImpl.setEncryptedPassword(encryptedPassword);

        this.userRepository.save(userImpl);
        return userImpl;
    }

    @Override
    public User getUserByEmailOrNull(String email) {
        Optional<UserImpl> optionalUser = userRepository.findOne(UserRepository.hasEmail(email));

        return optionalUser.orElse(null);
    }
}
