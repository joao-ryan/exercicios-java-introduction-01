import java.util.Scanner;

public class EXERC04EX1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit usando a fórmula F = (9*C + 160)/5
        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);

        scanner.close();
    }
}
