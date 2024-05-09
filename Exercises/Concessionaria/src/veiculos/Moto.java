package veiculos;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, double preco, boolean partidaEletrica) {
        super(marca, modelo, ano, preco);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "partidaEletrica=" + partidaEletrica +
                '}';
    }
}
