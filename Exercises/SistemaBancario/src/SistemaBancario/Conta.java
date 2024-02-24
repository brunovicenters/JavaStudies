package SistemaBancario;

import java.util.Arrays;

public class Conta {
    String titular;
    String cpf;
    String modelo;
    float saldo;
    Arrays cartoes;

    public void depositar(float deposito){
        saldo += deposito;
    }

    public void sacar(float saque){
        saldo -= saque;
    }

    public String getCpf() {
        return cpf;
    }

    public void getModelo() {
        System.out.println("Sua conta é uma conta " + modelo);
    }

    public void getSaldo() {
        System.out.println("Seu saldo é: " + saldo);;
    }
}
