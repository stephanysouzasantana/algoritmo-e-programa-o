import java.util.Scanner;

public class MaquinaDeDoces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o valor de crédito (R$): ");
        double credito = scanner.nextDouble();


        while (credito >= 1.50) {
            System.out.println("\n--- MENU DE PRODUTOS ---");
            System.out.println("1 - Chocolate (R$ 2.50)");
            System.out.println("2 - Bala (R$ 1.50)");
            System.out.println("3 - Chiclete (R$ 2.00)");
            System.out.println("4 - Refrigerante (R$ 4.00)");
            System.out.println("5 - Sair");

            System.out.print("Escolha um produto (1-5): ");
            int opcao = scanner.nextInt();
            double preco = 0;

            switch (opcao) {
                case 1:
                    preco = 2.50;
                    break;
                case 2:
                    preco = 1.50;
                    break;
                case 3:
                    preco = 2.00;
                    break;
                case 4:
                    preco = 4.00;
                    break;
                case 5:
                    System.out.println("Encerrando compras...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }


            if (opcao == 5) {
                break;
            }


            if (credito >= preco) {
                credito -= preco;
                System.out.printf("Produto comprado! Saldo restante: R$ %.2f%n", credito);
            } else {
                System.out.println("Crédito insuficiente para este produto.");
            }
        }

        System.out.printf("%nCompra encerrada. Saldo final: R$ %.2f%n", credito);
        System.out.println("Obrigado por usar a máquina de doces!");
        scanner.close();
    }
}
