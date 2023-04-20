package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSpaceDTO {

    private Long id;
    private ToDoDTO toDoDTO;
    private LocalDate date;
    private Integer time;
    private TaskDTO taskDTO;

}
