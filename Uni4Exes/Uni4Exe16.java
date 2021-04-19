import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique as idades das mulheres:");
        int m1 = teclado.nextInt();
        int m2 = teclado.nextInt();
        System.out.println("Indique as idades dos homens:");
        int h1 = teclado.nextInt();
        int h2 = teclado.nextInt();

        teclado.close();


        if ((m1 > m2) && (h1 > h2)) {
            System.out.println("Soma: " + (m2 + h1));
            System.out.println("Produto: " + (m1 * h2));

        } else {
            if ((m2 > m1) && (h1 > h2)) {
                System.out.println("Soma: " + (m1 + h1));
                System.out.println("Produto: " + (m2 * h2));
            } else {
                if ((m1 > m2) && (h2 > h1)) {
                    System.out.println("Soma: " + (m2 + h2));
                    System.out.println("Produto: " + (m1 * h1));
                } else {
                    if ((m2 > m1) && (h2 > h1)) {
                        System.out.println("Soma: " + (m1 + h2));
                        System.out.println("Produto: " + (m2 * h1));
                     }
            }
        }
    }
}
}

