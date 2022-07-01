package gui;

import modelo.Automotora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Ventana implements ActionListener {
    JButton RegistroClientes;
    JButton RegistroVehiculos;
    JButton BusquedaVehiculos;
    JButton VenderVehiculo;
    JButton Salir;
    Automotora automotora;

    public Menu(Automotora automotora) {
        this.automotora = automotora;
        JLabel titulo = this.generarEtiqueta("Automotora", 115, 40, 300, 40,
                "Arial", 30);

        this.RegistroClientes = generarBoton("Registrar cliente", 125, 100, 150, 40);
        this.RegistroVehiculos = generarBoton("Registrar vehículo", 125, 180, 150, 40);
        this.BusquedaVehiculos = generarBoton("Buscar vehículo", 125, 260, 150, 40);
        this.VenderVehiculo = generarBoton("Vender vehículo", 125, 340, 150, 40);
        this.Salir = generarBoton("Salir", 125, 420, 150, 40);

        RegistroClientes.addActionListener(this);
        RegistroVehiculos.addActionListener(this);
        BusquedaVehiculos.addActionListener(this);
        VenderVehiculo.addActionListener(this);
        Salir.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == RegistroClientes) {
            VentanaRegistroClientes ventanaRegistroClientes = new VentanaRegistroClientes(this.automotora);
            this.dispose();
        } else if(e.getSource() == RegistroVehiculos) {
            VentanaRegistroAuto ventanaRegistroVehiculos = new VentanaRegistroAuto(this.automotora);
            this.dispose();
        } else if(e.getSource() == BusquedaVehiculos) {
            VentanaBusquedaAuto ventanaBusquedaVehiculos = new VentanaBusquedaAuto(this.automotora);
            this.dispose();
        } else if(e.getSource() == VenderVehiculo) {
            JOptionPane.showMessageDialog(this, "Próximamente", "Mensaje informativo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.dispose();
        }
    }
}
