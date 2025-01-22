public class Bitcoin implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" realizado con Bitcoin"); 
    }

    @Override
    public String obtenerDetalles() {
        return "Metodo de pago: Bitcoin";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 0.001;
    }

}
