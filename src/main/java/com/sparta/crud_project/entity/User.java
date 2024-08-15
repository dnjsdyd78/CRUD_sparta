package com.sparta.crud_project.entity;

import lombok.Getter;

@Getter
public class User {
    final private Long UNIQUEID;
    final private Long PASSWORD;

    public User(Long UNIQUEID, Long PASSWORD) {
        this.UNIQUEID = UNIQUEID;
        this.PASSWORD = PASSWORD;
    }
}
