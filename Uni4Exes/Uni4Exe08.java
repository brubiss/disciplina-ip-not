import java.util.Scanner;

public class Uni4Exe08 {
          public static void main(String[] args) {
               Scanner teclado = new Scanner(System.in);
         
         System.out.println("Insira a letra: ");
         char let = teclado.next().charAt(0);
         let = Character.toUpperCase(let);
    
         teclado.close();

         if ((let == 'a') || 
             (let == 'e') || 
             (let == 'i') || 
             (let == 'o') || 
             (let == 'u')) {
           System.out.println("Vogal");
         } else {
           System.out.println("NÃO é vogal.");
         }
    
         
       }
     }
