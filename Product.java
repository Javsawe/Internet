package com.alihan.javarush.internetmagazine.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.swing.*;
import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int categoryId;
    private double price;
    private String description;
    private ImageIcon image;
    private Date publishedDate;
    }
