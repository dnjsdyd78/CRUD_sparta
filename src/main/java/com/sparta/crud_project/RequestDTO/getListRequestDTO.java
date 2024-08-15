package com.sparta.crud_project.RequestDTO;

public class getListRequestDTO {
    private String modificationDate;
    private String cheduleAssignee;

    public getListRequestDTO(String modificationDate, String cheduleAssignee) {
        this.modificationDate = modificationDate;
        this.cheduleAssignee = cheduleAssignee;
    }
}
