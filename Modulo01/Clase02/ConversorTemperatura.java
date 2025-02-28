import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
    
        double fahrenheit = celsius * 9 / 5 + 32;
    
        double kelvin = celsius + 273.15;
    
        System.out.printf("Temperatura en Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperatura en Kelvin: %.2f K\n", kelvin);
    
        scanner.close();
        }
    }
