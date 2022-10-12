package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Professor extends Pessoa{

    FormacaoAcademica formacao;
    ExperienciaDesenvolvimento experiencia;
    EstadoAtividade estado;

    public Professor(String nome, Long cpf, LocalDate dataDeNascimento, Long telefone, FormacaoAcademica formacao, ExperienciaDesenvolvimento experiencia, EstadoAtividade estado) {
        this.nome = nome;
        this.cpf = cpf;
        //this.codigo = codigo;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.formacao = formacao;
        this.experiencia = experiencia;
        this.estado = estado;
    }
}
