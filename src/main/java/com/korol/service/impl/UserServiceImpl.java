package com.korol.service.impl;

import com.korol.persistence.domain.User;
import com.korol.persistence.repository.UserRepository;
import com.korol.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Somebody on 10.09.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        return userRepository.findOne(id);
    }


}
