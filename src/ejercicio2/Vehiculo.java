
package ejercicio2;

public class Vehiculo {
   
    protected String tipo;
    protected String marca;
    
    // Constructor
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
    protected void mostrarDatos() {
        System.out.println("Tipo de vehículo: " + tipo);
        System.out.println("Marca de vehículo: " + marca);
    }
}
