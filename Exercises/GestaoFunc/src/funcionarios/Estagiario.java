package funcionarios;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    public void mensagemParaOChefe(String mensagem) {
        System.out.println("Mensagem: '" + mensagem + "' enviada.");
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 0.8;
    }
}
