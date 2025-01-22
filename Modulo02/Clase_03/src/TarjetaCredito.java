public class TarjetaCredito implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" realizado con tarjeta de credito");        
    }

    @Override
    public String obtenerDetalles() {
        return "Metodo de pago: Tarjeta de credito";
        
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;        
    }

}
