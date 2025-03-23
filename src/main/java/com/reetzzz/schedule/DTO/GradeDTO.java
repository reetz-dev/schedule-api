package com.reetzzz.schedule.DTO;

import com.reetzzz.schedule.model.Weekday;

public record GradeDTO(String nome, String horario, Weekday weekday) {
    public GradeDTO(GradeDTO dto){
        this(dto.nome(), dto.horario(), dto.weekday);
    }

    public String getNome() {
        return nome;
    }
}
