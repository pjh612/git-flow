package com.example.gitflow.test.service.port;

import com.example.gitflow.test.model.Tester;

public interface TesterRepositoryPort {
    Tester findById(Long id);

    void updateById(Tester tester);

    void deleteById(Long id);
}
