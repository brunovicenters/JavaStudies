package video_game;

public class LegoStarWars extends VideoGame {
    public double preco;
    public boolean multiplayer;

    public LegoStarWars(String nome, String console, String categoria, double preco, boolean multiplayer) {
        super(nome, console, categoria);
        this.preco = preco;
        this.multiplayer = multiplayer;
    }
}
