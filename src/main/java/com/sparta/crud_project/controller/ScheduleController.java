package com.sparta.crud_project.controller;


import com.sparta.crud_project.RequestDTO.createRequestDTO;
import com.sparta.crud_project.RequestDTO.deleteRequestDTO;
import com.sparta.crud_project.RequestDTO.editRequestDTO;
import com.sparta.crud_project.ResponseDTO.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @PostMapping("/create")
    public createResponseDTO createSchedule(@ModelAttribute createRequestDTO createRequestDTO){
        // 등록할 데이터 객체로받아 인스턴스에 저장 > 키값에 중복여부 조회후 중복시 id 값변환 > entity에 담아 저장소에 저장 > 결과물 반환

        return null;
    }

    @GetMapping("/pick")
    public getInfoResponseDTO pickSchedule(Long id){

        return null;
    }

    @GetMapping("/list")
    public List<getListResponseDTO> getScheduleList(String modificationDate, String scheduleAssignee){
        // 저장소 > 수정일,담당자명조건충족하는 벨류값 추출 > 스트림이용해 리스트로 재결합후 반환

        return null;
    }

    @PatchMapping("/edit")
    public editResponseDTO editSchedule(@ModelAttribute editRequestDTO editRequestDTO){
        // 수정데이터 받기 > 저장소에 있는 해당 키값 추출후 > 키값에 해당하는 벨류값 수정 > 수정후 Dto에 담아 반환
        editResponseDTO editResponseDTO = new editResponseDTO();
        return editResponseDTO;
    }

    @DeleteMapping("/delete")
    public deleteResponseDTO deleteSchedule(@ModelAttribute deleteRequestDTO deleteRequestDTO){
        // ID,PASSWORD 데이터 받고 저장소 데이터 조회후 삭제 or 조회여부반환
        return null;
    }
}
