import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double[] notas = new double[5];

        System.out.println("Digite as notas dos 5 alunos:");
        for (int i = 0; i<notas.length; i++){
            System.out.println("Qual a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("A média das notas dos alunos é: " + media);

        scanner.close();
    }
}