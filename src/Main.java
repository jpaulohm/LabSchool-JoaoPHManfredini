import tech.devinhouse.labschool.cli.Display;
import tech.devinhouse.labschool.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/**
        Aluno joao = new Aluno("joao",5582677933L, LocalDate.of(1996,10,31),5548999452556L, SituacaoDaMatricula.ATIVO,9.81F);
        Professor tiago = new Professor("tiago", 71738290972L, LocalDate.now(),34333086L, FormacaoAcademica.GRADUACAO_COMPLETA, ExperienciaDesenvolvimento.BACK_END,EstadoAtividade.ATIVO);
        Pedagogo luca = new Pedagogo("Luca", 55228L, LocalDate.now(), 23513L);

        System.out.println(joao.toString());
        AtendimentoPedagogico deHoje = new AtendimentoPedagogico(luca,joao);
        System.out.println(joao.toString());

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.inserirAluno(new Aluno("felix",5582677933L, LocalDate.of(1996,10,31),5548999452556L, SituacaoDaMatricula.ATIVO,9.81F));
        bancoDeDados.inserirAluno(new Aluno("jose",5582677933L, LocalDate.of(1996,10,31),5548999452556L, SituacaoDaMatricula.ATIVO,9.81F));
        bancoDeDados.inserirAluno(joao);

        //System.out.println(bancoDeDados.a);
        joao.setSituacaoMatricula(SituacaoDaMatricula.ATIVO);
 bancoDeDados.listarAlunos();

*/


        Display.exibirMenuInicial();
        Display.exibirMenuCadastros();


    }
}