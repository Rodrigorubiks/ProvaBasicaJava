import java.util.Scanner;

public class vogalconso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        String resultado;
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                resultado = "Vogal";
                break;
            default:
                if (Character.isLetter(letra)) {
                    resultado = "Consoante";
                } else {
                    resultado = "Não é uma letra";
                }
                break;
        }

        System.out.println(resultado);
        scanner.close();
    }
}