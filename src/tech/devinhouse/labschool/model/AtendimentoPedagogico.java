package tech.devinhouse.labschool.model;

public class AtendimentoPedagogico {
    Long codPedagogo;

    Long codAluno;
    public AtendimentoPedagogico(Pedagogo pedagogo, Aluno aluno){

        this.codPedagogo = pedagogo.getCodigo();

        this.codAluno = aluno.getCodigo();

        aluno.acrescerAtendPedag();
        pedagogo.acrescerAtendPedag();

        aluno.setSituacaoMatricula(SituacaoDaMatricula.ATENDIMENTO_PEDAGOGICO);
    }

    public Long getCodPedagogo() {
        return codPedagogo;
    }

    public Long getCodAluno() {
        return codAluno;
    }
}
