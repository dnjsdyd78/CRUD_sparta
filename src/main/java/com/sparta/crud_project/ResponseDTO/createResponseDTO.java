package com.sparta.crud_project.ResponseDTO;

public class createResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private String eventDate;
    private String registrationDate;
    private Long id;

    public createResponseDTO(String scheduleAssignee, String todoItem, String eventDate, String registrationDate, Long id) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.registrationDate = registrationDate;
        this.id = id;
    }
}
