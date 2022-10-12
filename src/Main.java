import tech.devinhouse.labschool.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Aluno joao = new Aluno("joao",5582677933L, LocalDate.of(1996,10,31),5548999452556L, SituacaoDaMatricula.ATIVO,9.81F);
        Professor tiago = new Professor("tiago", 71738290972L, LocalDate.now(),34333086L, FormacaoAcademica.GRADUACAO_COMPLETA, ExperienciaDesenvolvimento.BACK_END,EstadoAtividade.ATIVO);
        Pedagogo luca = new Pedagogo("Luca", 55228L, LocalDate.now(), 23513L);

        AtendimentoPedagogico deHoje = new AtendimentoPedagogico(luca,joao);


    }
}