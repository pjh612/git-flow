package com.example.gitflow.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Tester {
    private Long id;
    private String name;
    private String password;

    public void update(String name, String password) {
        this.name = name == null ? this.name : name;
        this.password = password == null ? this.password : password;
    }
}
