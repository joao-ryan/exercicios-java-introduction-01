import java.util.Scanner;

public class EXERC04EX1J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Informe o valor de B: ");
        int B = scanner.nextInt();

        // Troca de valores
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores após a troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
