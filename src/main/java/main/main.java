package main;

import gestor.GestorDato;
import gui.Menu;
import modelo.Automotora;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Automotora automotora = new Automotora();
        automotora.añadirVehiculosPorVender();

        GestorDato.leerArchivoVendedores(automotora, "target.vendedores.txt");
        GestorDato.leerArchivoClientes(automotora, "target.clientes.txt");
        GestorDato.leerArchivoVehiculos(automotora, "target.vehiculos.txt");

        new Menu(automotora);
    }
}
