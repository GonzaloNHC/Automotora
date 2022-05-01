public class Cliente {
    private String nombre;
    private String direccion;
    private int numeroTelefonico;
    private String correoElectronico;
    private String rut;

    public Cliente (String nombre, String direccion, int numeroTelefonico, String correoElectronico, String rut) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
        this.rut = rut;
    }

    public String getNombre () {
        return this.nombre;
    }

    public String getDireccion () {
        return this.direccion;
    }

    public int getNumeroTelefonico () {
        return this.numeroTelefonico;
    }

    public String getCorreoElectronico () {
        return this.correoElectronico;
    }

    public String getRut () {
        return this.rut;
    }

    public String toString() {
        return ("\nNombre: " + this.nombre + "\nDirección: " + this.direccion +
                "\nRut: " + this.rut);
    }
}