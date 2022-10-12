package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    SituacaoDaMatricula situacaoMatricula;
    Float notaProcessoSeletivo;
    Integer totalAtendPedag;

    public SituacaoDaMatricula getSituacaoMatricula() {
        return situacaoMatricula;
    }

    public void setSituacaoMatricula(SituacaoDaMatricula situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String nome, Long cpf, LocalDate dataDeNascimento, Long telefone, SituacaoDaMatricula situacaoMatricula, Float notaProcessoSeletivo, Integer totalAtendPedag) {
        this.nome = nome;
        this.cpf = cpf;
        //this.codigo = codigo;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.situacaoMatricula = situacaoMatricula;
        this.notaProcessoSeletivo = notaProcessoSeletivo;
        this.totalAtendPedag = totalAtendPedag;
    }
}
