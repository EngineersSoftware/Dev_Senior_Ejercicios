public class TarjetaRegalo implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" realizado con tarjeta de regalo");
    }

    @Override
    public String obtenerDetalles() {
        return "Metodo de pago: Tarjeta de regalo";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 || monto <= 500;
    }

}
