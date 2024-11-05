public class CalculoPrecioOriginal {
/*Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€ por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes de aplicar el descuento? */
    public static void main(String[] args) {
        var precioFinal = 34;
        var descuento = 0.15;
        var precioOrignal = precioFinal / (1 - descuento);
        System.out.printf("El precio original de los pantalones sin el descuente es de %.1f euros",precioOrignal);
    }
}
