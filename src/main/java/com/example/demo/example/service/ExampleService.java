package com.example.demo.example.service;

import com.example.demo.example.domain.Example;
import com.example.demo.example.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Long newExample(Example example) {
        exampleRepository.save(example);
        return example.getId(); // 생성되면 확인을 위해 작성한 내용을 볼 페이지로 이동을 위해 id 반환
    }
}