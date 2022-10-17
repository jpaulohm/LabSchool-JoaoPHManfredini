package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Professor extends Pessoa{

    FormacaoAcademica formacao;
    ExperienciaDesenvolvimento experiencia;
    EstadoAtividade estado;

    public FormacaoAcademica getFormacao() {
        return formacao;
    }

    public ExperienciaDesenvolvimento getExperiencia() {
        return experiencia;
    }

    public EstadoAtividade getEstado() {
        return estado;
    }

    public Professor(String nome, Long cpf, LocalDate dataDeNascimento, Long telefone, FormacaoAcademica formacao, ExperienciaDesenvolvimento experiencia, EstadoAtividade estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = cpf;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.formacao = formacao;
        this.experiencia = experiencia;
        this.estado = estado;
    }
}
