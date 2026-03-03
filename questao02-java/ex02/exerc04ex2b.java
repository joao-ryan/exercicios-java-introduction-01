import java.util.Scanner;

public class EXERC04EX2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int valor = scanner.nextInt();

        int positivo = Math.abs(valor);

        System.out.println("Valor positivo: " + positivo);

        scanner.close();
    }
}
