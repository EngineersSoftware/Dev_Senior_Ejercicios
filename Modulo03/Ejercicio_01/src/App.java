import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de Gestión de Inventario");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar cantidad");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreAgregar = scanner.nextLine();
                        System.out.print("Ingrese la cantidad: ");
                        int cantidadAgregar = scanner.nextInt();
                        inventario.agregarProducto(nombreAgregar, cantidadAgregar);
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre del producto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        inventario.eliminarProducto(nombreEliminar);
                        break;

                    case 3:
                        System.out.print("Ingrese el nombre del producto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        int cantidad = inventario.buscarProducto(nombreBuscar);
                        System.out.println("Producto encontrado: " + nombreBuscar + ", Cantidad: " + cantidad);
                        break;

                    case 4:
                        System.out.print("Ingrese el nombre del producto a actualizar: ");
                        String nombreActualizar = scanner.nextLine();
                        System.out.print("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = scanner.nextInt();
                        inventario.actualizarCantidad(nombreActualizar, nuevaCantidad);
                        break;

                    case 5:
                        continuar = false;
                        System.out.println("Saliendo del sistema. ¡Adiós!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (ProductoNoEncontradoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (CantidadInvalidadException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
