package com.alihan.javarush.internetmagazine.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Timestamp
@Data
@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private int quantity;
    private double productPrice;
    private String category;
    private Time addDate;
    private Time deleteDate;
}
