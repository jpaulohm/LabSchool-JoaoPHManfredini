package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public abstract class Pessoa {
    String nome;
    Long telefone;        //alterar tipo depois
    LocalDate dataDeNascimento;
    Long cpf;            //alterar tipo depois
    Long codigo;

    public String getNome() {
        return nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Long getCpf() {
        return cpf;
    }

    public Long getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", codigo=" + codigo +
                '}';
    }
}
