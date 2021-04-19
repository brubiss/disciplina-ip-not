
import java.util.Scanner;
public class Uni4Exe02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = teclado.nextInt();

        teclado.close();

        if (num % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
    
}
