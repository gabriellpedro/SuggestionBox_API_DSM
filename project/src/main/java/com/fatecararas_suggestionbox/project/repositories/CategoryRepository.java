package com.fatecararas_suggestionbox.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatecararas_suggestionbox.project.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
