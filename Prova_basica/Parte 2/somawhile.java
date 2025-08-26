import java.util.Scanner;

public class somawhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números para somar (digite 0 para finalizar):");
        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}