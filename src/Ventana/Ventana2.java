package Ventana;

import Metodos_Funciones.Aviones_Creacion;
import Aviones.*;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import Metodos_Funciones.*;
import javax.swing.*;
import Funciones_Botones.*;

public class Ventana2 extends JFrame {

    public JPanel panel = new JPanel();
    public JPanel panel_Lista = new JPanel();
    public JScrollPane scrollpane;
    public JList lista_aviones = new JList();
    public JButton vVuelo_Aterrizaje = new JButton("Aterrizar el Avion seleccionaada");
    public JButton vAterrizaje_Hangar = new JButton("Desplazar el  Avion de Aterrizaje a Hangar");
    public DefaultListModel vModelo = new DefaultListModel();
    public JComboBox vCombo = new JComboBox();
    public JTextField vModeloText = new JTextField();
    public JButton Ingresar = new JButton("Empezar con un random de 10 a 25");
    public JButton Hangar_Despegue = new JButton("Pasar el ultimo avion del Hangar a pista Despegue");
    public JButton Agregar_Avion = new JButton("Agregar un avion");
    public JLabel vFondo = new JLabel();
    public JLabel Lista = new JLabel();

    public JButton getAgregarAvion() {
        return Agregar_Avion;
    }

    public Ventana2() {
        super("Lista");
        panel.setLayout(null);

        lista_aviones.setModel(vModelo);

        scrollpane = new JScrollPane(lista_aviones);

        scrollpane.setBounds(5, 45, 600, 200);
        scrollpane.setViewportView(lista_aviones);
        vFondo.add(scrollpane);

        JLabel vEti = new JLabel("Listas de Aviones:");
        vEti.setBounds(5, 5, 200, 20);

        vModeloText.setBounds(10, 400, 150, 20);

        vCombo.addItem("Lista de hangar");
        vCombo.addItem("Lista de Vuelo");
        vCombo.addItem("Lista de atrerrizaje");
        vCombo.addItem("Lista de Despegue");
        vCombo.setBounds(5, 25, 200, 20);

        Lista.setBounds(1000, 100, 100, 20);

        Ingresar.setBounds(210, 25, 250, 20);

        Hangar_Despegue.setBounds(5, 250, 400, 20);
        Hangar_Despegue.setVisible(false);
        vVuelo_Aterrizaje.setBounds(5, 250, 400, 20);
        vVuelo_Aterrizaje.setVisible(false);

        Agregar_Avion.setBounds(210, 25, 150, 20);

        Ingresar.addActionListener(new Manejador_1(this));
        Hangar_Despegue.addActionListener(new Manejador_1(this));
        Agregar_Avion.addActionListener(new Manejador_1(this));
        vCombo.addActionListener(new Manejador_1(this));
        vVuelo_Aterrizaje.addActionListener(new Manejador_1(this));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));

        vFondo.add(vVuelo_Aterrizaje);
        vFondo.add(vCombo);
        vFondo.add(Lista);
        vFondo.add(vEti);
        vFondo.add(scrollpane);
        vFondo.add(vModeloText);

        vFondo.add(Ingresar);
        vFondo.add(Hangar_Despegue);
        vFondo.add(Agregar_Avion);
        add(vFondo);
        setSize(1950, 1250);
        setVisible(true);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
