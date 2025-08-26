import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) throws Exception {          
        Scanner sc = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Digite números (0 para sair):");
        while (true) {
            numero = sc.nextInt();
            if (numero == 0) break;
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
        sc.close();
    }
}