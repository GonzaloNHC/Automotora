package modelo;
public class Vehiculo {
    private String nombre;
    private ColorVehiculo colorVehiculo;
    private MarcaVehiculo marcaVehiculo;
    private int año, precio;
    private double kmRecorridos, cantidadCombustible;

    public Vehiculo(String nombre, ColorVehiculo colorVehiculo, MarcaVehiculo marcaVehiculo,
                    int año, int precio, double kmRecorridos){

        this.nombre = nombre;
        this.colorVehiculo = colorVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.año = año;
        this.precio = precio;
        this.kmRecorridos = kmRecorridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return colorVehiculo.getColorVehiculo();
    }

    public void setColor(ColorVehiculo color) {
        this.colorVehiculo = color;
    }

    public String getMarca() {
        return marcaVehiculo.getMarcaVehiculo();
    }

    public void setMarca(MarcaVehiculo marca) {
        this.marcaVehiculo = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void rellenarCombustible(double cantCombustible){
        this.cantidadCombustible+= cantCombustible;
    }

    public String toString() {
        return ("\nNombre: " + this.nombre + "\nMarca: " + this.marcaVehiculo +
                "\nAño: " + this.año);
    }
}