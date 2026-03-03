public class EXERC04EX3E {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;

        while (numero <= 50) {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        }

        System.out.println("Soma dos números pares de 1 a 50 = " + soma);

    }
}
