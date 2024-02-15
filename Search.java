package com.alihan.javarush.internetmagazine.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Timestamp
@Data
@Entity
@Table(name = "search")
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String category;
    private Time searchDate;
}
