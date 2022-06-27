package modelo;
import modelo.Cliente;
import modelo.Vehiculo;

import java.util.Date;

public class Venta {
    private Vendedor vendedor;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fecha;

    public Venta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Date getFecha () {
        return new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String toString() {
        return "Datos vendedor: " + vendedor + "\nDatos cliente: " + cliente +
                "\nAuto vendido: " + vehiculo;
    }
}