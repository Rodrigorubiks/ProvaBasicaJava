import java.util.Scanner;

public class login {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        scanner.close();
    }
}