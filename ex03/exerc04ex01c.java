import java.util.Scanner;

public class EXERC04EX1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Fahrenheit
        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Conversão para Celsius usando a fórmula C = ((F - 32) * 5)/9
        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);

        scanner.close();
    }
}
