import video_game.*;

public class Main {
    public static void main(String[] args) {
        MarioKart mk = new MarioKart("Mario Kart: 9", "Nintendo Switch", "Corrida", 39.99, true);
        System.out.println(mk.nome);
        System.out.println(mk.console);
        System.out.println(mk.categoria);
        System.out.println(mk.preco);
        System.out.println("É multiplayer? "+mk.multiplayer);

        System.out.println();

        Xadrez x = new Xadrez("Xadrez", "Tabuleiro", "Estratégia", 11.89, true);
        System.out.println(x.nome);
        System.out.println(x.console);
        System.out.println(x.categoria);
        System.out.println(x.preco);
        System.out.println("É multiplayer? "+x.multiplayer);

        System.out.println();

        TheSims ts = new TheSims("The Sim: 5", "Computador", "Simulator", 139.99, false);
        System.out.println(ts.nome);
        System.out.println(ts.console);
        System.out.println(ts.categoria);
        System.out.println(ts.preco);
        System.out.println("É multiplayer? "+ts.multiplayer);

        System.out.println();

        LegoStarWars lsw = new LegoStarWars("Lego Star Wars", "PS4", "Aventura", 339.99, true);
        System.out.println(lsw.nome);
        System.out.println(lsw.console);
        System.out.println(lsw.categoria);
        System.out.println(lsw.preco);
        System.out.println("É multiplayer? "+lsw.multiplayer);

        System.out.println();

        Termo te = new Termo("Termo", "Navegador", "Puzzle", 00.00, false);
        System.out.println(te.nome);
        System.out.println(te.console);
        System.out.println(te.categoria);
        System.out.println(te.preco);
        System.out.println("É multiplayer? "+te.multiplayer);
    }
}