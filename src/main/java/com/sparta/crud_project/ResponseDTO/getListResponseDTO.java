package com.sparta.crud_project.ResponseDTO;

public class getListResponseDTO {
    private String evenDate;
    private String todoItem;
    private String scheduleAssignee;
    private String result;

    public getListResponseDTO(String evenDate, String todoItem, String scheduleAssignee) {
        this.evenDate = evenDate;
        this.todoItem = todoItem;
        this.scheduleAssignee = scheduleAssignee;
    }

    public getListResponseDTO(String result) {
        this.result = result;
    }
}
