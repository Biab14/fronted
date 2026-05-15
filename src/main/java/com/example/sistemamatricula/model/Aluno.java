package com.example.sistemamatricula.entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate nascimento;
}
