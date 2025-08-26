import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = tec.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = tec.nextDouble();

        if(num1>num2){
            System.out.format("Número maior: %s", num1);
        } else{
            System.out.format("Número maior: %s", num2);

        }
    }
}