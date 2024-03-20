package com.example.gitflow.test.service;

import com.example.gitflow.test.service.dto.UpdateTesterCommand;
import com.example.gitflow.test.model.Tester;
import com.example.gitflow.test.service.dto.TesterResponse;
import com.example.gitflow.test.service.port.TesterRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TesterService {
    private final TesterRepositoryPort testerRepositoryPort;

    public TesterResponse findById(Long id) {
        Tester tester = testerRepositoryPort.findById(id);

        return TesterResponse.of(tester);
    }

    public TesterResponse updateById(UpdateTesterCommand command) {
        Tester tester = testerRepositoryPort.findById(command.id());
        tester.update(command.name(), command.password());

        testerRepositoryPort.updateById(tester);

        return TesterResponse.of(tester);
    }

    public void deleteById(Long id) {
        testerRepositoryPort.deleteById(id);
    }
}
