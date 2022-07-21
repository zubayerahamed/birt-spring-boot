package com.baeldung.birt.engine.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Report DTO class
 */
@Data
@NoArgsConstructor
public class Report {
    private String title;
    private String name;
    private List<Parameter> parameters = new ArrayList<>();

    public Report(String title, String name) {
        this.title = title;
        this.name = name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Parameter {
        private String title;
        private String name;
        private ParameterType type;

    }

    public enum ParameterType {
        INT, STRING
    }
}
