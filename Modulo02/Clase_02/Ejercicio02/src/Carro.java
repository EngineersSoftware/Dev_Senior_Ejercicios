public class Carro extends Vehiculo {

    private int numPuertas;


    public Carro(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }


    public int getNumPuertas() {
        return numPuertas;
    }


    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    

   

    

}
