import java.util.Scanner;

public class cardapio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hambúrguer");
        System.out.println("2. Pizza");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        String item;
        switch (opcao) {
            case 1:
                item = "Você escolheu Hambúrguer.";
                break;
            case 2:
                item = "Você escolheu Pizza.";
                break;
            case 3:
                item = "Saindo do programa.";
                break;
            default:
                item = "Opção inválida.";
                break;
        }

        System.out.println(item);
        scanner.close();
    }
}
