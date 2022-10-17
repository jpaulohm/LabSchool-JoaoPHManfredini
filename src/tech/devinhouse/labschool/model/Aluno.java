package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    SituacaoDaMatricula situacaoMatricula;
    Float notaProcessoSeletivo;
    Integer totalAtendPedag;

    public Integer acrescerAtendPedag(){
        totalAtendPedag++;
        return totalAtendPedag;
    }

    public Float getNotaProcessoSeletivo() {
        return notaProcessoSeletivo;
    }

    public Aluno(String nome,
                 Long cpf,
                 LocalDate dataDeNascimento,
                 Long telefone,
                 SituacaoDaMatricula situacaoMatricula,
                 Float notaProcessoSeletivo) {

        this.nome = nome;
        this.cpf = cpf;
        this.codigo = cpf;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.totalAtendPedag = 0;
        this.situacaoMatricula = situacaoMatricula;
        this.notaProcessoSeletivo = notaProcessoSeletivo;
    }

    public Integer getTotalAtendPedag() {
        return totalAtendPedag;
    }

    private void setTotalAtendPedag(Integer totalAtendPedag) {
        this.totalAtendPedag = totalAtendPedag;
    }



    public SituacaoDaMatricula getSituacaoMatricula() {
        return situacaoMatricula;
    }

    public void setSituacaoMatricula(SituacaoDaMatricula situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }


}
