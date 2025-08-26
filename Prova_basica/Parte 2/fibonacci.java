import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você deseja exibir? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        scanner.close();
    }
}