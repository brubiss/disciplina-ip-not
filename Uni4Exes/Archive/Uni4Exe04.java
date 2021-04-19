import java.util.Scanner;
public class Uni4Exe04 {
    public static void main(String[] args) {
        
        java.util.Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        float num = teclado.nextFloat();

        teclado.close();

        if ((num % 1) == 0) {
            System.out.println("Não há casas decimais.");
        } else {
            System.out.println("Há casas decimais.");
        }
    }
}
