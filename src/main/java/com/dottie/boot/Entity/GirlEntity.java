package com.dottie.boot.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class GirlEntity {

    @Id
    private String id;
    private String age;
    private String cupSize;
}
