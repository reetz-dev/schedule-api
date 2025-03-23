package com.reetzzz.schedule.service;
import com.reetzzz.schedule.DTO.GradeDTO;
import com.reetzzz.schedule.model.Schedule;
import com.reetzzz.schedule.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository repository;
    private final RestTemplate restTemplate = new RestTemplate();
    private final String GRADE_API_URL = "http://localhost:3000/grades";
    public List<Schedule> getAllSchedules() {
        return repository.findAll();
    }
    public List<GradeDTO> getGradesFromGradeApi() {
        GradeDTO[] grades = restTemplate.getForObject(GRADE_API_URL, GradeDTO[].class);
        return grades != null ? Arrays.asList(grades) : List.of();
    }
    public Optional<Schedule> getScheduleById(Long id) {
        return repository.findById(id);
    }

    public List<Schedule> getSchedulesByWeekday(String weekday) {
        return repository.findByWeekday(weekday);
    }

    public Schedule saveSchedule(Schedule schedule) {
        return repository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        repository.deleteById(id);
    }
}