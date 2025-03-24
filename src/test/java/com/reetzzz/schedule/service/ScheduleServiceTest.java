package com.reetzzz.schedule.service;

import com.reetzzz.schedule.DTO.GradeDTO;
import org.junit.jupiter.api.Test;

import static com.reetzzz.schedule.model.Weekday.QUARTA_FEIRA;
import static com.reetzzz.schedule.model.Weekday.SEGUNDA_FEIRA;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class ScheduleServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ScheduleService scheduleService;

    private final String GRADE_API_URL = "http://localhost:3002/api/grades/weekdays";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetGradesFromGradeApi() {
        // Simulando a resposta da API (dados falsos)
//        GradeDTO[] mockGrades = {
//                new GradeDTO("Matemática", "13:30 até 14:15", SEGUNDA_FEIRA),
//                new GradeDTO("História", "15:30 até 16:15", QUARTA_FEIRA)
//        };


        // Configura o comportamento do Mock do RestTemplate
//        when(restTemplate.getForObject(GRADE_API_URL, GradeDTO[].class)).thenReturn(mockGrades);

        // Executa o método que estamos testando
        List<GradeDTO> grades = scheduleService.getGradesFromGradeApi();

        // Verificações
        assertNotNull(grades);

        // Verifica se o RestTemplate foi chamado uma única vez
//        verify(restTemplate, times(1)).getForObject(GRADE_API_URL, GradeDTO[].class);
    }
}