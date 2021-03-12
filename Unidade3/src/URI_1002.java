import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double pi = 3.14159;
    double raio = teclado.nextDouble();
    
    // Processo
    double area = pi * (raio * raio); // cálculo da área

    // Saída
    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}
