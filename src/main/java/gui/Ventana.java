package gui;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public abstract class Ventana extends JFrame {

    public Ventana() {
        this.setLayout(null);
        this.setSize(400,600);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    protected JTextField generarCampoDeTexto(int x, int y, int ancho, int largo) {
        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setBounds(x, y, ancho, largo);
        this.add(campoDeTexto);
        return campoDeTexto;
    }

    protected JFormattedTextField generarCampoDeTextoFormateado(int x, int y, int ancho, int largo) {
        JFormattedTextField campoDeTexto = new JFormattedTextField(NumberFormat.getNumberInstance());
        campoDeTexto.setBounds(x, y, ancho, largo);
        this.add(campoDeTexto);
        return campoDeTexto;
    }

    protected JButton generarBoton(String texto, int x, int y, int ancho, int largo) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, largo);
        this.add(boton);

        return boton;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int largo, String fuente, int tamaño) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        Font myFont1 = new Font(fuente, Font.BOLD, tamaño);
        etiqueta.setFont(myFont1);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int largo) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JComboBox generarComboBox(int min, int max, int x, int y, int ancho, int largo) {
        JComboBox <Integer> comboBox = new JComboBox<Integer>();
        comboBox.setBounds(x,y,ancho,largo);

        for(int i = min; i <= max; i++) {
            comboBox.addItem(i);
        }
        int numeroDeReps = max - min + 1;

        this.add(comboBox);

        return comboBox;
    }
}