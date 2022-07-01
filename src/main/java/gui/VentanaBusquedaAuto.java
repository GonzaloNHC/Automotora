package gui;

import modelo.Automotora;
import modelo.MarcaVehiculo;
import modelo.Vehiculo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VentanaBusquedaAuto extends Ventana implements ActionListener {
    Automotora automotora;

    JComboBox <MarcaVehiculo> marcas = new JComboBox<>(MarcaVehiculo.values());
    JButton volver;
    JButton buscar;
    JButton cancelar;

    JTextField nombre;

    public VentanaBusquedaAuto (Automotora automotora) {
        this.automotora = automotora;
        JLabel titulo = this.generarEtiqueta("Búsqueda de Vehículos", 35, 80,
                400, 40,"Arial", 30);

        JLabel nombre = this.generarEtiqueta("Nombre vehículo: ", 20,200,140,25,
                "Calibri", 17);

        JLabel marca = this.generarEtiqueta("Marca: ", 20,275,120,25,
                "Calibri", 17);

        nombre = this.generarCampoDeTexto(160, 200, 150, 20);

        this.add(marcas);
        marcas.setBounds(160, 275, 120, 20);


        buscar = this.generarBoton("Buscar", 100,350,100,50);
        cancelar = this.generarBoton("Cancelar", 200,350,100,50);

        buscar.addActionListener(this);
        cancelar.addActionListener(this);
    }

    public void buscarAuto() {
        List<Vehiculo> vehiculos = this.automotora.buscarAutoMarca(marcas.getSelectedItem().toString());
        if(!nombreField.getText().equals("")) {
            vehiculos = this.automotora.buscarAutoNombre(nombre.getText(), vehiculos);
        }

        JOptionPane.showMessageDialog(this, vehiculos.size() > 0 ?
                        this.automotora.mostrarAutosLista(vehiculos) : "No se encontraron coincidencias",
                "Vehiculos", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelar) {
            nombre.setText("");
            this.dispose();
            new Menu(this.automotora);
        } else if(e.getSource() == buscar) {
            buscarAuto();
        }
    }
}
