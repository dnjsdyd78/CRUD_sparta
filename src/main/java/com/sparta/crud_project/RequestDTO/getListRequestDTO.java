package com.sparta.crud_project.RequestDTO;

import java.time.LocalDate;

public class getListRequestDTO {
    private LocalDate modificationDate;
    private String cheduleAssignee;

    public getListRequestDTO(LocalDate modificationDate, String cheduleAssignee) {
        this.modificationDate = modificationDate;
        this.cheduleAssignee = cheduleAssignee;
    }
}
