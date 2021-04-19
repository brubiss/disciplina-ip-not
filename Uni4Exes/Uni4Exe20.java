import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as notas das três provas:");
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();

        System.out.println("Digite a nota dos exercícios:");
        double nex = teclado.nextDouble();

        teclado .close();

        double media = (n1 + n2 + n3 + nex) % 7;

        if (media >= 9.0) {
            System.out.println("A");
            System.out.println("Aprovado");
        } else {
            if ((media >= 7.5) && (media < 9.0)) {
                System.out.println("B");
                System.out.println("Aprovado");
            } else {
                if ((media >= 6.0) && (media < 7.5)) {
                    System.out.println("C");
                    System.out.println("Aprovado");
                } else {
                    if ((media >= 4.0) && (media < 6.0)) {
                        System.out.println("D");
                        System.out.println("Reprovado");
                    } else {
                        if (media < 4.0) {
                            System.out.println("E");
                            System.out.println("Reprovado");
                        }
                    }
                }
            }
        }
        
    }
}
