import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a hora de chegada:");
        String temp = teclado.nextLine();

        LocalTime chegada = LocalTime.parse(temp);

        System.out.println("Insira a hora de saída:");
        temp = teclado.nextLine();
        LocalTime saida = LocalTime.parse(temp);

        teclado.close();
        long horas;

        if (saida.isAfter(chegada)) {
            horas = ChronoUnit.HOURS.between(chegada, saida);
            long minutos = ChronoUnit.MINUTES.between(chegada, saida) % 60;

            if (minutos >= 30) {
                horas++;
            }
        } else {
            long minutos = 24 * 60;
            long chegadaEmMinutos = chegada.getHour() * 60 + chegada.getMinute();
            long saidaEmMinutos = saida.getHour() * 60 + saida.getMinute();

            horas = ((minutos - chegadaEmMinutos) + saidaEmMinutos) / 60;
            minutos = ((minutos - chegadaEmMinutos) + saidaEmMinutos) - (horas * 60);

            if (minutos >= 30) {
                horas++;
            }
        }

        double valor = 0;

        while (horas >= 5) {
            valor += 10;
            horas--;
        }

        while (horas >= 3) {
            valor += 7.5;
            horas--;
        }

        while (horas > 0) {
            valor += 5;
            horas--;
        }

        System.out.println("O total será de R$ " + String.valueOf(valor));
    }
}
