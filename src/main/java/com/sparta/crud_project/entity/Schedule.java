package com.sparta.crud_project.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Schedule {
    private String todoItem;
    private LocalDate evenDate;
    private LocalDate registrationDate;
    private LocalDate modificationDate;
    private String scheduleAssignee;
    private Long password;

    public Schedule(String todoItem, LocalDate evenDate, LocalDate registrationDate, LocalDate modificationDate, String scheduleAssignee, Long password) {
        this.todoItem = todoItem;
        this.evenDate = evenDate;
        this.registrationDate = registrationDate;
        this.modificationDate = modificationDate;
        this.scheduleAssignee = scheduleAssignee;
        this.password = password;
    }
}
