package com.sparta.crud_project.ResponseDTO;

public class editResponseDTO {
    private String scheduleAssignee;
    private String todoItem;
    private String eventDate;
    private String modificationDate;
    private Long id;

    public editResponseDTO(String scheduleAssignee, String todoItem, String eventDate, String modificationDate, Long id) {
        this.scheduleAssignee = scheduleAssignee;
        this.todoItem = todoItem;
        this.eventDate = eventDate;
        this.modificationDate = modificationDate;
        this.id = id;
    }
}
