package com.sparta.crud_project.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Schedule {
    private String todoItem;
    private String evenDate;
    private String registrationDate;
    private String modificationDate;
    private String scheduleAssignee;

    public Schedule(String todoItem, String evenDate, String registrationDate, String modificationDate, String scheduleAssignee) {
        this.todoItem = todoItem;
        this.evenDate = evenDate;
        this.registrationDate = registrationDate;
        this.modificationDate = modificationDate;
        this.scheduleAssignee = scheduleAssignee;
    }
}
