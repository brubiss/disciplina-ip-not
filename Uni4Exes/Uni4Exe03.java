import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n1 = teclado.nextInt();
        System.out.println("Insira outro número:");
        int n2 = teclado.nextInt();

        teclado.close();
        if (n1 > n2) {
            System.out.println("O primeiro número é maior.");
        } else {
            if (n1 < n2) {
                System.out.println("O primeiro número é menor.");
            } else {
                System.out.println("Os números são iguais");
            }
        }
    }
}
