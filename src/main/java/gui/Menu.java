package gui;

import modelo.Automotora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Ventana implements ActionListener {
    JButton btnRegistroClientes;
    JButton btnRegistroVehiculos;
    JButton btnBusquedaVehiculos;
    JButton btnVenderVehiculo;
    JButton btnSalir;
    Automotora automotora;

    public Menu(Automotora automotora) {
        this.automotora = automotora;
        JLabel titulo = this.generarEtiqueta("Automotora", 115, 40, 300, 40,
                "Arial", 30);

        this.btnRegistroClientes = generarBoton("Registrar cliente", 125, 100, 150, 40);
        this.btnRegistroVehiculos = generarBoton("Registrar vehículo", 125, 180, 150, 40);
        this.btnBusquedaVehiculos = generarBoton("Buscar vehículo", 125, 260, 150, 40);
        this.btnVenderVehiculo = generarBoton("Vender vehículo", 125, 340, 150, 40);
        this.btnSalir = generarBoton("Salir", 125, 420, 150, 40);

        btnRegistroClientes.addActionListener(this);
        btnRegistroVehiculos.addActionListener(this);
        btnBusquedaVehiculos.addActionListener(this);
        btnVenderVehiculo.addActionListener(this);
        btnSalir.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRegistroClientes) {
            VentanaRegistroClientes ventanaRegistroClientes = new VentanaRegistroClientes(this.automotora);
            this.dispose();
        } else if(e.getSource() == btnRegistroVehiculos) {
            VentanaRegistroAuto ventanaRegistroVehiculos = new VentanaRegistroAuto(this.automotora);
            this.dispose();
        } else if(e.getSource() == btnBusquedaVehiculos) {
            VentanaBusquedaAuto ventanaBusquedaVehiculos = new VentanaBusquedaAuto(this.automotora);
            this.dispose();
        } else if(e.getSource() == btnVenderVehiculo) {
            JOptionPane.showMessageDialog(this, "Próximamente", "Mensaje informativo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.dispose();
        }
    }
}