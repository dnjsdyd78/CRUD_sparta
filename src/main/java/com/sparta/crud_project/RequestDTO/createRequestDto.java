package com.sparta.crud_project.RequestDTO;

public class createRequestDto {
    private String scheduleAssignee;
    private String todoItem;
    private String eventDate;
    private Long password;

    public createRequestDto(String scheduleAssignee, String todoItem, String eventDate, Long password) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.password = password;
    }


}
