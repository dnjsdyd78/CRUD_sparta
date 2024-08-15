package com.sparta.crud_project.controller;


import com.sparta.crud_project.ResponseDTO.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @PostMapping("/create")
    public createResponseDTO createSchedule(){

        return null;
    }

    @GetMapping("/pick")
    public getInfoResponseDTO pickSchedule(){

        return null;
    }

    @GetMapping("/list")
    public getListResponseDTO getScheduleList(){

        return null;
    }

    @PatchMapping("/edit")
    public editResponseDTO editSchedule(){

        return null;
    }

    @DeleteMapping("/delete")
    public deleteResponseDTO deleteSchedule(){

        return null;
    }
}
