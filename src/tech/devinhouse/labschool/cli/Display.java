package tech.devinhouse.labschool.cli;

import tech.devinhouse.labschool.model.ExperienciaDesenvolvimento;
import tech.devinhouse.labschool.model.FormacaoAcademica;
import tech.devinhouse.labschool.model.SituacaoDaMatricula;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Scanner;

public class Display {
    static public void exibirMenuInicial() {
        System.out.println();
        System.out.println("== MENU ==");
        System.out.println("1 - Cadastros");
        System.out.println("2 - Relatórios");
        System.out.println("3 - Atendimento Pedagogico");
        System.out.println("4 - Sair");
        System.out.println();
    }
    static public void exibirMenuCadastros() {
        System.out.println();
        System.out.println("== Cadastro ==");
        System.out.println("1 - Novo Aluno");
        System.out.println("2 - Novo Professor");
        System.out.println("3 - Novo Pedagogo");
        System.out.println("4 - Voltar");
        System.out.println();
    }

    static public void exibirMenuRelatorios() {
        System.out.println();
        System.out.println("== Relatórios ==");
        System.out.println("1 - Relatório Alunos");
        System.out.println("2 - Relatório dos Professores");
        System.out.println("3 - Voltar");
        System.out.println();
    }


    static public void exibirMenuRelatoriosProfessores() {
        System.out.println();
        System.out.println("Quais Professores imprimir o relatório?");
        System.out.println("1 - Ativos");
        System.out.println("2 - Irregulares");
        System.out.println("3 - Em atendimento pedagógico");
        System.out.println("4 - Inativos");
        System.out.println("5 - Todos");
        System.out.println("6 - Voltar");
        System.out.println();
    }
    static public void exibirMenuRelatoriosAlunos() {
        System.out.println();
        System.out.println("Quais alunos imprimir o relatório?");
        System.out.println("1 - Relatório Alunos");
        System.out.println("2 - Relatório dos Professores");
        System.out.println("3 - Voltar");
        System.out.println();
    }
    static public void exibirMenuAtendimentosPedagogicos() {
        System.out.println();
        System.out.println("Atendimento Pedagogico");
        System.out.println("1 - Novo");
        System.out.println("2 - Relatório de Alunos com mais atendimentos pedagógicos");
        System.out.println("3 - Relatório de Pedagogos com mais atendimentos pedagógicos");
        System.out.println("4 - Voltar");
        System.out.println();
    }

    static public Integer obterOperacao(Integer valorMaximo){
        System.out.printf("Digite a opção desejada:");
        Scanner scanner = new Scanner(System.in);
        int codigoOpcao = scanner.nextInt();

        while (valorMaximo<codigoOpcao || codigoOpcao<=0){
            System.out.println("Valor deve ser entre 0 e " + codigoOpcao);
            System.out.printf("Digite a opção desejada:");
            codigoOpcao = scanner.nextInt();
        }
        return codigoOpcao;
    }

    static public String obterNome(){
        System.out.printf("Nome: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Long obterCpf() {
        System.out.printf("CPF: ");
        Scanner scanner = new Scanner(System.in);
        return Long.parseLong(scanner.nextLine());
    }

    public static LocalDate obterDataNascimento() {
        Integer dia = 0, mes = 0, ano = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Dia de Nascimento: ");
        dia = scanner.nextInt();
        System.out.printf("Mes de Nascimento(numero): ");
        mes = scanner.nextInt();
        System.out.printf("Ano de Nascimento: ");
        ano = scanner.nextInt();

        return LocalDate.of(ano,mes,dia);
    }

    public static Long obterTelefone() {
        System.out.printf("Telefone: ");
        Scanner scanner = new Scanner(System.in);
        return Long.parseLong(scanner.nextLine());
    }

    public static Float obterNotaProcessoSeletivo() {
        System.out.printf("Nota do prcesso seletivo: ");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }

    public static Long[] cpfsDoAtendimento(){
        Long cpfAluno;
        Long cpfProfessor;
        Long[] cpfs = new Long[0];
        Scanner scanner = new Scanner(System.in);

        System.out.printf("CPF do aluno a realizar atendimento pedagogico: ");
        cpfAluno=Long.parseLong(scanner.nextLine());

        System.out.printf("CPF do professor a realizar atendimento pedagogico: ");
        cpfProfessor=Long.parseLong(scanner.nextLine());

        cpfs[0]=cpfAluno;
        cpfs[1]=cpfProfessor;

        return cpfs;
    }

    public static FormacaoAcademica obterFormacao() {
        System.out.println("Qual a formacao acabemica?\n" +
                                "1 - GRADUACAO_INCOMPLETA\n" +
                                "2 - GRADUACAO_COMPLETA\n" +
                                "3 - MESTRADO\n" +
                                "4 - DOUTORADO");
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        switch (i){
            case 1:
                return FormacaoAcademica.GRADUACAO_INCOMPLETA;
            case 2:
                return FormacaoAcademica.GRADUACAO_COMPLETA;
            case 3:
                return FormacaoAcademica.MESTRADO;
            case 4:
                return FormacaoAcademica.DOUTORADO;
        }
        return null;

    }

    public static ExperienciaDesenvolvimento obterExperienciaDesenvolvimento() {
        System.out.println("Qual a formacao acabemica?\n" +
                                "1 - FRONT_END\n" +
                                "2 - BACK_END\n" +
                                "3- FULL_STACK");
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        switch (i){
            case 1:
                return ExperienciaDesenvolvimento.FRONT_END;
            case 2:
                return ExperienciaDesenvolvimento.BACK_END;
            case 3:
                return ExperienciaDesenvolvimento.FULL_STACK;
        }
        return null;
    }

    public static Long qualAluno() {
        System.out.println("Digite o codigo do aluno:");
        Scanner scanner = new Scanner(System.in);
        return Long.parseLong(scanner.nextLine());

    }

    public static SituacaoDaMatricula qualSituacaoDeMatricula() {
        System.out.println("1 - ATIVO\n" +
                            "2 - IRREGULAR\n" +
                            "3 - ATENDIMENTO_PEDAGOGICO\n" +
                            "4 - INATIVO");
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        switch (i){
            case 1:
                return SituacaoDaMatricula.ATIVO;
            case 2:
                return SituacaoDaMatricula.IRREGULAR;
            case 3:
                return SituacaoDaMatricula.ATENDIMENTO_PEDAGOGICO;
            case 4:
                return SituacaoDaMatricula.INATIVO;
        }
        return null;
    }
}
