import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique dois valores inteiros:");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        teclado.close();

        if ((n1 % n2 == 0) ||
            (n2 % n1 == 0)) {
               System.out.println("São múltiplos.");
           } else {
               System.out.println("Não são múltiplos.");
           }
    }
}
