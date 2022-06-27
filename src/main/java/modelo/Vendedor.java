package modelo;
public class Vendedor extends Persona {
    private int edad;

    public Vendedor(String nombre, int edad, String rut) {
        super(nombre, rut);
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void obtenerDescuento() {
        System.out.println("El vendedor " + getNombre() + " tiene un 10% de descuento");
    }

    public String toString() {
        return (this.nombre + "," + this.edad +
                "," + this.rut);
    }
}