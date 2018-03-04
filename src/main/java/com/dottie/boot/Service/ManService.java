package com.dottie.boot.Service;

import com.dottie.boot.Entity.GirlEntity;

import java.util.List;

public interface ManService {
    List<GirlEntity> findByCupsize(String cupsize);
}
