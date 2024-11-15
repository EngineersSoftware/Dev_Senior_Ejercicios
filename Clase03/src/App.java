import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
        Exercise7();
        Exercise8();
        Exercise9();
        Exercise10();
        Exercise11();
        Exercise12();
        Exercise13();
        Exersice14();
        Exercise15();
        Exercise16();
        Exercise17();
        Exercise18();
        Exercise19();
        Exercise20();
        Exercise21();
        Exercise22();
        Exercise23();

    }

    public static void Exercise1() {

        /*
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo,
         * positivo o cero.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero real: ");
        var numero = scanner.nextDouble();

        // Realizamos la condición para verificar cada numero.
        if (numero > 0) {
            System.out.println("El numero es positivo!");

        } else if (numero < 0) {
            System.out.println("El numero es negativo!");
        } else {
            System.out.println("El nummero es cero!");
        }

        scanner.close();
    }

    public static void Exercise2() {
        /*
         * Escriba un programa que le permita ingresar tres números e imprima en la
         * consola el más grande de ellos.
         */
        Scanner sc = new Scanner(System.in);

        // Pedir y leer los 3 numeros
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int num3 = sc.nextInt();

        // Determinar el numero mayor
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Mostrar el numero mas grande
        System.out.println("########### RESULTADO #########");
        System.out.printf("El numero mas grande es: %d ", max);

        sc.close();
    }

    public static void Exercise3() {
        /*
         * Escriba un programa que permita ingresar un número e identificar si es par
         * o impar.
         */
        Scanner numero = new Scanner(System.in);
        System.out.println("\n########## NUMEROS PAR O NO ##########\n");

        // Pedir los numeros al usuario
        System.out.print("Ingrese un número: ");
        int numero1 = numero.nextInt();

        // Condición para verificar los numeros ingresados
        if (numero1 % 2 == 0) {
            System.out.printf("El número %d es par", numero1);

        } else {
            System.out.printf("El número %d no es par", numero1);
        }

        numero.close();

    }

    public static void Exercise4() {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si la
         * letra es mayúscula o minúscula.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra es minúscula.");
        } else {
            System.out.println("El valor ingresado no es una letra válida.");
        }

        sc.close();

    }

    public static void Exercise5() {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si es
         * vocal o consonante.
         */

        Scanner letra = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char vocal = letra.next().toLowerCase().charAt(0);

        switch (vocal) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        letra.close();
    }

    public static void Exercise6() {
        /*
         * Escriba un programa que permita ingresar un número y determine si es
         * divisible por dos y siete.
         */
        Scanner num = new Scanner(System.in);

        System.out.println(
                "\n##### PROGRAMA PARA DETERMINAR SI EL NUMERO INGRESADO ES DIVISIBLE POR DOS Y SIETE #####\n");

        System.out.print("Ingrese un numero: ");
        int numero = num.nextInt();

        if (numero % 2 == 0 && numero % 7 == 0) {
            System.out.printf("El numero %d es divisible por 2", numero);
        } else {
            System.err.printf("El numero %d ¡NO ES DIVISIBLE POR 2 Y 7!", numero);
        }

        num.close();

    }

    public static void Exercise7() {
        /*
         * Escriba un programa que permita ingresar tres números (representan la
         * longitud de una línea) y compruebe si con estos números se puede formar un
         * triángulo.
         */
        Scanner numero = new Scanner(System.in);
        System.out.println("\n#### LONGITUD DE UN TRIANGULO ####\n");
        System.out.print("Ingrese la longitud del primer lado: ");
        int length1 = numero.nextInt();
        System.out.print("Ingrese la longitud del segundo lado: ");
        int lenght2 = numero.nextInt();
        System.out.print("Ingrese la longitud del tercer lado: ");
        int length3 = numero.nextInt();
        numero.close();

        if (unTriangulo(length1, lenght2, length3)) {
            System.out.print("Las longitudes ingresadas forman un triangulo!");
        } else {
            System.err.println("Las longitudes ingresadas NO forman un triangulo");
        }
    }

    private static boolean unTriangulo(int side1, int side2, int side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }

    public static void Exercise8() {
        /*
         * Escriba un programa que permita ingresar un número (va a representar la
         * cantidad de años) y de como respuesta la etapa en la que se encuentra la
         * persona de acuerdo con la siguiente tabla.
         */
        Scanner num = new Scanner(System.in);

        System.out.println("\n####### VERIFICACION, RANGO DE EDADES ##########\n");
        System.out.print("Ingrese su edad: ");
        int edad = num.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.print("Estas en la etapa de primera infancia!!\n");
        } else if (edad >= 6 && edad <= 11) {
            System.out.print("Estas en la etapa de infancia!!\n");
        } else if (edad >= 12 && edad <= 18) {
            System.out.print("Estas en la etapa de Adolescencia!!\n");
        } else if (edad >= 19 && edad <= 26) {
            System.out.print("Estas en la etapa de la Juventud!!\n");
        } else if (edad >= 27 && edad <= 59) {
            System.out.print("Estas en la etapa de Adultez\n");
        } else if (edad > 59) {
            System.out.print("Ya eres una persona mayor!!!\n");
        }
        System.out.print("Programa finalizado!!\n");

        num.close();

    }

    public static void Exercise9() {
        /*
         * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a
         * la cantidad de unidades que le compren. La siguiente tabla muestra la
         * información:
         * Unidades Precio por unidad
         * [1 - 50] $50.000
         * (50 - 100] $45.000
         * (100 - 150] $40.000
         * (150 - 200] $35.000
         * > 200 $25.000
         */
        // Escriba un programa que dado un número de camisas retorne el precio por
        // unidad.
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese un número de camisas: ");
        var camisas = dato.nextInt();

        if (camisas >= 1 && camisas <= 50) {
            System.out.println("El precio unitario de cada camisa es $50.000");
            double total = camisas * 50000;
            System.out.printf("El precio total es: %,.2f%n", total);
        } else if (camisas >= 51 && camisas <= 100) {
            System.out.println("El precio unitario de cada camisa es $45.000");
            double total = camisas * 45000;
            System.out.printf("El precio total es: %,.3f%n", total);
        } else if (camisas >= 101 && camisas <= 150) {
            System.out.println("El precio unitario de cada camisa es $40.000");
            double total = camisas * 40000;
            System.out.printf("El precio total es: %,.3f%n", total);
        } else if (camisas >= 151 && camisas <= 200) {
            System.out.println("El precio unitario de cada camisa es $35.000");
            double total = camisas * 35000;
            System.out.printf("El precio total es: %,.3f%n", total);
        } else if (camisas > 200) {
            System.out.println("El precio unitario de cada camisa es $25.000");
            double total = camisas * 25000;
            System.out.printf("El precio total es: %,.3f%n", total);
        } else {
            System.err.println("Ingrese un valor correcto.");
        }

        dato.close();
    }

    public static void Exercise10() {
        /*
         * Escriba una función en la que ingrese un número entero entre 1 y 12. Este
         * número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El
         * resultado debe ser el número de días del mes ingresado.
         */
        Scanner numero = new Scanner(System.in);
        System.out.println("\n## El siguiente programa solicita un numero que corresponde a un mes y sus días ##\n");
        System.out.print("Ingrese un numero entre 1 y 12: ");
        int mes = numero.nextInt();

        if (mes >= 1 && mes <= 12) {
            int dias = obtenerDiasDelMes(mes);
            System.out.printf("El mes %d tiene %d días.", mes, dias);
        } else {
            System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 12.");
        }

        numero.close();
    }

    // Método para obtener la cantidad de días del mes
    private static int obtenerDiasDelMes(int mes) {
        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                return 31;

            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;

            case 2: // Febrero
                return 28;

            default:
                return 0;
        }
    }

    public static void Exercise11() {
        /*
         * Escriba una función en la que pueda ingresar tres números enteros y
         * diferentes. Imprima estos valores en orden ascendente.
         */
        Scanner num = new Scanner(System.in);

        System.out.println("#### Numeros en orden ascendente ####");

        System.out.print("Ingrese el primer número: ");
        var numero1 = num.nextInt();

        System.out.print("Ingrese el segundo número: ");
        var numero2 = num.nextInt();

        System.out.print("Ingrese el tercer número: ");
        var numero3 = num.nextInt();

        if (numero1 <= numero2 && numero1 <= numero3) {
            if (numero2 <= numero3) {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            } else {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            if (numero1 <= numero3) {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            } else {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            }
        } else {
            if (numero1 <= numero2) {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            } else {
                System.out.printf("Los números en orden ascendente son: %d, %d, %d", numero1, numero2, numero3);
            }
        }
        num.close();
    }

    public static void Exercise12() {
        /*
         * En un día soleado y caluroso Sebastian y Adriana salen en busca de una
         * sandia. Se dirigen a la tienda más cercana y compran la más grande y jugosa.
         * En casa se disponen a dividir y a comer la fruta pero se les presenta un gran
         * problema y es que Adriana y Sebastian son amantes de los números pares. De
         * manera que quieren dividir la sandía en dos partes no necesariamente iguales
         * pero ambas deben ser pares.
         * Escriba una función en el que pueda ingresar el peso de la sandía en
         * kilogramos y la respuesta sea:
         * 
         * SI en caso de que se pueda dividir este peso en números pares
         * NO de lo contrario.
         */
        Scanner sandia = new Scanner(System.in);

        System.out.print("\nIngrese el peso en KG: ");
        int peso = sandia.nextInt();

        if (peso % 2 == 0) {
            System.out.print("SI se puede dividir este peso en números pares :)\n");
        } else {
            System.out.print("NO se puede dividir este peso en números pares :(\n");
        }
        sandia.close();
    }

    public static void Exercise13() {
        /*
         * Tres hermanos acuerdan reunirse. Los hermanos son identificados por los
         * siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
         * Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los
         * números de los hermanos que llegan a tiempo, determine el número del hermano
         * que llegará tarde.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero del primer hermano que llego a tiempo (1,2 o 3): ");
        int hermano1 = sc.nextInt();
        System.out.print("Ingrese el numero del segundo hermano que llego a tiempo (1, 2 o 3): ");
        int hermano2 = sc.nextInt();

        System.out.print("El hermano que llegará tarde sera el número: ");

        if (hermano1 != 1 && hermano2 != 1) {
            System.out.println(1); // El hermano mayor llega tarde.
        } else if (hermano1 != 2 && hermano2 != 2) {
            System.out.println(2); // El hermano del medio llega tarde.
        } else {
            System.out.println(3); // El hermano menor llega tarde.
        }

        sc.close();
    }

    public static void Exersice14() {
        Scanner sc = new Scanner(System.in);
        /*
         * Realice un programa en el que ingrese un número y muestre el cubo. Repita
         * el proceso hasta que se introduzca un valor negativo.
         */
        int numero;

        do {
            System.out.print("\nIngrese un numero (Ingrese un número negativo si desea salir): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                int cubo = numero * numero * numero;
                System.out.printf("El cubo del numero es: %d", cubo);
            } else {
                System.out.println("Identificado numero negativo.. finalizado el programa.....!");
            }

        } while (numero >= 0);

        sc.close();
    }

    public static void Exercise15() {
        Scanner sc = new Scanner(System.in);
        /*
         * Escriba un programa en el que ingrese un número y le diga si es positivo o
         * negativo. Repita el proceso hasta que se ingrese el número cero.
         */
        int numero;

        do {
            System.out.print("Ingrese un número (Ingrese el 0 si desea salir): ");
            numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("El numero es positivo");
            } else if (numero < 0) {
                System.out.println("El numero es negativo");
            }

        } while (numero != 0);

        sc.close();
    }

    public static void Exercise16() {
        Scanner sc = new Scanner(System.in);
        /*
         * Escriba un programa que permita ingresar un número mientras estos sean
         * negativos. Detener cuando el número ingresado sea positivo y de cómo
         * resultado la cantidad de números negativos ingresados.
         */
        int numero;

        do {
            System.out
                    .println("Ingrese un número negativo (Ingrese un numero positivo si desea detener el programa): ");
            numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("¡Bien! Haz ingresado un número negativo");
            } else {
                System.out.println("¡Ups! haz ingresado un numero positivo, programa finalizado...");
            }

        } while (numero < 0);
        sc.close();
    }

    public static void Exercise17() {
        /*
         * Escriba un programa que escriba en pantalla los números del 1 al 100 de 5
         * en 5.
         */
        byte container = 105;

        for (byte i = 0; i < container; i += 5) {
            System.out.println(i);
        }
    }

    public static void Exercise18() {
        /*
         * Escriba un programa que genere 120 números aleatorios entre -100 y 100.
         * Imprime los siguientes cálculos:
         * Sumar los valores positivos.
         * Sumar los valores negativos.
         * Calcule la media de los números negativos.
         * Calcule la media de los números positivos.
         * Cuente la cantidad de ceros.
         */

        var random = new Random();

        var cantidadNumeros = 120;
        var sumaPositivos = 0;
        var sumaNegativos = 0;
        var cantidadPositivos = 0;
        var cantidadNegativos = 0;
        var cantidadeCeros = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = random.nextInt(201) - 100;
            System.out.printf("Numero %d: %d%n", i + 1, numero);

            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                cantidadeCeros++;
            }

        }

        double calculoPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos /
                cantidadPositivos : 0;
        double calculoNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos /
                cantidadNegativos : 0;

        System.out.printf("Suma de valores positivos: %d%n", sumaPositivos);
        System.out.printf("Suma de valores negativos: %d%n", sumaNegativos);
        System.out.printf("Media de números positivos: %.3f%n", calculoPositivos);
        System.out.printf("Media de números negativos: %.3f%n", calculoNegativos);
        System.out.printf("Cantidad de ceros: %d", cantidadeCeros);

    }

    public static void Exercise19() {
        /*
         * Esta sucesión comienza con los números 0 y 1. El siguiente miembro se
         * calcula como la suma de los dos inmediatamente anteriores.
         * Crea un programa reciba un número (N) del usuario y muestre los primeros N
         * números de sucesión.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n### La sucesión de Fibonacci ###\n");

        System.out.print("Ingrese el numero (N) de sucesiones: ");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            int siguiente = n1 + n2;
            n1 = n2;
            n2 = siguiente;
        }
        sc.close();
    }

    public static void Exercise20() {
        /*
         * Realice un programa que genere el tablero de ajedrez en consola usando
         * instrucciones de repetición.
         * Realice un programa que genere el tablero de ajedrez en consola usando
         * instrucciones de repetición.
         */

        byte tamaño = 8;

        for (int fila = 1; fila <= tamaño; fila++) {
            for (int columna = 1; columna <= tamaño; columna++) {
                if ((fila + columna) % 2 == 0) {
                    System.out.print("| B |"); // celda blanca
                } else {
                    System.out.print("| N |"); // celda negra
                }
            }
            System.out.println(); // Genera un salto de linea de cada fila
        }
    }

    public static void Exercise21() {
        /*
         * Realizar un programa que permita hacer la siguiente conversión:
         * 
         * Millas a kilómetros.
         * Kilómetros a millas.
         * Considera que
         * 
         * 1 milla son 1.60934 kilómetros
         * 1 kilómetro es 0.621371 millas
         */
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n### ELIGE LA CONVERSION ###\n");
            System.out.println("1). Millas a kilometros.");
            System.out.println("2). Kilometros a millas.");
            System.out.println("3). Salir");
            System.out.print("Elige una opción: ");
            var option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n### Haz elegido la conversion de km a millas ####");
                    System.out.print("\nIngrese la cantida de Millas: ");
                    double millas = sc.nextDouble();
                    double kilometros = millas * 1.60934;
                    System.out.printf("La conversion de Millas a Kilometros es: %.5f%n",
                            kilometros);
                    System.out.println("----------------------------------------------");
                    break;
                case 2:
                    System.out.println("\n### Haz elegido la conversion de Kilometros a Millas ####");
                    System.out.print("\nIngrese la cantidad de kilometros: ");
                    double km = sc.nextDouble();
                    double millasConvertidas = km * 0.621371;
                    System.out.printf("La conversion de Kilometors a Millas es: %.5f%n",
                            millasConvertidas);
                    System.out.println("----------------------------------------------");
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Salieno del programa ....!!");
                    break;
                default:
                    System.err.println("Elige una opción correcta !!!");
                    break;
            }
        }

        sc.close();

    }

    public static void Exercise22() {
        /*
         * Realizar un programa que permita controlar el juego de piedra, papel,
         * tijera introduciendo P para piedra, L para papel y T para tijera por cada
         * jugador.
         * El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
         * de cada ronda preguntar si desea volver a jugar.
         */
        Scanner sc = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            System.out.print("\nJugador 1, elija una opcion (piedra 'P', papel 'L' y tijera 'T'): ");
            char jugador1 = sc.next().toUpperCase().charAt(0);

            System.out.print("\nJugador 2, elija una opcion (piedra 'P', papel 'L' y tijera 'T'): ");
            char jugador2 = sc.next().toUpperCase().charAt(0);

            if (jugador1 == jugador2) {
                System.out.println("EMPATE !!");
            } else if ((jugador1 == 'P' && jugador2 == 'T') ||
                    (jugador1 == 'T' && jugador2 == 'L') ||
                    (jugador1 == 'L' && jugador2 == 'P')) {
                System.out.println("\nJugador 1 GANA la ronda :)");
            } else if ((jugador2 == 'P' && jugador1 == 'T') ||
                    (jugador2 == 'T' && jugador1 == 'L') ||
                    (jugador2 == 'L' && jugador1 == 'P')) {
                System.out.println("\nJugador 2 GANA la ronda :)");
            } else {
                System.err.println("Elepcion no valida !!");
            }

            System.out.print("\nDesea volver a jugar selccione la teclas (S) o cualquier otra tecla para salir: ");
            char jugar = sc.next().toUpperCase().charAt(0);
            if (jugar != 'S') {
                jugarDeNuevo = false;
                System.out.println("Saliendo del programa.....!");
            }
        }

        sc.close();

    }

    public static void Exercise23() {
        /*
         * Realizar un programa que imprima un diamante usando caracteres de texto. El
         * programa debe pedir al usuario el tamaño del diamante, el cual debe ser un
         * número entero positivo impar
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del diamante (número entero positivo impar): ");

        int n = 0;
        boolean esValido = false;

        while (!esValido) {
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Error: El número debe ser un entero positivo.");
            } else if (n % 2 == 0) {
                System.out.println("Error: El número debe ser impar.");
            } else {
                esValido = true;
            }

            if (!esValido) {
                System.out.print("Intenta nuevamente: ");
            }
            scanner.close();
        }

        for (int i = 0; i <= n / 2; i++) {
            // Imprimir espacios
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Salto de línea
            System.out.println();
        }

        // Parte inferior del diamante
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Salto de línea
            System.out.println();

        }
    }
}