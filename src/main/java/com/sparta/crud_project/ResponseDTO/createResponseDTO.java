package com.sparta.crud_project.ResponseDTO;


import java.time.LocalDate;

public class createResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private LocalDate eventDate;
    private LocalDate registrationDate;
    private String id;

    public createResponseDTO(String scheduleAssignee, String todoItem, LocalDate eventDate, LocalDate registrationDate, String id) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.registrationDate = registrationDate;
        this.id = id;
    }
}
