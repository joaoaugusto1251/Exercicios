import java.util.Scanner;

public class ExercícioMédia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
