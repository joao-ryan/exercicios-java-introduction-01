import java.util.Scanner;

public class EXERC04EX2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int num2 = scanner.nextInt();

        int diferenca = Math.abs(num1 - num2);

        System.out.println("Diferença entre os valores: " + diferenca);

        scanner.close();
    }
}
