package com.korol.service.impl;

import com.korol.persistence.repository.TransTypeRepository;
import com.korol.service.TransTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Somebody on 11.09.2016.
 */
@Service
public class TransTypeServiceImpl implements TransTypeService{
    @Autowired
    private TransTypeRepository transTypeRepository;

}
