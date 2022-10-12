package tech.devinhouse.labschool.model;

public class AtendimentoPedagogico {
    String nomeProfessor;
    Long codProfessor;
    String nomeAluno;
    Long codAluno;

    public AtendimentoPedagogico(Pedagogo pedagogo, Aluno aluno){
        this.nomeProfessor = pedagogo.getNome();
        this.codProfessor = pedagogo.getCodigo();

        this.nomeAluno = aluno.getNome();
        this.codAluno = aluno.getCodigo();

        aluno.acrescerAtendPedag();
        pedagogo.acrescerAtendPedag();

        aluno.setSituacaoMatricula(SituacaoDaMatricula.ATENDIMENTO_PEDAGOGICO);
    }
}
