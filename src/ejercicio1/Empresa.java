
package ejercicio1;

public class Empresa {
    public static void main(String[] args) {
       
        Empleado empleado = new Empleado("Valentina Zuñiga", 5000000);
        Gerente gerente = new Gerente("Neyder Escalante", 6300000, "Gerencia");
        
        System.out.println("Información del empleado: ");
        empleado.mostrarDetalles();
        System.out.println("-----");
        
        System.out.println("Información del gerente: ");
        gerente.mostrarInformacion();
        System.out.println("-----");
    }
    
}
