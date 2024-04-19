package video_game;

public class Termo extends VideoGame {
    public double preco;
    public boolean multiplayer;

    public Termo(String nome, String console, String categoria, double preco, boolean multiplayer) {
        super(nome, console, categoria);
        this.preco = preco;
        this.multiplayer = multiplayer;
    }
}
