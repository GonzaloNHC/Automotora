package modelo;

public abstract class Persona {

    protected String nombre, rut;

    public Persona (String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public abstract void obtenerDescuento();
}