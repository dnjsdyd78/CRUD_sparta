package com.sparta.crud_project.RequestDTO;

public class getListRequestDto {
    private String modificationDate;
    private String cheduleAssignee;

    public getListRequestDto(String modificationDate, String cheduleAssignee) {
        this.modificationDate = modificationDate;
        this.cheduleAssignee = cheduleAssignee;
    }
}
