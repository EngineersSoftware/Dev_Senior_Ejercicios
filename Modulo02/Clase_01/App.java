public class App {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Andres", 17, 5.0);
        Estudiante estudiante2 = new Estudiante("Juan", 18, 2.5);
        Estudiante estudiante3 = new Estudiante("Maria", 19, 3.5);

        estudiante1.mostrarDetalles();
        System.out.println("--------------------");
        estudiante2.mostrarDetalles();
        System.out.println("--------------------");
        estudiante3.mostrarDetalles();


        System.out.println("--------------------");       


        System.out.println("Estudiante 1 aprobado: "+ estudiante1.esAprobado());
        System.out.println("Estudiante 2 aprobado: "+ estudiante2.esAprobado());
        System.out.println("Estudiante 3 aprobado: "+ estudiante3.esAprobado());
    }


    
}
