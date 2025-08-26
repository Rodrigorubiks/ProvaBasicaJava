import java.util.Scanner;

public class soma {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double a = tec.nextDouble();

        System.out.println("Digite outro número: ");
        double b = tec.nextDouble();

        System.out.println("A soma é: ");
        System.out.println(a+b);

    }
}
