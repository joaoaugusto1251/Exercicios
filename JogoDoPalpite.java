import java.util.Scanner;
import java.util.Random;

public class JogoDoPalpite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();
        int comp = num.nextInt(9);
        int palp = 0;
        int tent = 0;
        
        while (palp != comp){
            if (palp == 0) {
                System.out.print("Digite um número de 1 a 9: ");
                palp = input.nextInt();
            } else if (palp < comp) {
                System.out.print("Digite um valor maior: ");
                palp = input.nextInt();
            } else if (palp > comp) {
                System.out.print("Digite um valor menor: ");
                palp = input.nextInt();
            }
            
            tent++;
        }
        
        System.out.println("Parabéns, você adivinhou em " + tent + " tentativa(s)!");
    }
}
