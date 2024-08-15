package com.sparta.crud_project.RequestDTO;

public class deleteRequestDto {
    private Long id;
    private Long password;

    public deleteRequestDto(Long id, Long password) {
        this.id = id;
        this.password = password;
    }
}
