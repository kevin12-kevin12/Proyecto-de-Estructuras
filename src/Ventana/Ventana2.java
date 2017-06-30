package Ventana;

import Metodos_Funciones.Aviones_Creacion;
import Aviones.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import Metodos_Funciones.*;
import javax.swing.*;

public class Ventana2 extends JFrame {

    //Manejador_1 vManejador1= new Manejador_1();
    JPanel panel = new JPanel();
    JPanel panel_Lista = new JPanel();
    JScrollPane scrollpane;
    JList lista_aviones = new JList();
    JButton vVuelo_Aterrizaje = new JButton("Aterrizar el Avion seleccionaada");
    DefaultListModel vModelo = new DefaultListModel();
    JComboBox vCombo = new JComboBox();
    JTextField vListaDespegue = new JTextField();
    JButton Ingresar = new JButton("Empezar con un random de 10 a 25");
    JButton Hangar_Despegue = new JButton("Pasar el ultimo avion del Hangar a pista Despegue");
    JButton Mostar = new JButton("Mostar");
    JLabel vFondo = new JLabel();
    JLabel Lista = new JLabel();

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

        vListaDespegue.setBounds(10, 800, 150, 20);

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

        Mostar.setBounds(1000, 80, 100, 20);

        Ingresar.addActionListener(new Manejador());
        Hangar_Despegue.addActionListener(new Manejador());
        Mostar.addActionListener(new Manejador());
        vCombo.addActionListener(new Manejador());
        vVuelo_Aterrizaje.addActionListener(new Manejador());
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));

        vFondo.add(vVuelo_Aterrizaje);
        vFondo.add(vCombo);
        vFondo.add(Lista);
        vFondo.add(vEti);
        vFondo.add(scrollpane);
        vFondo.add(vListaDespegue);

        vFondo.add(Ingresar);
        vFondo.add(Hangar_Despegue);
        vFondo.add(Mostar);
        add(vFondo);
        setSize(1950, 1250);
        setVisible(true);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Manejador implements ActionListener {

        Lista_Despegue vDespegue = new Lista_Despegue();
        Lista_Hangar vHangar = new Lista_Hangar();
        Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
        Lista_Vuelo vVuelo = new Lista_Vuelo();
        Aviones_Creacion vMetodo = new Aviones_Creacion();
        CrearAvionesRandom vAvionesRandom = new CrearAvionesRandom();
        Metodo_Ordenamiento_Burbuja vOrdenamiento = new Metodo_Ordenamiento_Burbuja();

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(Hangar_Despegue)) {

                String vA = vHangar.TrasladarADespegue();

                System.out.println("Se elimino el avion" + vA);
            }
            if (e.getSource().equals(vVuelo_Aterrizaje)) {

                int vIndice =1+ lista_aviones.getSelectedIndex();
                
                vVuelo.BuscarElimiar(vIndice);
                
                

            }
            if (e.getSource().equals(Ingresar)) {

                vAvionesRandom.AgregarAviones();
                Ingresar.setVisible(false);

            } else if (e.getSource().equals(Mostar)) {

                //String vlis = vDespegue.MostrarLista();
                //vListaDespegue.setText(vlis);
                //System.out.println(vlis);
            }

            String itemSeleecionado = (String) vCombo.getSelectedItem();
            if ("Lista de Despegue".equals(itemSeleecionado)) {

                vModelo.removeAllElements();

                String[] vLista = vDespegue.RellenarArray();
                for (int i = 0; i < vLista.length; i++) {
                    vModelo.addElement(vLista[i]);
                }
                Hangar_Despegue.setVisible(false);
                vVuelo_Aterrizaje.setVisible(false);

            }
            if ("Lista de hangar".equals(itemSeleecionado)) {

                vModelo.removeAllElements();
                String[] vLista = vHangar.RellenarArray();

                for (int i = vLista.length - 1; i >= 0; i--) {
                    vModelo.addElement(vLista[i]);

                }
                Hangar_Despegue.setVisible(true);
                vVuelo_Aterrizaje.setVisible(false);

            }
            if ("Lista de Vuelo".equals(itemSeleecionado)) {

                vModelo.removeAllElements();
                String[] vLista = vVuelo.RellenarArray();
                vOrdenamiento.MetodoBusbujaString(vLista);
                for (int i = 0; i < vLista.length; i++) {
                    vModelo.addElement(vLista[i]);

                }
                Hangar_Despegue.setVisible(false);
                vVuelo_Aterrizaje.setVisible(true);
            }
            if ("Lista de atrerrizaje".equals(itemSeleecionado)) {

                vModelo.removeAllElements();
                String[] vLista = vAterrizaje.RellenarArray();
                for (int i = 0; i < vLista.length; i++) {
                    vModelo.addElement(vLista[i]);

                }
                Hangar_Despegue.setVisible(false);
                vVuelo_Aterrizaje.setVisible(false);

            }

        }

    }

}
