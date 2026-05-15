package com.example.sistemamatricula.model;
import java.time.LocalDate;

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate nascimento
    
     public Aluno(String nomeCompleto, String cpf, String email, String telefone, LocalDate nascimento){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;}
        
    public String getnomeCompleto {
        return nomeCompleto;
    }
    
    public String getcpf {
        return cpf
    }
    
    public String getemail {
        return email;
    }
    
    public String gettelefone {
        return telefone
    }
    
    public LocalDate getnascimento{
        return nascimento
    }

}
