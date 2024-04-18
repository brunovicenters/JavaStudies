package Pessoa;

import java.util.Date;

public class Aluno extends Pessoa {

    public Aluno(String nome, String cpf, Date data_nascimento) {
        super(nome, cpf, data_nascimento);
    }

    public String matricula;
}
