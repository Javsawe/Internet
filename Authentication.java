package com.alihan.javarush.internetmagazine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Name;
import lombok.Data;

@Data
@Entity
@Table(name = "authentication")
public class Authentication {
    @Id
    private String nameUser;
    private String email;
    private Integer numberPhone;
}
