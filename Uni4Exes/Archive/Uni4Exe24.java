import java.util.Scanner;
public class Uni4Exe24 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira 3 valores inteiros:");
        int v1 = teclado.nextInt();
        int v2 = teclado.nextInt();
        int v3 = teclado.nextInt();
        System.out.println("Escolha a forma de organização:");
        System.out.println("1- ordem crescente");
        System.out.println("2- ordem decrescente");
        System.out.println("3- maior valor no meio");
        int opc = teclado.nextInt();

        int vmenor, vmedio, vmaior;
        teclado.close();

        if ((v1 < v2) && (v1 < v3)) {
            vmenor = v1;
            if (v2 < v3) {
                vmedio = v2;
                vmaior = v3;
            } else {
                vmedio = v3;
                vmaior = v2;
            }
        } else {
            if (v2 < v3) {
                vmenor = v2;

                if (v1 < v3) {
                    vmedio = v1;
                    vmaior = v3;
                } else {
                    vmedio = v3;
                    vmaior = v1;
                }
            } else {
                vmenor = v3;
                if (v1 < v2) {
                    vmedio = v1;
                    vmaior = v2;
                } else {
                    vmedio = v2;
                    vmaior = v1;
                }
            }
        }

        switch (opc) {
            case 1:
            System.out.println("Ordem crescente: " + vmenor +  "," + vmedio + "," + vmaior);
            break;
        
            case 2:
            System.out.println("Ordem decrescente: " + vmaior +  "," + vmedio + "," + vmenor);

                break;

            case 3:
            System.out.println("Maior valor no meio: " + vmenor +  "," + vmaior + "," + vmedio);

                break;
            default:
            System.out.println("Opção inexistente.");
                break;
        }
        
    }
}
