package com.sparta.crud_project.RequestDTO;

import lombok.Getter;

@Getter
public class deleteRequestDTO {
    private Long id;
    private Long password;

    public deleteRequestDTO(Long id, Long password) {
        this.id = id;
        this.password = password;
    }
}
