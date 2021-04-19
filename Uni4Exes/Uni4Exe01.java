import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas no mês:");
        int htrab = teclado.nextInt();
        System.out.println("Digite o vaalor do salário:");
        double sal = teclado.nextDouble();

        teclado.close();

        if (sal <= 160) {
            System.out.println("O salário será de R$ " + sal);
        } else {
            htrab = htrab - 160;
            sal = ((sal / 160) * 1.5) * htrab + sal;
            System.out.println("O salário será de R$ " + sal);
        }
    }
    
}
