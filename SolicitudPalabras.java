import java.util.Scanner;

public class SolicitudPalabras {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);
        System.out.print("Escribe la palabra 1: ");
        var palabra1 = entrada.nextLine();


        System.out.print("Escribe la palabra 2: ");
        var palabra2 = entrada.nextLine();


        System.out.print("Escribe la palabra 3: ");
        var palabra3 = entrada.nextLine();

        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);

        entrada.close();


    }
}
