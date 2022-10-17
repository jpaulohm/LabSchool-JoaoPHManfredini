package tech.devinhouse.labschool.model;

import tech.devinhouse.labschool.cli.Display;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BancoDeDados {
    List<Aluno> alunoList;
    List<Professor> professorList;
    List<Pedagogo> pedagogoList;
    List<AtendimentoPedagogico> atendimentosPedagogicos;

    public BancoDeDados() {
        this.alunoList = new ArrayList<Aluno>();
        this.professorList = new ArrayList<Professor>();
        this.pedagogoList = new ArrayList<Pedagogo>();
        this.atendimentosPedagogicos = new ArrayList<AtendimentoPedagogico>();
    }

    public void imprimeListaAlunosPorAtendimento() {
        ordenaAlunosPorAtendimento();
        for (int i = 0; i < alunoList.size(); i++) {
            System.out.println(alunoList.get(i).getNome() + " teve " + alunoList.get(i).getTotalAtendPedag() + "atendimentos");
        }
    }
    public void imprimeListaPedagogosPorAtendimento() {
        ordenaPedagogosPorAtendimento();
        for (int i = 0; i < pedagogoList.size(); i++) {
            System.out.println(pedagogoList.get(i).getNome() + " teve " + pedagogoList.get(i).getTotalAtendPedag() + "atendimentos");
        }
    }

    public void inserirAluno(){

        alunoList.add(new Aluno(Display.obterNome(),Display.obterCpf(),Display.obterDataNascimento(),Display.obterTelefone(),SituacaoDaMatricula.ATIVO,Display.obterNotaProcessoSeletivo()));
    }
    public void inserirProfessor(){
        professorList.add(new Professor(Display.obterNome(),Display.obterCpf(),Display.obterDataNascimento(),Display.obterTelefone(),Display.obterFormacao(),Display.obterExperienciaDesenvolvimento(),EstadoAtividade.ATIVO));
    }
    public void inserirPedagogo(){
        pedagogoList.add(new Pedagogo(Display.obterNome(),Display.obterCpf(),Display.obterDataNascimento(),Display.obterTelefone()));
    }

    public void listarAlunos(){
        System.out.println("Alunos");
        for (int i = 0; i < alunoList.size(); i++) {
            System.out.println(alunoList.get(i).toString());
        }
    }
    public void listarProfessores(){
        System.out.println("Professores");
        for (int i = 0; i < professorList.size(); i++) {
            System.out.println(professorList.get(i).toString());
        }
    }
    public void listarPedagogos(){
        System.out.println("Pedagogos");
        for (int i = 0; i < pedagogoList.size(); i++) {
            System.out.println(pedagogoList.get(i).toString());
        }
    }
    public void relatorioAlunos(SituacaoDaMatricula situacao){
        System.out.println("Alunos em estado " + situacao.toString());
        for (int i = 0;i<alunoList.size();i++){
            if (alunoList.get(i).getSituacaoMatricula() == situacao) {
                System.out.println("Nome : " + alunoList.get(i).getNome());
                System.out.println("Nota do processo seletivo: " + alunoList.get(i).getNotaProcessoSeletivo());
                System.out.println("Numero de atendimentos pedagogicos : " + alunoList.get(i).getTotalAtendPedag());
            }
        }
    }
    public void relatorioAlunos(){
        System.out.println("Todos os alunos");
        for (int i = 0;i<alunoList.size();i++){
            System.out.println("Nome : " + alunoList.get(i).getNome());
            System.out.println("Nota do processo seletivo: " + alunoList.get(i).getNotaProcessoSeletivo());
            System.out.println("Numero de atendimentos pedagogicos : " + alunoList.get(i).getTotalAtendPedag());
        }
    }
    public Aluno encontraAluno(Long cod){
        for (int i = 0; i < alunoList.size(); i++) {
            if (alunoList.get(i).getCodigo()==cod){
                return alunoList.get(i);
            }
        }
        return null;
    }
    public Pedagogo encontraPedagogo(Long cod){
        for (int i = 0; i < alunoList.size(); i++) {
            if (pedagogoList.get(i).getCodigo()==cod){
                return pedagogoList.get(i);
            }
        }
        return null;
    }
    public void novoAtendimentoPedagogico(Long codAluno, Long codProfessor){
        Long cpfs[] = Display.cpfsDoAtendimento();
        atendimentosPedagogicos.add(new AtendimentoPedagogico(encontraPedagogo(cpfs[0]),encontraAluno(cpfs[1])));
    }


    public void ordenaAlunosPorAtendimento(){
        alunoList = alunoList.stream().sorted(Comparator.comparing(Aluno::getTotalAtendPedag).reversed() ).collect(Collectors.toList());
    }
    public void ordenaPedagogosPorAtendimento(){
        pedagogoList = pedagogoList.stream().sorted(Comparator.comparing(Pedagogo::getTotalAtendPedag).reversed() ).collect(Collectors.toList());
    }

    public void alterarEstadoMatriculaAluno() {
        Long cod = Display.qualAluno();
        SituacaoDaMatricula sit = Display.qualSituacaoDeMatricula();
        encontraAluno(cod).setSituacaoMatricula(sit);
        return;
    }
}
