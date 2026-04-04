package Exercicio_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.print("Número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        IO.print("Titular: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;
        do {
            IO.println("\n--- MENU ---");
            IO.println("1 - Sacar");
            IO.println("2 - Depositar");
            IO.println("3 - Consultar saldo");
            IO.println("0 - Sair do programa");
            IO.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    IO.print("Valor para saque: ");
                    float saque = scanner.nextFloat();
                    conta.sacar(saque);
                    break;

                case 2:
                    IO.print("Valor para depósito: ");
                    float deposito = scanner.nextFloat();
                    conta.depositar(deposito);
                    break;

                case 3:
                    IO.println("Saldo atual: " + conta.consultarSaldo());
                    break;

                case 0:
                    IO.println("Encerrando...");
                    break;

                default:
                    IO.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

