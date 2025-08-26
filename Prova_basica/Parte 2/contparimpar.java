import java.util.Scanner;

public class contparimpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite 10 números inteiros (digite 0 para sair):");

        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPar);
        System.out.println("Quantidade de números ímpares: " + contImpar);

        scanner.close();
    }
}