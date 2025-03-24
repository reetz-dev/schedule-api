package com.reetzzz.schedule.repository;

import com.reetzzz.schedule.model.Schedule;
import com.reetzzz.schedule.model.Weekday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByWeekdays(Weekday weekday);
}
