import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) throws Exception {
    Scanner tec = new Scanner(System.in);

    System.out.println("Digite um número para ver a sua tabuada: ");
    int num = tec.nextInt();

        while (true) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i*num);
            }
            break; 
        }
    }
}