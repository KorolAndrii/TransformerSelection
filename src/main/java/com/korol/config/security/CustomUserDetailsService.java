package com.korol.config.security;

/**
 * Created by Somebody on 11.09.2016.
 */

import com.korol.persistence.domain.Role;
import com.korol.persistence.domain.User;
import com.korol.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chalienko on 10.05.2016.
 */
@Service(value = "userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public CustomUserDetailsService(UserService userRepository) {
        this.userService = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByUserName(username);
        if (null == user) {
            throw new UsernameNotFoundException("No user present with username: " + username);
        } else {
            System.out.println(user);
            Role role = user.getRole();
            List<String> userRoles = new ArrayList<>();
            userRoles.add(role.getRoleName());
            return new CustomUserDetails(user, userRoles);
        }
    }
}

