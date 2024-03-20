package com.example.gitflow.test.controller;

import com.example.gitflow.test.controller.dto.UpdateTesterRequest;
import com.example.gitflow.test.service.TesterService;
import com.example.gitflow.test.service.dto.TesterResponse;
import com.example.gitflow.test.service.dto.UpdateTesterCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testers/")
@RequiredArgsConstructor
public class TestController {
    private final TesterService testerService;

    @GetMapping("/{id}")
    public TesterResponse getById(@PathVariable Long id) {
        return testerService.findById(id);
    }

    @PostMapping("/id")
    public TesterResponse updateById(@PathVariable Long id, @RequestBody UpdateTesterRequest request) {
        UpdateTesterCommand command = new UpdateTesterCommand(id, request.getName(), request.getPassword());

        return testerService.updateById(command);
    }
}
