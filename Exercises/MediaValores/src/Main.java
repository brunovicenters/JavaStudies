import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double[] valores = new double[5];

        System.out.println("Digite o valor dos 5 veículos:");
        for (int i = 0; i<valores.length; i++){
            System.out.println("Qual o valor do veículo " + (i + 1) + ":");
            valores[i] = scanner.nextDouble();
        }

        double soma = 0;
        for(double valor : valores){
            soma += valor;
        }

        double media = soma / valores.length;

        System.out.println("A média dos valores dos veículos é: " + media);

        scanner.close();
    }
}