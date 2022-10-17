package tech.devinhouse.labschool.model;

import tech.devinhouse.labschool.cli.Display;

public class Menu {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        Long[] aux;
        Integer operacao = 0;
        Integer operacao2 = 0;
        Integer operacao3 = 0;
        while (operacao !=4){
            Display.exibirMenuInicial();
            operacao = Display.obterOperacao(4);
            switch (operacao){
                case 1 :
                    Display.exibirMenuCadastros();
                    operacao2 = Display.obterOperacao(4);
                    switch (operacao2){
                        case 1:
                            bancoDeDados.inserirAluno();
                            break;
                        case 2:
                            bancoDeDados.inserirProfessor();
                            break;
                        case 3:
                            bancoDeDados.inserirPedagogo();
                            break;
                        case 4:
                            bancoDeDados.alterarEstadoMatriculaAluno();
                            break;
                    }
                    break;
                case 2 :
                    Display.exibirMenuRelatorios();
                    operacao2 = Display.obterOperacao(3);
                    switch (operacao2){
                        case 1:
                            bancoDeDados.relatorioAlunos(SituacaoDaMatricula.ATIVO);
                            break;
                    }
                    break;
                case 3 :
                    Display.exibirMenuAtendimentosPedagogicos();
                    operacao2 = Display.obterOperacao(4);
                    switch (operacao2){
                        case 1:
                            System.out.println("Novo atendimento pedagogico");
                            aux=Display.cpfsDoAtendimento();
                            bancoDeDados.novoAtendimentoPedagogico(aux[0],aux[1]);
                            break;
                        case 2:

                            bancoDeDados.imprimeListaAlunosPorAtendimento();
                        case 3:

                            bancoDeDados.imprimeListaPedagogosPorAtendimento();


                    }
                    break;

                case 4 :
                    System.out.println("Encerrando programa");
                    return;
            }



    }
    }

}
