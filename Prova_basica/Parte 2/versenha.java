import java.util.Scanner;

public class versenha {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java17";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}