import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno: ");
        float nota1 = tec.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        float nota2 = tec.nextFloat();

        System.out.println("Digite a terceira nota do aluno: ");
        float nota3 = tec.nextFloat();

        System.out.println("Digite a quarta nota do aluno: ");
        float nota4 = tec.nextFloat();

        float media = nota1+nota2+nota3+nota4/4; 

        System.out.format("A média é: %s", media);

    }
}