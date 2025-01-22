public class Moto extends Vehiculo {

    private boolean sideCar;



    public Moto(String marca, String modelo, int velocidadMaxima, boolean sideCar) {
        super(marca, modelo, velocidadMaxima);
        this.sideCar = sideCar;
    }



    public boolean isSideCar() {
        return sideCar;
    }



    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    

    

    

}
