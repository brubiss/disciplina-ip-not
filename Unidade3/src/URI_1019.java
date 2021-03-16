import java.util.Scanner;

public class URI_1019 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    int tempoDuracaoSegundos = teclado.nextInt();

    // Processo

    int horas = tempoDuracaoSegundos / 3600;
    int horasRestoSegundos = tempoDuracaoSegundos % 3600;
    int minutos = horasRestoSegundos / 60;
    int segundos = horasRestoSegundos % 60;

    // Saída
    System.out.println(horas + ":" + minutos + ":" + segundos);

    teclado.close();
  }
}
