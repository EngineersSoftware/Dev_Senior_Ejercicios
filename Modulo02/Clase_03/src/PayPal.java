public class PayPal implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" realizado con Paypal");
    }

    @Override
    public String obtenerDetalles() {
        return "Metodo de pago: Paypal";        
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto < 10000;
    }
        

}
