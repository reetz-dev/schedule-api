package com.reetzzz.schedule.controller;
import java.util.List;

import com.reetzzz.schedule.DTO.GradeDTO;
import com.reetzzz.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ScheduleController {
    @Autowired
    private ScheduleService service;

    @GetMapping("/grades")
    public ResponseEntity<List<GradeDTO>> getGradesFromGradeApi() {
        try {
            List<GradeDTO> grades = service.getGradesFromGradeApi();
            return ResponseEntity.ok(grades);
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build(); // Caso haja um erro, retornar código 500

        }
    }

}




