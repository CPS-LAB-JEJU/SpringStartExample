package com.example.demo.example.repository;

import com.example.demo.example.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>{


    Optional<Example> findById(Long id);
    Optional<Example> findByTitle(String title);
}
