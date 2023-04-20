package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

    private Long id;
    private String name;
    private String description;
    private String jumpStart;
    private ToDoDTO toDoDTO;
    private boolean finished;

    private TaskDTO dependantTaskDTO;

}
