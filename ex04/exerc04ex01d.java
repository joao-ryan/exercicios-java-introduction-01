import java.util.Scanner;

public class EXERC04EX1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
