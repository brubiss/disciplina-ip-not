import java.util.Scanner;
public class Uni4Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o peso da carta:");
        int peso = teclado.nextInt();
        double peso2 = ((peso - 50) / 10);

        teclado.close();

        if (peso <= 50) {
            System.out.println("O selo será R$ 0,45.");
        } else {
            System.out.println("O selo será R$ " + (0.45 * (peso2 - 1 )));
        }
    }
}
