import java.util.Scanner;

public class AreaPerimetro {
    /*
     * Crea un programa que calcule el área y el perímetro de un rectángulo.
     * Solicita al usuario la longitud y el ancho del rectángulo.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n####### CALCULAR AREA Y PERIMETRO #######\n");
        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = entrada.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = entrada.nextDouble();

        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

        System.out.println("\n####### RESULTADO #######\n");
        System.out.printf("El área del rectángulo es: %.2f\n", area);
        System.out.printf("El perímetro del rectángulo es: %.2f\n", perimetro);

        entrada.close();
    }
}
