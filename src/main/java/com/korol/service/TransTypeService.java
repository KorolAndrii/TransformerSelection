package com.korol.service;

import com.korol.persistence.domain.TransType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Somebody on 11.09.2016.
 */
@Service
public interface TransTypeService {
    List<TransType> getAll();
}
