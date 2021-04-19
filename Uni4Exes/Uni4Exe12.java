import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique as medidas dos três lados do triângulo:");
        int l1 = teclado.nextInt();
        int l2 = teclado.nextInt();
        int l3 = teclado.nextInt();

        teclado.close();

        if((l1 + l2 == l3) &&
          (l1 + l3 == l2) &&
          (l2 + l3 == l1))  {
               System.out.println("É um triângulo ideal, não existe.");
           } else {
               if ((l1 == l2) && (l1 == l3)) {
                   System.out.println("É um triângulo equilátero.");
               } else {
               if((l1 == l2) ||
                 (l1 == l3) ||
                 (l2 == l3)) {
                    System.out.println("É um triângulo isóscele.");
                } else {
                    System.out.println("É um triângulo escaleno.");
                }
            }
        }
    }    
}
