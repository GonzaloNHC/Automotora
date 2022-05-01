public class Vendedor {
    private String nombre;
    private int edad;
    private String rut;

    public Vendedor(String nombre, int edad, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getRut() {
        return this.rut;
    }

    public String toString() {
        return ("\nNombre: " + this.nombre + "\nEdad: " + this.edad +
                "\nRut: " + this.rut);
    }
}