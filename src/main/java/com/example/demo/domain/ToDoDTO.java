package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDTO {

    private Long id;

    private String name;

    private String description;

    private String jumpStart;

    private Integer priority;

    //private LocalDate deadline;

    private Integer maxTime;

    private boolean finished;

    private CategoryDTO categoryDTO;

    private Long randomTaskId;

}
