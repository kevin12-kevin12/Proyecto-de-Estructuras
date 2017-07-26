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

    public JButton boton1 = new JButton("Iniciar simulación");
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
        Image icon1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/p.jpg"));
        setIconImage(icon1);
        setVisible(true);
        EventTecla vEvento = new EventTecla();
        addKeyListener(vEvento);
        add(Panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class EventTecla implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int vCodigo = e.getKeyCode();
            System.out.println(vCodigo);
            if (vCodigo == 10) {

                Ventana2 vInterfaz = new Ventana2();
                vInterfaz.setVisible(true);
                dispose();

            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }

}
