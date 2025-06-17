import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int contador = 0;

        System.out.println("Digite as notas dos alunos (entre 0 e 10).");
        System.out.println("Para encerrar, digite um valor negativo.");

        do {
            System.out.print("Digite uma nota: ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            } else if (nota >= 0) {
                System.out.println("Nota inválida! Digite apenas valores entre 0 e 10.");
            }

        } while (nota >= 0);

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
