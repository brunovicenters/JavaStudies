import animal.Animal;
import animal.Mamifero;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leão", 5, "Mamífero");
        System.out.println("Nome: " + animal1.getNome() + ", Idade: " + animal1.getIdade() + ", Tipo: " + animal1.getTipo());

        Mamifero mamifero1 = new Mamifero("Elefante", 10, "Mamífero", "Savana");
        System.out.println("Nome: " + mamifero1.getNome() + ", Idade: " + mamifero1.getIdade() + ", Tipo: " + mamifero1.getTipo() + ", Habitat: " + mamifero1.getHabitat());
    }
}