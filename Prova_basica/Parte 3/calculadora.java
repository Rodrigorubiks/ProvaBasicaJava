import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        double resultado;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    resultado = Double.NaN;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                resultado = Double.NaN;
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}