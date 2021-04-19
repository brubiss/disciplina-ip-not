
import java.util.Scanner;
public class Uni4Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a idade de Marquinhos:");
        int marq = teclado.nextInt();
        System.out.println("Insira a idade de Zezinho:");
        int zezi = teclado.nextInt();
        System.out.println("Insira a idade de Luluzinha:");
        int lulu = teclado.nextInt();

        teclado.close();

     if (marq < zezi && marq < lulu) { 
       System.out.println("Marquinho é o caçula.");
     } else {
       if (zezi < marq && zezi < lulu) {
           System.out.println("Zezinho é o caçula.");
         } else {
             System.out.println("Luluzinha é a caçula.");
         }
 
 }
    }
}
