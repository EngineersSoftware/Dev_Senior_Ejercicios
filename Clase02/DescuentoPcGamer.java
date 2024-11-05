public class DescuentoPcGamer {
/*El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios? */

    public static void main(String[] args) {

        var precio = 660;
        var descuento = 0.10;
        var pagoTotal = precio - (precio * descuento);

        System.out.printf("El precio total del PC gamer aplicando el descuento es de %.1f euros",pagoTotal);
    }
}
