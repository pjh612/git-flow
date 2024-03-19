package com.example.gitflow.test.infrastructure.persistence;

import com.example.gitflow.test.model.Tester;
import com.example.gitflow.test.service.port.TesterRepositoryPort;
import org.springframework.stereotype.Repository;

@Repository
public class TesterRepositoryAdapter implements TesterRepositoryPort {
    @Override
    public Tester findById(Long id) {
        return new Tester(1L, "테스터1", "123123");
    }
}
