package com.reetzzz.schedule.service;


import com.reetzzz.schedule.model.Schedule;
import com.reetzzz.schedule.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository repository;

    public List<Schedule> getAllSchedules() {
        return repository.findAll();
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