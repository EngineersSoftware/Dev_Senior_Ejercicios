public class Estudiante {

    String nombre;
    int edad;
    double promedio;


    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Promedio: "+ promedio);

    }

    public boolean esAprobado(){
        return promedio >= 3.0;
    }

}
