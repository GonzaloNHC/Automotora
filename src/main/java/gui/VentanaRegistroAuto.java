package gui;

import modelo.Automotora;
import modelo.ColorVehiculo;
import modelo.MarcaVehiculo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistroAuto extends Ventana implements ActionListener {
    Automotora automotora;

    JComboBox <MarcaVehiculo> marcasBox = new JComboBox<>(MarcaVehiculo.values());
    JComboBox <ColorVehiculo> colorVehiculoBox = new JComboBox<>(ColorVehiculo.values());
    JComboBox añoBox;
    JFormattedTextField precioField;
    JFormattedTextField kmField;

    JTextField nombreField;

    JButton volverBtn;
    JButton aceptarBtn;
    JButton cancelarBtn;

    public VentanaRegistroAuto (Automotora automotora) {
        JLabel titulo = this.generarEtiqueta("Registro Vehículos", 70, 50,
                300, 40,"Arial", 30);

        JLabel nombre = this.generarEtiqueta("Nombre vehículo: ", 20,100,140,25,
                "Calibri", 17);

        JLabel color = this.generarEtiqueta("Color: ", 20,150,120,25,
                "Calibri", 17);
        JLabel marca = this.generarEtiqueta("Marca: ", 20,200,120,25,
                "Calibri", 17);
        JLabel año = this.generarEtiqueta("Año: ", 20,250,120,25,
                "Calibri", 17);

        JLabel precio = this.generarEtiqueta("Precio: ", 20,300,120,25,
                "Calibri", 17);

        JLabel km = this.generarEtiqueta("Km recorridos: ", 20,350,120,25,
                "Calibri", 17);


        nombreField = this.generarCampoDeTexto(160, 100, 150, 20);

        this.add(colorVehiculoBox);
        colorVehiculoBox.setBounds(160, 150, 120, 20);

        this.add(marcasBox);
        marcasBox.setBounds(160, 200, 120, 20);

        añoBox = this.generarComboBox(1950, 2022, 160, 250,120,20);

        precioField = this.generarCampoDeTextoFormateado(160, 300, 150, 20);
        kmField = this.generarCampoDeTextoFormateado(160, 350, 150, 20);


        aceptarBtn = this.generarBoton("Aceptar", 100,450,100,50);
        cancelarBtn = this.generarBoton("Cancelar", 200,450,100,50);


        aceptarBtn.addActionListener(this);
        cancelarBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelarBtn) {
            nombreField.setText("");
            precioField.setText("");
            kmField.setText("");
            this.dispose();
            new Menu(this.automotora);
        }
    }
}