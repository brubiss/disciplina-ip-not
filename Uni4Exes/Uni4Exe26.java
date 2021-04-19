import java.util.Scanner;
public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual dos seguintes comandos deseja realizar?");
        System.out.println("Opção T : área de um triângulo");
        System.out.println("Opção Q : área de um quadrado");
        System.out.println("Opção R : área de um retângulo");
        System.out.println("Opção C : área de um círculo:");

        char opc = teclado.next().charAt(0); 
        
            
            switch (opc) {
            case 'T':
                System.out.println("Informe os valores da base e altura:");
                int b = teclado.nextInt();
                int h = teclado.nextInt();
                System.out.println("Área do triângulo: " + ((b * h) / 2) + " unidades de medida ²");
                break;
        
            case 'Q':
            System.out.println("Informe o valor da lateral:");
                int lat = teclado.nextInt();
                System.out.println("Área do quadrado: " + (lat * lat) + " unidades de medida ²");
                break;

            case 'R':
            System.out.println("Informe os valores da base e altura:");
                int base = teclado.nextInt();
                int height = teclado.nextInt();
                System.out.println("Área do retângulo: " + (base * height) + " unidades de medida ²");
                break;

            case 'C':
            System.out.println("Informe o valor do raio:");
                double raio = teclado.nextDouble();
                System.out.println("Área do círculo: " + ((raio * raio) * 3.14) + " unidades de medida ²");
                break;
        } 

            teclado.close();
        }
}