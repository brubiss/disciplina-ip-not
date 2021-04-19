import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe há quantos meses o funcionário foi admitido:");
        int tempo = teclado.nextInt();
        System.out.println("Informe o salário do funionário:");
        double sal = teclado.nextInt();

        teclado.close();

        if (tempo <= 12) {
            sal = sal + (sal * 0.05);
            System.out.println("De acordo com o reajuste, o sálario será de R$ " + sal);
        } else {
            if ((tempo >= 13) && (tempo <= 48)) {
            sal = sal + (sal * 0.07);
            System.out.println("De acordo com o reajuste, o salário será de R$ " + sal);
            }
        }
    }
    
}
