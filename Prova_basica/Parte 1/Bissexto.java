import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = tec.nextInt();      

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        tec.close();

    }
}
  