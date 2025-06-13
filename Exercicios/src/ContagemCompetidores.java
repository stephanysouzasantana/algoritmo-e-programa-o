import java.util.Scanner;

public class ContagemCompetidores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Solicita um número maior que zero
        do {
            System.out.print("Digite um número inteiro maior que zero: ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (N <= 0);

        // Contagem de 1 até N usando while
        int contador = 1;
        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }

        scanner.close();
    }
}