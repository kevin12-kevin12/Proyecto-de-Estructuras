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

    //Panel para agregar Aviones 
    public JPanel Panel_Agregar_Aviones = new JPanel();
    public JLabel Et1 = new JLabel();
    public JLabel Et_Modelo = new JLabel();
    public JLabel Et_Piloto = new JLabel();
    public JLabel Et_Pasajeros = new JLabel();
    public JLabel Et_Sobrecargos = new JLabel();
    public JTextField Campo_Modelo = new JTextField();
    public JTextField Campo_Piloto = new JTextField();
    public JTextField Campo_Sobrecargos = new JTextField();
    public JTextField Campo_Pasajeros = new JTextField();
    public JComboBox combo_Agregar_Aviones = new JComboBox();
    //Panel Principal
    public JPanel panel = new JPanel();
    //Panel donde va a estar la Jlist de aviones con su respectivo modelo y jCombobox
    public JPanel panel_Lista = new JPanel();
    public JScrollPane scrollpane;
    public JList lista_aviones = new JList();
    public DefaultListModel vModelo = new DefaultListModel();
    public JComboBox vCombo = new JComboBox();
    //Random Inicia del simulador
    public JButton Ingresar = new JButton("Empezar con un random de 10 a 25");
    //Botones para trasladar Aviones
    public JButton vVuelo_Aterrizaje = new JButton("Aterrizar el Avion seleccionaada");
    public JButton vAterrizaje_Hangar = new JButton("Desplazar el  Avion de Aterrizaje a Hangar");
    public JButton Hangar_Despegue = new JButton("Pasar el ultimo avion del Hangar a pista Despegue");
    //Boton para agregar un avion
    public JButton Agregar_Avion = new JButton("Agregar un avion");
    //Fondo de la interfaz grafica
    public JLabel vFondo = new JLabel();

    public JButton[][] vMBotones_Vuelo = new JButton[3][7];
    public JPanel vPanel_Vuelo = new JPanel(new GridLayout(3, 7, 30, 5));

    public Ventana2() {
        super("Lista");
        //Botones de la lista de vuelo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {

                vMBotones_Vuelo[i][j] = new JButton();
                vPanel_Vuelo.add(vMBotones_Vuelo[i][j]);
                vMBotones_Vuelo[i][j].addActionListener(new Manejador_1(this));

            }
        }
        //Panel donde se van a incluir los botones aviones de vuelo
        vPanel_Vuelo.setBounds(700, 20, 800, 200);
        vPanel_Vuelo.setVisible(false);
        //Panel donde se agrega el compenente Fondo de la interfaz grafica
        panel.setLayout(null);
        //Posicion y modelo de la Jlist de la lista de aviones 
        lista_aviones.setModel(vModelo);
        scrollpane = new JScrollPane(lista_aviones);
        scrollpane.setBounds(5, 45, 600, 200);
        scrollpane.setViewportView(lista_aviones);
        vFondo.add(scrollpane);
        JLabel vEti = new JLabel("Listas de Aviones:");
        vEti.setBounds(5, 5, 200, 20);
        vCombo.addItem("Lista de hangar");
        vCombo.addItem("Lista de Vuelo");
        vCombo.addItem("Lista de atrerrizaje");
        vCombo.addItem("Lista de Despegue");
        vCombo.setBounds(5, 25, 200, 20);
        //Posicion de los botones de trasladar los aviones
        Ingresar.setBounds(210, 25, 250, 20);
        Hangar_Despegue.setBounds(5, 250, 400, 20);
        Hangar_Despegue.setVisible(false);
        vVuelo_Aterrizaje.setBounds(5, 250, 400, 20);
        vVuelo_Aterrizaje.setVisible(false);
        //Posicion del boton agregar Aviones
        Agregar_Avion.setBounds(210, 25, 150, 20);
        //Manejadores de los botones 
        Ingresar.addActionListener(new Manejador_1(this));
        Hangar_Despegue.addActionListener(new Manejador_1(this));
        Agregar_Avion.addActionListener(new Manejador_1(this));
        vCombo.addActionListener(new Manejador_1(this));
        vVuelo_Aterrizaje.addActionListener(new Manejador_1(this));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
        //Anadir los componentes al fondo
        vFondo.add(vVuelo_Aterrizaje);
        vFondo.add(vCombo);
        vFondo.add(vEti);
        vFondo.add(scrollpane);
        vFondo.add(vPanel_Vuelo);
        vFondo.add(Ingresar);
        vFondo.add(Hangar_Despegue);
        vFondo.add(Agregar_Avion);
        //Ajustes prinsipales de la interfaz
        add(vFondo);
        setSize(1950, 1250);
        setVisible(true);
        add(panel);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
