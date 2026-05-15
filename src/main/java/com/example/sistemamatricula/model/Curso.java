package com.example.sistemamatricula.entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCurso;
    private String codigo;
    private String horario;
    private int vagas;
    private int vagasOcupadas;
}
