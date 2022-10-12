package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Pedagogo extends Pessoa{
    Integer totalAtendPedag;

    public Pedagogo(String nome, Long cpf, LocalDate dataDeNascimento, Long telefone, Integer totalAtendPedag) {
        this.nome = nome;
        this.cpf = cpf;
        //this.codigo = codigo;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.totalAtendPedag = 0;
    }
}
