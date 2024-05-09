package funcionarios;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private String cargo;

    public Funcionario(String nome, String matricula, String cargo) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public double calcularSalario() {
        return 1350.00;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void marcarReuniao(int day, int hour, int min){
        System.out.println("Reunião marcada para o dia " + day + " às " + hour + ":" + min);
    }

    public void mensagemParaOChefe(String mensagem) {
        System.out.println("Mensagem: '" + mensagem + "' enviada.");
    }
}
