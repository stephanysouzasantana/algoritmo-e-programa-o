import java.util.Scanner;

public class TotemDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n == Totem Digital");
            System.out.println("1. Dizer Olá");
            System.out.println("2. Mostrar data de devolução Fictícia");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Olá! Seja Bem Vindo ao Totem Digital");
                    break;
                case 2:
                    System.out.println("Data Fictícia de Devolução 17/06/2025");
                    break;
                case 3:
                    System.out.println("Encerrando o Sistema");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente");
            }
        } while (opcao !=3);
        scanner.close();
    }
}