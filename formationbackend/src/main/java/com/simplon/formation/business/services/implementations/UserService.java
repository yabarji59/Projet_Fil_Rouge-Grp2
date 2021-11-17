package com.simplon.formation.business.services.implementations;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.simplon.formation.persistance.dao.UserRepository;
import com.simplon.formation.persistance.entities.ApiUser;
import com.simplon.formation.persistance.entities.UserCreateRequest;


@Service
@RequiredArgsConstructor
public class UserService {

  @Autowired
    private  UserRepository userRepository;
    @Autowired
    private  BCryptPasswordEncoder passwordEncoder;


    public ApiUser readUserByUsername (String username) {
        return userRepository.findByUsername(username).orElseThrow(EntityNotFoundException::new);
    }

    public void createUser(UserCreateRequest userCreateRequest) {
        ApiUser user = new ApiUser();
        Optional<ApiUser> byUsername = userRepository.findByUsername(userCreateRequest.getUsername());
        if (byUsername.isPresent()) {
            throw new RuntimeException("User already registered. Please use different username.");
        }
        user.setUsername(userCreateRequest.getUsername());
        user.setPassword(passwordEncoder.encode(userCreateRequest.getPassword()));
        userRepository.save(user);
    }

   
}