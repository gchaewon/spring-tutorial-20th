package com.ceos20.springboot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    @Transactional(readOnly = true)
    public List<Test> findAllTests(){
        return testRepository.findAll();
    }
}
