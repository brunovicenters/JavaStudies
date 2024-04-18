package veiculo;

public class Moto extends Veiculo {
    public int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void exibirInfo(){
        System.out.println("Minha moto -> ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cilindradas: "+cilindradas);
    }
}
