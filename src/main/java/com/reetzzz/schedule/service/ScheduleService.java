package com.reetzzz.schedule.service;
import com.reetzzz.schedule.DTO.GradeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String GRADE_API_URL = "http://localhost:3002/api/grades";
    public List<GradeDTO> getGradesFromGradeApi() {
        GradeDTO[] grades = restTemplate.getForObject(GRADE_API_URL, GradeDTO[].class);
        return grades != null ? Arrays.asList(grades) : List.of();
    }
}
