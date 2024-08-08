import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //calcular a média do aluno
        System.out.println("Informe as notas do aluno");


        float nota1 = leitor.nextFloat();
        float nota2 = leitor.nextFloat();
        float nota3 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é " + media);
        leitor.close();
    }
}
