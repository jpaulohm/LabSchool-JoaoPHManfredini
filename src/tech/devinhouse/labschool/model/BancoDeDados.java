package tech.devinhouse.labschool.model;

import java.util.List;

public class BancoDeDados {
    List<Aluno> alunoList;
    List<Professor> professorList;
    List<Pedagogo> pedagogoList;


    public void inserirAluno(Aluno aluno){
        alunoList.add(aluno);
    }
    public void inserirProfessor(Professor professor){
        professorList.add(professor);
    }
    public void inserirPedagogo(Pedagogo pedagogo){
        pedagogoList.add(pedagogo);
    }
}
