package com.sparta.crud_project.ResponseDTO;

import java.time.LocalDate;

public class editResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private LocalDate eventDate;
    private LocalDate modificationDate;

    public editResponseDTO(String scheduleAssignee, String todoItem, LocalDate eventDate, LocalDate modificationDate) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.modificationDate = modificationDate;
    }
}
