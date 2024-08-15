package com.sparta.crud_project.ResponseDTO;

public class getInfoResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private String evenDate;
    private String registrationDate;
    private String modificationDate;
    private String password;
    private String result;

    public getInfoResponseDTO(String scheduleAssignee, String todoItem, String evenDate, String registrationDate, String modificationDate, String password) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.evenDate = evenDate;
        this.registrationDate = registrationDate;
        this.modificationDate = modificationDate;
        this.password = password;
    }

    public getInfoResponseDTO(String result) {
        this.result = result;
    }
}
