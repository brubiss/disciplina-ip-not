import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique um dia:");
        int dia = teclado.nextInt();
        System.out.println("Indique um mês:");
        int mes = teclado.nextInt();
        System.out.println("Indique um ano:");
        int ano = teclado.nextInt();

        teclado.close();

        if ((dia >= 1) && (dia <= 31) && (mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (ano > 0)) {
            System.out.println("A data é válida.");
        } else {
            if ((dia >= 1) && (dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11) && (ano > 0)) {
                System.out.println("A data é válida.");
            } else {
                if ((dia >= 1) && (dia <= 29) && (mes == 2) && (ano % 4 == 0)) {
                    System.out.println("A data é válida.");
                } else {
                    if ((dia >= 1) && (dia <= 28) && (mes == 2) && (ano % 4 != 0)) {
                        System.out.println("A data é válida.");
                    } else {
                        System.out.println("A data é inválida.");
                    }
                }
            }
        }
    }
}
