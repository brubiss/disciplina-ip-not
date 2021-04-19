import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o sexo apenas com a primeira letra:");
        char sexo = teclado.next().charAt(0);

        teclado.close();

        if (sexo == 'f') {
            System.out.println("Feminino");
        } else {
            if (sexo == 'm') {
                System.out.println("Masculino");
            } else {
                System.out.println("Não informado / Não identificado");
            }
        }
    }    
}
