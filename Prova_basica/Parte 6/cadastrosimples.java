import java.util.Scanner;

public class cadastrosimples {
    static final int MAX = 100;
    static String[] nomes = new String[MAX];
    static double[] notas = new double[MAX];
    static int totalAlunos = 0;

    public static void cadastrarAluno(Scanner scanner) {
        if (totalAlunos >= MAX) {
            System.out.println("Limite de alunos atingido.");
            return;
        }
        System.out.print("Nome do aluno: ");
        nomes[totalAlunos] = scanner.next();
        System.out.print("Nota do aluno: ");
        notas[totalAlunos] = scanner.nextDouble();
        totalAlunos++;
    }

    public static void listarAlunos() {
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println(nomes[i] + " - Nota: " + notas[i]);
        }
    }

    public static double mediaTurma() {
        if (totalAlunos == 0) return 0;
        double soma = 0;
        for (int i = 0; i < totalAlunos; i++) soma += notas[i];
        return soma / totalAlunos;
    }

    public static String alunoMaiorNota() {
        if (totalAlunos == 0) return "";
        int idx = 0;
        for (int i = 1; i < totalAlunos; i++) {
            if (notas[i] > notas[idx]) idx = i;
        }
        return nomes[idx];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n1-Cadastrar Aluno  2-Listar  3-Média Turma  4-Maior Nota  0-Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    System.out.println("Média da turma: " + mediaTurma());
                    break;
                case 4:
                    System.out.println("Aluno com maior nota: " + alunoMaiorNota());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}