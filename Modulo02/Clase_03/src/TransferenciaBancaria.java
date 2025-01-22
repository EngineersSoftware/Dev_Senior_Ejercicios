public class TransferenciaBancaria implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" realizado con transferencia bancaria");
    }

    @Override
    public String obtenerDetalles() {
        return "Metodo de pago: Transferencia bancaria";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 10;        
    }
    

}
