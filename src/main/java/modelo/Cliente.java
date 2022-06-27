package modelo;
public class Cliente extends Persona {
    private String direccion, numeroTelefonico, correoElectronico;

    public Cliente (String nombre, String rut, String direccion, String numeroTelefonico, String correoElectronico) {
        super(nombre, rut);
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion () {
        return this.direccion;
    }

    public String getNumeroTelefonico () {
        return this.numeroTelefonico;
    }

    public String getCorreoElectronico () {
        return this.correoElectronico;
    }

    public void obtenerDescuento() {
        System.out.println("El cliente " + getNombre() + " tiene un 20% de descuento");
    }

    public String toString() {
        return (this.nombre + "," + this.rut + "," + this.direccion + "," + this.numeroTelefonico + "," +
                this.correoElectronico);
    }
}