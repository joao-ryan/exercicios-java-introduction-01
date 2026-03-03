import java.util.Scanner;

public class EXERC04EX2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 4;

        System.out.printf("Média do aluno: %.2f\n", media);
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();
    }
}
