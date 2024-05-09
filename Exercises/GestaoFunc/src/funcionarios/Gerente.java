package funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, String cargo) {
        super(nome, matricula, cargo);
    }

    public void marcarReuniao(int day, int hour, int min){
        System.out.println("Reunião marcada para o dia " + day + " às " + hour + ":" + min);
    }

    @Override
    public double calcularSalario(){
        return 1350.00 * 6.5;
    }
}
