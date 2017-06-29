package Ventana;

import Metodos_Funciones.Aviones_Creacion;
import Aviones.Lista_Aterrizaje;
import Aviones.Lista_Despegue;
import Aviones.Lista_Hangar;
import Aviones.Lista_Vuelo;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class INICIO extends JFrame {

    JButton boton1 = new JButton("Iniciar simulador");
    JPanel Panel1 = new JPanel();
    JLabel fondo = new JLabel();

    public INICIO() {
        super("Aero");
        boton1.setBounds(960, 700, 200, 20);
        boton1.addActionListener(new Manejador());
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

    class Manejador implements ActionListener {

        Lista_Despegue vDespegue = new Lista_Despegue();
        Lista_Hangar vHangar = new Lista_Hangar();
        Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
        Lista_Vuelo vVuelo = new Lista_Vuelo();

        Aviones_Creacion vMetodo = new Aviones_Creacion();

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(boton1)) {

                Lista_Despegue vDespegue = new Lista_Despegue();
                Lista_Hangar vHangar = new Lista_Hangar();
                Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
                Lista_Vuelo vVuelo = new Lista_Vuelo();

                Ventana2 vInterfaz = new Ventana2();
                vInterfaz.setVisible(true);
                dispose();
            }

        }

        /*public void AgregarAviones() {
            Random vRandom = new Random();
            int vRandom1 = 10 + vRandom.nextInt(15);
            int vCDespegue = vRandom.nextInt(vRandom1);
            for (int i = 0; i < vCDespegue; i++) {

                vDespegue.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

            }
            int vRandom2 = vRandom1 - vCDespegue;
            int vCHangar = vRandom.nextInt(vRandom2);
            for (int i = 0; i < vCHangar; i++) {

                vHangar.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

            }
            int vRandom3 = vRandom2 - vCHangar;
            int vCAterrizaje = vRandom.nextInt(vRandom3);
            for (int i = 0; i < vCAterrizaje; i++) {

                vAterrizaje.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

            }
            int vCVuelo = vRandom3 - vCAterrizaje;
            for (int i = 0; i < vCVuelo; i++) {
                vVuelo.AgregarAlFinal(vMetodo.getModeloAvion(),vMetodo.getPasajeros(),vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

            }

        }*/
    }

}
