public class OperadoresAritmeticos {

/*En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Explique por que la otra calculadora genera un resultado diferente. */

    public static void main(String[] args) {
        var resultado = 6/2*(1+2);
        System.out.printf("El resultado de la operaciión es %d",resultado);
    }
}
/*
Explicación resultado ejercicio:
Para desentrañar esta operación, hay un orden jerarquico de operaciones, 
que se deben cumplir a la hora de resolver operaciones matematicos, este orden es una convención y
dice que debes de ir de izquierda a derecha evaluando primero los parentesis, luego resuelves la potenciación y raices,
antes de hacer todas las multiplicaciones y divisiones. Al final sumas y restas.
*/