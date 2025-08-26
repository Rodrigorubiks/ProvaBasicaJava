import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = tec.nextDouble();

        if(num%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");

        }
    }
}