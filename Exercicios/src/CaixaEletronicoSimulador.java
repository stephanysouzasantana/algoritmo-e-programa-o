import java.util.Scanner;

public class CaixaEletronicoSimulador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 4321;
        int senhaDigitada;
        double saldo = 1000.00;


        System.out.println("Bem-vindo ao Simulador de Caixa Eletrônico Educativo!");

        do {
            System.out.print("Por favor, digite sua senha: ");
            senhaDigitada = scanner.nextInt();
            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != senhaCorreta);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f%n", saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor inválido para saque.");
                    }
                    break;
                case 4:
                    System.out.println("Sessão encerrada. Obrigado por utilizar o simulador!");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha entre 1 e 4.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
