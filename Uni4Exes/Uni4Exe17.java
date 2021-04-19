import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Renda anual:");
        double rano = teclado.nextDouble();
        System.out.println("Número de dependentes:");
        int ndep = teclado.nextInt();
        double rliq = rano - (rano * (0.02 * ndep));
        
        teclado.close();

        if (rliq <= 2000) {
            System.out.println("Não será pago imposto.");
        } else {
            if ((rliq > 2000) && (rliq <= 5000)) {
                double vtotal = rliq * 0.05;
                System.out.println("O total será de R$ " + vtotal);
            } else {
                if ((rliq > 5000) && (rliq <= 10000)) {
                    double vtotal = rliq * 0.10;
                    System.out.println("O total será de R$ " + vtotal);
                } else {
                    if (rliq > 10000) {
                        double vtotal = rliq * 0.10;
                    System.out.println("O total será de R$ " + vtotal);
                    }
                }
            }
        }
    }
}
