package com.sparta.crud_project.RequestDTO;

public class deleteRequestDTO {
    private Long id;
    private Long password;

    public deleteRequestDTO(Long id, Long password) {
        this.id = id;
        this.password = password;
    }
}
