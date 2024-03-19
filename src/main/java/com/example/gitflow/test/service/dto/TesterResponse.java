package com.example.gitflow.test.service.dto;

import com.example.gitflow.test.model.Tester;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TesterResponse {
    private Long id;
    private String name;

    public static TesterResponse of(Tester tester) {
        return new TesterResponse(tester.getId(), tester.getName());
    }
}
