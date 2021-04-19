import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique o dia do vencimento:");
        int dvenc = teclado.nextInt();
        System.out.println("Indique o dia do pagamento:");
        int dpag = teclado.nextInt();
        System.out.println("Indique o valor a ser pago:");
        double valor = teclado.nextDouble();

        teclado.close();

        double total = valor;
        int diasatraso = dpag - dvenc;

        if (dvenc > 10) {
            System.out.println("A data de vencimento não é válida.");

            return;
        }

        if (dvenc >= dpag) {
            total = (valor * 0.9);
            System.out.println("O total a ser pago é de R$ " + total);

            return;
        }

        if (diasatraso <= 5) {
            System.out.println("O total a ser pago é de R$ " + total);
        } else {
            total = (valor * (1 + 0.02 * diasatraso));
            System.out.println("O total a ser pago é de R$ " + String.format("%.2f",total));
        }
    }
}
