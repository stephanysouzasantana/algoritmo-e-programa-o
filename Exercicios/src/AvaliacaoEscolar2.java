import java.util.Scanner;

public class AvaliacaoEscolar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        // Solicita a nota enquanto ela for inválida
        System.out.print("Digite a nota do aluno (0 a 100): ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota Inválida. Digite um valor entre 0 e 100.");
            System.out.print("Digite novamente a nota do aluno: ");
            nota = scanner.nextInt();
        }

        // Avalia o conceito da nota
        char conceito;

        if (nota >= 90) {
            conceito = 'A';
        } else if (nota >= 80) {
            conceito = 'B';
        } else if (nota >= 70) {
            conceito = 'C';
        } else if (nota >= 60) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }

        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}