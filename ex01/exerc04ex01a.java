import java.util.Scanner;

public class EXERC04EX1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Informe a velocidade média (km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

       
        System.out.println("\n--- RESULTADOS DA VIAGEM ---");
        System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L\n", litrosUsados);

        scanner.close();
    }
}
