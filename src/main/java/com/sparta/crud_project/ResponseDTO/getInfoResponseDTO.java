package com.sparta.crud_project.ResponseDTO;

import java.time.LocalDate;

public class getInfoResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private LocalDate evenDate;
    private LocalDate registrationDate;
    private LocalDate modificationDate;


    public getInfoResponseDTO(String scheduleAssignee, String todoItem, LocalDate evenDate, LocalDate registrationDate, LocalDate modificationDate) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.evenDate = evenDate;
        this.registrationDate = registrationDate;
        this.modificationDate = modificationDate;
    }

}
