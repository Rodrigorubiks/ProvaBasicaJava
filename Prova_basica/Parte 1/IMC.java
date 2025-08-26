import java.util.Scanner;

public class imc {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        float peso = tec.nextFloat();

        System.out.println("Digite a sua altura: ");
        float altura = tec.nextFloat();

        float alturafinal = altura*altura;

        float imc = peso/alturafinal;

        System.out.format("IMC igual a: %s", imc);

    }
}