package com.reetzzz.schedule.controller;
import java.util.List;
import java.util.Optional;

import com.reetzzz.schedule.model.Schedule;
import com.reetzzz.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleService service;

    @GetMapping
    public List<Schedule> getAllSchedules() {
        return service.getAllSchedules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getScheduleById(@PathVariable Long id) {
        Optional<Schedule> schedule = service.getScheduleById(id);
        return schedule.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/weekday/{weekday}")
    public List<Schedule> getSchedulesByWeekday(@PathVariable String weekday) {
        return service.getSchedulesByWeekday(weekday);
    }

    @PostMapping
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        return service.saveSchedule(schedule);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Schedule> updateSchedule(@PathVariable Long id, @RequestBody Schedule newSchedule) {
        Optional<Schedule> schedule = service.getScheduleById(id);
        if (schedule.isPresent()) {
            Schedule updatedSchedule = schedule.get();
            updatedSchedule.setName(newSchedule.getName());
            updatedSchedule.setWeekdays(newSchedule.getWeekdays());
            updatedSchedule.setTime(newSchedule.getTime());
            return ResponseEntity.ok(service.saveSchedule(updatedSchedule));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long id) {
        service.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}
