package com.reetzzz.schedule.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.reetzzz.schedule.model.Weekday;

import java.util.List;

public record GradeDTO(
        @JsonAlias("id")
        Long id,
        @JsonAlias("name")
        String nome,
        @JsonAlias("horarios")
        List<String> horarios,
        @JsonAlias("weekdays")
        List<Weekday> weekdays) {

    public GradeDTO(GradeDTO dto){
        this(dto.id(), dto.nome(), dto.horarios(), dto.weekdays);
    }

    public String getNome() {
        return nome;
    }
}
