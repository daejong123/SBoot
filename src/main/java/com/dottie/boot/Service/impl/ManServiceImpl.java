package com.dottie.boot.Service.impl;

import com.dottie.boot.Entity.GirlEntity;
import com.dottie.boot.Repository.ManRepository;
import com.dottie.boot.Service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServiceImpl implements ManService {

    @Autowired
    private ManRepository manRepository;

    @Override
    public List<GirlEntity> findByCupsize(String cupsize) {
        return manRepository.findGirlEntityByCupSize(cupsize);
    }
}
