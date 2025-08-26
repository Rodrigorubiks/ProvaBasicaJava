import java.util.Scanner;

public class aprovacao {
    public static void main(String[] args) throws Exception {
         Scanner tec = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = tec.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = tec.nextFloat();

        float media = nota1+nota2/2; 

        if(media>=7){
            System.out.format("A média é: %s", media);
            System.out.println("\nAprovado!");
        } else{
            System.out.format("A média é: %s", media);
            System.out.println("\nMédia menos de 7. Reprovado!");

        }
    }
}