package com.example.gitflow.test.infrastructure.persistence;

import com.example.gitflow.test.model.Tester;
import com.example.gitflow.test.service.port.TesterRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public class TesterRepositoryAdapter implements TesterRepositoryPort {
    private final Map<Long, Tester> testerMap = new ConcurrentHashMap<>();

    @PostConstruct
    private void init() {
        testerMap.put(1L, new Tester(1L, "테스터1", "123123"));
    }

    @Override
    public Tester findById(Long id) {
        Tester tester = testerMap.get(id);

        if(tester == null) {
            throw new RuntimeException("찾을 수 없음 " + id);
        }
        return tester;
    }

    @Override
    public void updateById(Tester tester) {
        testerMap.put(tester.getId(), tester);
    }



    @Override
    public void deleteById(Long id) {
        testerMap.remove(id);
    }
}
