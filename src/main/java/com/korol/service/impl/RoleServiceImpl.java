package com.korol.service.impl;

import com.korol.persistence.repository.RoleRepository;
import com.korol.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Somebody on 11.09.2016.
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;
}
