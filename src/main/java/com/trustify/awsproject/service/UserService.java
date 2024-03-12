package com.trustify.awsproject.service;

import com.trustify.awsproject.model.User;
import com.trustify.awsproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

}
