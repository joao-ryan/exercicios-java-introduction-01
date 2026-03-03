import java.util.Scanner;

public class EXERC04EX1H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da lata: ");
        double R = scanner.nextDouble();

        System.out.print("Informe a altura da lata: ");
        double A = scanner.nextDouble();

        double V = Math.PI * R * R * A;

        System.out.printf("O volume da lata é: %.2f\n", V);

        scanner.close();
    }
}
