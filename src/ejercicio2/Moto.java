
package ejercicio2;

public class Moto extends Vehiculo {
    
    protected int cilindrada;
    
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
    public void mostrarInformacion() {
        mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
