package com.alura.forohub.dto;

import com.alura.forohub.model.Curso;
import com.alura.forohub.model.Topico;

import java.time.LocalDateTime;

public record DatosListarTopico(String titulo, String mensaje, LocalDateTime fecha, Curso curso) {
    public DatosListarTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getCurso());
    }
}
