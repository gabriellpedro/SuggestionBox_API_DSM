package com.fatecararas_suggestionbox.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100, unique = true)
    private String description;
}
