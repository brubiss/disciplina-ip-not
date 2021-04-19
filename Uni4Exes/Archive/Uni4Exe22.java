import java.util.Scanner;
public class Uni4Exe22 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha seu curso:");
        System.out.println("1- Ciência da Computação");
        System.out.println("2- Licenciatura da Computação");
        System.out.println("3- Sistemas de Informação");
        int curso = teclado.nextInt();

        teclado.close();

        switch (curso) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
        
            case 2:
            System.out.println("Licenciado em Computação");
                break;
            case 3:
            System.out.println("Bacharel em Sistemas de Informação");
        }

    }
}
