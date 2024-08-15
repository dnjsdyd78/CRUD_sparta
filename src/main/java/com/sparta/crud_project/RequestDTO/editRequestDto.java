package com.sparta.crud_project.RequestDTO;

public class editRequestDto {
    private String todoItem;
    private String scheduleAssignee;
    private String modificationDate;
    private Long password;

    public editRequestDto(String todoItem, String scheduleAssignee, String modificationDate, Long password) {
        this.todoItem = todoItem;
        this.scheduleAssignee = scheduleAssignee;
        this.modificationDate = modificationDate;
        this.password = password;
    }
}
