package gui;

import gestor.GestorDato;
import modelo.Automotora;
import modelo.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class VentanaRegistroClientes extends Ventana implements ActionListener {
  
{
    Automotora automotora;

    JTextField nombre;
    JTextField rutField;
    JTextField direccion;
    JTextField numero;
    JTextField correo;

    JButton aceptar;
    JButton cancelar;

    public VentanaRegistroClientes(Automotora automotora) {
        this.automotora = automotora;

        JLabel titulo = this.generarEtiqueta("Registro Clientes", 80, 50,
                300, 40,"Arial", 30);

        JLabel nombre = this.generarEtiqueta("Nombre: ", 20,100,120,25);
        JLabel rut = this.generarEtiqueta("Rut: ", 20,150,120,25);
        JLabel direccion = this.generarEtiqueta("Dirección: ", 20,200,120,25);
        JLabel numero = this.generarEtiqueta("Número telefónico: ", 20,250,120,25);
        JLabel correo = this.generarEtiqueta("Correo electrónico: ", 20,300,120,25);

        this.nombre = this.generarCampoDeTexto(150,100,200,25);
        this.rutField = this.generarCampoDeTexto(150,150,200,25);
        this.direccion = this.generarCampoDeTexto(150,200,200,25);
        this.numero = this.generarCampoDeTexto(150,250,200,25);


        this.correo = this.generarCampoDeTexto(150,300,200,25);



        aceptar = this.generarBoton("Aceptar", 100,450,100,50);
        aceptar.addActionListener(this);

        cancelar = this.generarBoton("Cancelar", 200,450,100,50);
        cancelar.addActionListener(this);
    }

    public void registrarCliente() {
        Cliente cliente = new Cliente(nombre.getText(), rutField.getText(), direccion.getText(),
                numero.getText(), correo.getText());

        if(this.automotora.añadirCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "Cliente registrado correctamente",
                    "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            GestorDato.registrarDato(cliente, "target.clientes.txt");
        } else {
            JOptionPane.showMessageDialog(this, "Rut ingresado inválido",
                    "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void limpiarTextField() {
        nombre.setText("");
        rutField.setText("");
        direccion.setText("");
        numero.setText("");
        correo.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar) {
            registrarCliente();
            limpiarTextField();
            System.out.println(automotora.getClientes());
        } else if(e.getSource() == cancelar) {
            limpiarTextField();
            this.dispose();
            Menu menu = new Menu(this.automotora);
        }
    }
}
