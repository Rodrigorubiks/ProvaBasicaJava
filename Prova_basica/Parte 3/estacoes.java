import java.util.Scanner;

public class estacoes {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();

        String estacao;
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "Mês inválido!";
                break;
        }

        System.out.println("Estação: " + estacao);
        scanner.close();
    }
}