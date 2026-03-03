import java.util.Scanner;

public class EXERC04EX1G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Kelvin: ");
        double kelvin = scanner.nextDouble();

        double fahrenheit = (9 * (kelvin - 273.15) + 160) / 5;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);

        scanner.close();
    }
}
