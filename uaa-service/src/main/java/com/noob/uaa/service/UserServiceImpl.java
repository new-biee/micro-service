package com.noob.uaa.service;

import com.noob.uaa.entity.User;
import com.noob.uaa.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getByUsername(String username) {

        User user = userRepository.findByUsername(username).orElse(null);
        if (user == null) {
            return null;
        }
        return user;
    }

    @Override
    public User getByLogin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = getByUsername(username);
        if (user == null){
            return null;
        }
        return user;
    }
}
