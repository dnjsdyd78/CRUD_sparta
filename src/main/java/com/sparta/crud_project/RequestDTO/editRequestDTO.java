package com.sparta.crud_project.RequestDTO;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class editRequestDTO {
    private String todoItem;
    private String scheduleAssignee;
    private LocalDate modificationDate;
    private String id;
    private Long password;

    public editRequestDTO(String todoItem, String scheduleAssignee, LocalDate modificationDate, String id, Long password) {
        this.todoItem = todoItem;
        this.scheduleAssignee = scheduleAssignee;
        this.modificationDate = modificationDate;
        this.id = id;
        this.password = password;
    }
}
