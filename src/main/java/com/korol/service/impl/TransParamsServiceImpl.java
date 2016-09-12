package com.korol.service.impl;

import com.korol.persistence.domain.TransParams;
import com.korol.persistence.repository.TransParamsRepository;
import com.korol.service.TransParamsService;
import com.korol.service.TransTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Somebody on 11.09.2016.
 */
@Service
public class TransParamsServiceImpl implements TransParamsService {
    @Autowired
    private TransParamsRepository transParamsRepository;

    @Override
    public List<TransParams> getAll() {
        return transParamsRepository.findAll();
    }
}
