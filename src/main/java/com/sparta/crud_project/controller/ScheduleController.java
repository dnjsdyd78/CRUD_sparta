package com.sparta.crud_project.controller;


import com.sparta.crud_project.RequestDTO.createRequestDTO;
import com.sparta.crud_project.RequestDTO.deleteRequestDTO;
import com.sparta.crud_project.RequestDTO.editRequestDTO;
import com.sparta.crud_project.ResponseDTO.*;
import com.sparta.crud_project.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    private Map<String, Schedule> ScheduleList = new HashMap<>();
    private final ArrayList<String> idManager = new ArrayList<>();
    //현재날짜
    LocalDate date = LocalDate.now();

    @ResponseBody
    @PostMapping("/create")
    public createResponseDTO createSchedule(createRequestDTO createRequestDTO) {

        // 아이디 생성 및 중복 체크
        String uniqueId = UUID.randomUUID().toString();
        idManager.add(uniqueId);
        while (idManager.contains(uniqueId)) {
            uniqueId = UUID.randomUUID().toString();
        }

        // 들어온 값 entity통해 저장
        ScheduleList.put(
                uniqueId,
                new Schedule(createRequestDTO.getTodoItem(), createRequestDTO.getEventDate(),
                        date, date, createRequestDTO.getScheduleAssignee(), createRequestDTO.getPassword()));

        // 데이터 리턴값에 담기
        createResponseDTO createResponse = new createResponseDTO(
                createRequestDTO.getScheduleAssignee(), createRequestDTO.getTodoItem(),
                createRequestDTO.getEventDate(), date, uniqueId);


        return createResponse;
    }

    @GetMapping("/pick")
    public getInfoResponseDTO pickSchedule(@RequestParam String id) {

        //URL로 들어온 아이디값으로 해당 벨류값 조회후 리턴값에 담기
        Schedule schedule = ScheduleList.get(id);
        getInfoResponseDTO getInfoResponseDTO =
                new getInfoResponseDTO(schedule.getScheduleAssignee(), schedule.getTodoItem(),
                        schedule.getEvenDate(), schedule.getRegistrationDate(), schedule.getModificationDate());

        return getInfoResponseDTO;
    }


    @GetMapping("/list")
    public List<getListResponseDTO> getScheduleList(String modificationDate, String scheduleAssignee) {

        // 저장소에서 수정일,담당자명조건충족하는 벨류값 추출
        List<Schedule> pickList = ScheduleList.values().stream().
                filter(f -> f.getModificationDate().equals(modificationDate)
                        || f.getScheduleAssignee().equals(scheduleAssignee))
                .collect(Collectors.toList());

        // 수정일 내림차순으로 정렬
        pickList.sort(Comparator.comparing(Schedule::getModificationDate).reversed());

        // 반환활 속성만 추출하여 리스트 재생성
        List<getListResponseDTO> getListResponse = pickList.stream()
                .map(Schedule -> new getListResponseDTO(Schedule.getEvenDate(),
                        Schedule.getTodoItem(), Schedule.getScheduleAssignee()))
                .collect(Collectors.toList());

        // 리스트 값으로 반환
        return getListResponse;
    }

    @PatchMapping("/edit")
    public editResponseDTO editSchedule(@ModelAttribute editRequestDTO editRequestDTO) {
        // id값 받아 저장소에 일치하는 데이터값 추출
        Schedule callData = ScheduleList.get(editRequestDTO.getId());

        // 수정된 데이터값 담아 해당 키값에 덮어써서 저장
        ScheduleList.put(editRequestDTO.getId(),
                new Schedule(
                        editRequestDTO.getTodoItem(), callData.getEvenDate(),
                        callData.getRegistrationDate(), editRequestDTO.getModificationDate(),
                        editRequestDTO.getScheduleAssignee(), callData.getPassword()
                ));

        // 수정된내용 리턴값에 담기
        editResponseDTO editResponse = new editResponseDTO(
                editRequestDTO.getTodoItem(), editRequestDTO.getScheduleAssignee(),
                callData.getEvenDate(), editRequestDTO.getModificationDate()
        );
        return editResponse;
    }

    @DeleteMapping("/delete")
    public String deleteSchedule(@ModelAttribute deleteRequestDTO deleteRequestDTO) {
        // ID,PASSWORD 데이터 받고 저장소 데이터 조회후 삭제 or 조회여부반환
        Schedule callData = ScheduleList.get(deleteRequestDTO.getId());
        if (callData.getPassword().equals(deleteRequestDTO.getPassword())) {
            ScheduleList.remove(deleteRequestDTO.getId());
            return "일정이 삭제되었습니다.";
        } else if(!ScheduleList.containsKey(deleteRequestDTO.getId())){
            return "아이디를 다시입력하세요.";
        }
        else {
            return "잘못된 비밀번호입니다.";
        }

    }
}
