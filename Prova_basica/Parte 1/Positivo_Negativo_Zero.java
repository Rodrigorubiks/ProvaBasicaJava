import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = tec.nextInt();

        if(numero>0){
            System.out.println("Número positivo. ");
        } else if(numero<0){
            System.out.println("Número negativo. ");
        } else{
            System.out.println("Número igual a zero.");

        }
    }
}