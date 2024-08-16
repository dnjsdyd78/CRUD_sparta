package com.sparta.crud_project.RequestDTO;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class createRequestDTO {
    private String scheduleAssignee;
    private String todoItem;
    private LocalDate eventDate;
    private Long password;

    public createRequestDTO(String scheduleAssignee, String todoItem, LocalDate eventDate, Long password) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.password = password;
    }


}
