import Livro.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Tintim", "José");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
    }
}