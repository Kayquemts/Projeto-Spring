package com.projeto.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{


}
