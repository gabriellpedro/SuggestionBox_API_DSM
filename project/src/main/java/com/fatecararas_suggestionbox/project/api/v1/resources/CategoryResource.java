package com.fatecararas_suggestionbox.project.api.v1.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatecararas_suggestionbox.project.model.Category;
import com.fatecararas_suggestionbox.project.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryResource {

    private final CategoryService service;

    public CategoryResource(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/new")
    public ResponseEntity<Void> save(@RequestBody Category category) {
        category.setId(null);
        service.salvar(category);
        return ResponseEntity.ok().build();
    }
}
