import java.util.Scanner;

public class uniaovetores {
    public static void main(String[] args) {
    int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] uniao = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
            uniao[i] = vetor1[i];
        }

        System.out.println("Preencha o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
            uniao[i + 5] = vetor2[i];
        }

        System.out.println("União dos vetores:");
        for (int valor : uniao) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}