package com.dottie.boot.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ManEntity {

    @Id
    private String id;

    private String name;

    private Double salary;
}
