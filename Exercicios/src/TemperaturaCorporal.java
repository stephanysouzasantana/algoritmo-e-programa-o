import java.util.Scanner;

public class TemperaturaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura corporal do paciente
        System.out.print("Digite a temperatura corporal (em °C): ");
        double temperatura = scanner.nextDouble();

        // Diagnóstico com base na temperatura
        if (temperatura < 36.0) {
            System.out.println("Diagnóstico: Hipotermia");
        } else if (temperatura <= 37.4) {
            System.out.println("Diagnóstico: Temperatura normal");
        } else if (temperatura <= 38.5) {
            System.out.println("Diagnóstico: Febre leve");
        } else if (temperatura <= 39.9) {
            System.out.println("Diagnóstico: Febre moderada");
        } else if (temperatura == 40.0) {
            System.out.println("Diagnóstico: Febre alta");
        } else {
            System.out.println("Atenção: Temperatura muito alta! Procure atendimento médico imediatamente.");
        }

        scanner.close();
    }
}