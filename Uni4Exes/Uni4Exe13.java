import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique suas cartas:");
        int c1 = teclado.nextInt();
        int c2 = teclado.nextInt();
        int c3 = teclado.nextInt();

        teclado.close();

        if (((c1 != 1) && (c1 != 2) && (c1 != 3) &&(c1 != 7) && (c1 != 11) && (c1 != 12) && (c1 != 13)) &&
            ((c2 != 1) && (c2 != 2) && (c2 != 3) &&(c2 != 7) && (c2 != 11) && (c2 != 12) && (c2 != 13)) &&
            ((c3 != 1) && (c3 != 2) && (c3 != 3) &&(c3 != 7) && (c3 != 11) && (c3 != 12) && (c3 != 13))) {
            System.out.println("As cartas não são válidas.");
        } else {
            if ((c1 == 1 || c1 == 2 || c1 == 3) &&
            (c2 == 1 || c2 == 2 || c2 == 3) &&
            (c3 == 1 || c3 == 2 || c3 == 3)) {
            System.out.println("NOVE");
        } else {
            if ((c1 == 1 || c1 == 2 || c1 == 3) &&
                (c2 == 1 || c2 == 2 || c2 == 3) ||
                (c1 == 1 || c1 == 2 || c1 == 3) &&
                (c3 == 1 || c3 == 2 || c3 == 3) ||
                (c2 == 1 || c2 == 2 || c2 == 3) &&
                (c3 == 1 || c3 == 2 || c3 == 3)) {
                    System.out.println("SEIS");
                } else {
                    if ((c1 == 1 || c1 == 2 || c1 == 3) ||
                        (c2 == 1 || c2 == 2 || c2 == 3) ||
                        (c3 == 1 || c3 == 2 || c3 == 3)){
                        System.out.println("TRUCO");
                    }
               }
             }
        }
    }
    
}
