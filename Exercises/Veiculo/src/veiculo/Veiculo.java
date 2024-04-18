package veiculo;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }

}
