package gui;

import modelo.Automotora;
import modelo.ColorVehiculo;
import modelo.MarcaVehiculo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistroAuto extends Ventana implements ActionListener {
    Automotora automotora;

    JComboBox <MarcaVehiculo> marcas = new JComboBox<>(MarcaVehiculo.values());
    JComboBox <ColorVehiculo> colorVehiculo = new JComboBox<>(ColorVehiculo.values());
    JComboBox año;
    JFormattedTextField precio;
    JFormattedTextField kilometros;

    JTextField nombre;

    JButton volver;
    JButton aceptar;
    JButton cancelar;

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

        JLabel kilometros = this.generarEtiqueta("Km recorridos: ", 20,350,120,25,
                "Calibri", 17);


        nombreField = this.generarCampoDeTexto(160, 100, 150, 20);

        this.add(colorVehiculo);
        colorVehiculo.setBounds(160, 150, 120, 20);

        this.add(marcas);
        marcas.setBounds(160, 200, 120, 20);

        año = this.generarComboBox(1950, 2022, 160, 250,120,20);

        precio = this.generarCampoDeTextoFormateado(160, 300, 150, 20);
        kilometros = this.generarCampoDeTextoFormateado(160, 350, 150, 20);


        aceptar = this.generarBoton("Aceptar", 100,450,100,50);
        cancelar = this.generarBoton("Cancelar", 200,450,100,50);


        aceptar.addActionListener(this);
        cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelar) {
            nombre.setText("");
            precio.setText("");
            kilometros.setText("");
            this.dispose();
            new Menu(this.automotora);
        }
    }
}
