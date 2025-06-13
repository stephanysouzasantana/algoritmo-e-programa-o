import java.util.Scanner;

public class PraticaGuiada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 0;

        while (senha != 1234) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextInt();

            if (senha != 1234) {
                System.out.println("Senha incorreta.");
            }
        }

        System.out.println("Acesso permitido!");
        entrada.close();
    }
}