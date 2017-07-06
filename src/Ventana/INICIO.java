package Ventana;

import Metodos_Funciones.Aviones_Creacion;
import Aviones.Lista_Aterrizaje;
import Aviones.Lista_Despegue;
import Aviones.Lista_Hangar;
import Aviones.Lista_Vuelo;
import Funciones_Botones.Manejador_0;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class INICIO extends JFrame {

    public JButton boton1 = new JButton("Iniciar simulador");
    JPanel Panel1 = new JPanel();
    JLabel fondo = new JLabel();

    public INICIO() {
        super("Aero");
        boton1.setBounds(960, 700, 200, 20);
        boton1.addActionListener(new Manejador_0(this));
        Panel1.setLayout(null);
        Panel1.setSize(1920, 1250);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Inicio.png")));
        fondo.setSize(1920, 1250);
        fondo.add(boton1);
        Panel1.add(fondo);
        setSize(1920, 1250);
        setSize(1950, 1250);
        setVisible(true);
        add(Panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
