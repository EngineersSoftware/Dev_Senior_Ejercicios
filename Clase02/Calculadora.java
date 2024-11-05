import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n######## CALCULADORA BASICA ########\n");

        System.out.print("Ingrese el primer numero a operar: ");
        var num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero a operar: ");
        var num2 = entrada.nextInt();

        var suma = num1 + num2;
        var resta = num1 - num2;
        var multiplicacion = num1 * num2;
        double divisionn = num1 / num2;

        System.out.println("\n######## RESULTADOS ########\n");
        System.out.printf("Resutaldo de la operación en suma es: %d%n ", suma);
        System.out.printf("Resutaldo de la operación en resta es: %d%n ", resta);
        System.out.printf("Resutaldo de la operación en multiplicación es: %d%n ", multiplicacion);
        System.out.printf("Resutaldo de la operación en división es: %.2f%n ", divisionn);

        entrada.close();
        
    } 
}
