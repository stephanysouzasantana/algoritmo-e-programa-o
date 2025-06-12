import java.util.Scanner;

      public class ClassificacaoIdade {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Digite a idade do paciente: ");
             int idade = scanner.nextInt();


             if (idade < 18) {
                 System.out.println("Classificação: Menor de idade");
             } else if (idade <= 59) {
                 System.out.println("Classificação: Adulto");
             } else {
                 System.out.println("Classificação: Idoso");
             }

             scanner.close();
         }
     }
