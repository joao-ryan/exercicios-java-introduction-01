import java.util.Scanner;

public class EXERC04EX1I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a densidade da esfera: ");
        double D = scanner.nextDouble();

        System.out.print("Informe o raio da esfera: ");
        double R = scanner.nextDouble();

        double P = D * 4 * Math.PI * R * R * R / 3;

        System.out.printf("O peso da esfera é: %.2f\n", P);

        scanner.close();
    }
}
