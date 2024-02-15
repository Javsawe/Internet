package com.alihan.javarush.internetmagazine.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.swing.*;

@Data
@Entity
@Table(name = "categoriesAndSubcategories")
public class CategoriesAndSubcategories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private ImageIcon image;
}
