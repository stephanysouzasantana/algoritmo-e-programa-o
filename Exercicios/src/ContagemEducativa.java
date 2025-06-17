import java.util.Scanner;

public class ContagemEducativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;


        System.out.print("Digite um número inteiro positivo: ");
        N = scanner.nextInt();


        while (N <= 0) {
            System.out.print("Valor inválido. Digite um número inteiro POSITIVO: ");
            N = scanner.nextInt();
        }


        int contador = 1;
        System.out.println("Contando de 1 até " + N + ":");

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= N);

        scanner.close();
    }
}