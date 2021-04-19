import java.util.Scanner;
public class Uni4Exe25 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        System.out.println("Escolha uma opção:");
        System.out.println("1- soma de dois números");
        System.out.println("2- diferença entre dois números");
        System.out.println("3- produto de dois números");
        System.out.println("4- divisão entre dois números");
        int opc = teclado.nextInt();

        teclado.close();

        if ((opc <= 0) && (opc > 4)) {
            System.out.println("ERRO: opção inválida.");
        } else {
            switch (opc) {
                case 1:
                    System.out.println("Soma =  " + (n1 + n2));
                    break;
            
                case 2:
                if (n1 > n2) {
                    System.out.println("Diferença = " + (n1 - n2));
                } else {
                    if (n2 > n1) {
                        System.out.println("Diferença = " + (n2 - n1));
                    } else {
                        System.out.println("Diferença = 0");
                    }
                }
                    break;

                case 3:
                    System.out.println("Produto = " + (n1 * n2));
                    break;

                case 4:
                    if (n2 != 0) {
                         System.out.println("Divisão = " + (n1 / n2));

                    } else {
                        if (n1 != 0) {
                            System.out.println("Divisão = " + (n2 / n1));
                        } else {
                            System.out.println("A divisão não é possível.");
                        }                        
                    }
            }
        }

    }
}
