
import java.util.Scanner;
public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul?");
        System.out.println("Responda TRUE para verdadeiro e FALSE para falso.");
        boolean cor = teclado.nextBoolean();

        teclado.close();

        if (cor) { 
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
