package com.User.User.service;

import com.User.User.model.User;
import com.User.User.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepository userRepository;




    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
