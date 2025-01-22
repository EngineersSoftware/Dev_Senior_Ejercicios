public class Main {

    public static void main(String[] args) {

        MetodoPago tarjetaCredito = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        MetodoPago transferencia = new TransferenciaBancaria();
        MetodoPago bitcoin = new Bitcoin();
        MetodoPago tarjetaRegalo = new TarjetaRegalo();

        MetodoPago[] metodosDePago = {tarjetaCredito, paypal, transferencia, bitcoin, tarjetaRegalo};

        // Montos de prueba
        double[] montos = { 1500, 50, 5, 0.002, 400 };

        // Procesar cada método de pago con su respectivo monto
        for (int i = 0; i < metodosDePago.length; i++) {
            MetodoPago metodo = metodosDePago[i];
            double monto = montos[i];

            System.out.println("\n" + metodo.obtenerDetalles());
            if (metodo.validarMonto(monto)) {
                metodo.procesarPago(monto);
            } else {
                System.out.println("Monto inválido: $" + monto);
            }

        }

    }
}
