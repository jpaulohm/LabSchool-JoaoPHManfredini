package tech.devinhouse.labschool.model;

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
}
