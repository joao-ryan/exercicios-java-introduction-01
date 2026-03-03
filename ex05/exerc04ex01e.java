import java.util.Scanner;

public class EXERC04EX1E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Kelvin: ");
        double kelvin = scanner.nextDouble();

        double celsius = kelvin - 273.15;

        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);

        scanner.close();
    }
}
