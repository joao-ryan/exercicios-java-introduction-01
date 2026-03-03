import java.util.Scanner;

public class EXERC04EX3F {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int fatorial = 1;

        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println(numero + "! = " + fatorial);

        scanner.close();
    }
}
