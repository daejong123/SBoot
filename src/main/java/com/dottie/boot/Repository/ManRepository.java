package com.dottie.boot.Repository;

import com.dottie.boot.Entity.GirlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManRepository extends JpaRepository<GirlEntity, String> {

    List<GirlEntity> findGirlEntityByCupSize(String cupSize);
}
