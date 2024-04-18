package Pessoa;

import java.util.Date;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String cpf, Date data_nascimento) {
        super(nome, cpf, data_nascimento);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}
