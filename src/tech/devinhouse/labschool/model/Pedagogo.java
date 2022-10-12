package tech.devinhouse.labschool.model;

import java.time.LocalDate;

public class Pedagogo extends Pessoa{
    Integer totalAtendPedag;

    public Integer acrescerAtendPedag(){
        totalAtendPedag++;
        return totalAtendPedag;
    }

    public Pedagogo(String nome, Long cpf, LocalDate dataDeNascimento, Long telefone) {
        this.nome = nome;
        this.cpf = cpf;
        //this.codigo = codigo;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;

        this.totalAtendPedag = 0;
    }

    public Integer getTotalAtendPedag() {
        return totalAtendPedag;
    }

    public void setTotalAtendPedag(Integer totalAtendPedag) {
        this.totalAtendPedag = totalAtendPedag;
    }
}
