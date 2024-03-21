package Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String obterInformacoes () {
        return ano + ' ' + marca + + " " + modelo;
    }

    public void definirMarca (String novaMarca) {
        marca = novaMarca;
    }

    public boolean ehAntigo () {
        return ano < 2000;
    }

}
