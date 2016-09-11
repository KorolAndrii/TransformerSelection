package com.korol.service;

import com.korol.persistence.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by Somebody on 11.09.2016.
 */
@Service
public interface UserService {

    User getById(Long id);

}
