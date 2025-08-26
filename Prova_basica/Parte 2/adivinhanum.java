public class adivinhanum {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int tentativa = 0;
        boolean acertou = false;

        System.out.println("Adivinhe o número entre 1 e 100!");

        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroAleatorio) {
                System.out.println("Maior!");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Menor!");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}