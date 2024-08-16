package com.sparta.crud_project.ResponseDTO;

import java.time.LocalDate;

public class getListResponseDTO {
    private LocalDate evenDate;
    private String todoItem;
    private String scheduleAssignee;

    public getListResponseDTO(LocalDate evenDate, String todoItem, String scheduleAssignee) {
        this.evenDate = evenDate;
        this.todoItem = todoItem;
        this.scheduleAssignee = scheduleAssignee;
    }

}
