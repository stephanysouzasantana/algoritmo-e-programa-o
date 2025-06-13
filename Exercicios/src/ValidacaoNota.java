import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida registrada: " + nota);
        scanner.close();
    }
}
