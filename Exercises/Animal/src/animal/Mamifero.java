package animal;

public class Mamifero extends Animal {

    private String habitat;

    public Mamifero(String nome, int idade, String tipo, String habitat) {
        super(nome, idade, tipo);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
}
