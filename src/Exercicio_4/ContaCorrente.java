package Exercicio_4;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else if (valor > 10000) {
            IO.println("Limite por saque é 10000!");
        } else if (valor > saldo) {
            IO.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            IO.println("Saque realizado!");
        }
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            IO.println("Valor inválido!");
        } else if (valor > 10000) {
            IO.println("Limite por depósito é 10000!");
        } else {
            saldo += valor;
            IO.println("Depósito realizado!");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
