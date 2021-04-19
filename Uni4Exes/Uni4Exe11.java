import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o ano de nascimento de cada filho:");
    int f1 = teclado.nextInt();
    int f2 = teclado.nextInt();
    int f3 = teclado.nextInt();

    teclado.close();

    if ((f1 == f2) && (f1== f3)) {
           System.out.println("São trigêmios.");
    } else {
        if ((f1 == f2) ||
           (f1 == f3) ||
           (f2 == f3)) {
               System.out.println("Há gêmeos.");
        } else {
            System.out.println("São apenas irmãos.");
        }
    }

    }
}
