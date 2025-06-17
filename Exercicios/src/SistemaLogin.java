import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "java123";
        String senhaDigitada;
        int tentativas = 0;
        boolean acessoPermitido = false;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                acessoPermitido = true;
                System.out.println("Bem-vindo!");
            } else if (tentativas < 3) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!acessoPermitido && tentativas < 3);

        if (!acessoPermitido) {
            System.out.println("Acesso bloqueado.");
        }

        scanner.close();
    }
}
