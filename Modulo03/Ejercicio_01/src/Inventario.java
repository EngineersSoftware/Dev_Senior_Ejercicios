import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Integer> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, int cantidad) {
        productos.put(nombre, productos.getOrDefault(nombre, 0) + cantidad);
        System.out.println("Producto agregado: " + nombre + ", Cantidad: " + cantidad);
    }

    public void eliminarProducto(String nombre) {
        if (!productos.containsKey(nombre)) {
            throw new ProductoNoEncontradoException("El producto '" + nombre + "' no existe en el inventario.");
        }
        productos.remove(nombre);
        System.out.println("Producto eliminado: " + nombre);
    }

    public int buscarProducto(String nombre) {
        if (!productos.containsKey(nombre)) {
            throw new ProductoNoEncontradoException("El producto '" + nombre + "' no se encuentra en el inventario.");
        }
        return productos.get(nombre);
    }

    public void actualizarCantidad(String nombre, int nuevaCantidad) throws CantidadInvalidadException {
        if (!productos.containsKey(nombre)) {
            throw new ProductoNoEncontradoException("El producto '" + nombre + "' no se encuentra en el inventario.");
        }
        if (nuevaCantidad < 0) {
            throw new CantidadInvalidadException("La cantidad no puede ser negativa.");
        }
        productos.put(nombre, nuevaCantidad);
        System.out.println("Cantidad actualizada para el producto '" + nombre + "': " + nuevaCantidad);
    }
}


