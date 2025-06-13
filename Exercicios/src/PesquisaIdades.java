import java.util.Scanner;

public class PesquisaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1; // valor inicial diferente de 0
        int contador = 0;

        while (idade != 0) {
            System.out.print("Digite a idade do aluno (0 para encerrar): ");
            idade = scanner.nextInt();

            if (idade != 0) {
                contador++;
            }
        }

        System.out.println("Total de alunos entrevistados: " + contador);
        scanner.close();
    }
}