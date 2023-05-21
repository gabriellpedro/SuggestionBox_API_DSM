package com.fatecararas_suggestionbox.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fatecararas_suggestionbox.project.model.Category;
import com.fatecararas_suggestionbox.project.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void salvar(Category category) {
        repository.save(category);
    }

    public List<Category> getAll() {
        return repository.findAll();
     }
}
