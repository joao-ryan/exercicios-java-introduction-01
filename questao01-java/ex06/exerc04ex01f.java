import java.util.Scanner;

public class EXERC04EX1F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
