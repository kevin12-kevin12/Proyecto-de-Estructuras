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
import javax.swing.plaf.basic.BasicArrowButton;

public class Ventana2 extends JFrame {

    //Etiquetas de validaciones
    public JLabel Validacion1 = new JLabel("*Nesecita al menos 5 caracteres");
    public JLabel Validacion2 = new JLabel("*Nesecita al menos 5 caracteres");
    //Panel para agregar Aviones
    
    public JButton Agregar_Un_Avion = new JButton("Agregar");
    public JButton Cancelar = new JButton("Cancelar");
    public JPanel Panel_Agregar_Aviones = new JPanel();
    public JLabel Et1 = new JLabel("Agregar a lista de:");
    public JLabel Et_Modelo = new JLabel("Modelo:");
    public JLabel Et_Piloto = new JLabel("Piloto:");
    public JLabel Et_Pasajeros = new JLabel("Pasajeros:");
    public JLabel Et_Sobrecargos = new JLabel("Sobrecargos:");
    public JTextField Campo_Modelo = new JTextField();
    public JTextField Campo_Piloto = new JTextField();
    public JTextField Campo_Sobrecargos = new JTextField();
    public JTextField Campo_Pasajeros = new JTextField();
    public JComboBox Combo_Agregar_Aviones = new JComboBox();
    public JComboBox ComboModeloAviones = new JComboBox();
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
        //Panel para agregar un avion
        Panel_Agregar_Aviones.setLayout(null);
        Et1.setBounds(0, 5, 150, 20);
        Et_Modelo.setBounds(0, 30, 50, 20);
        Campo_Modelo.setBounds(65, 30, 150, 20);
        ComboModeloAviones.setBounds(220, 30, 150, 20);
        Et_Piloto.setBounds(0, 55, 50, 20);
        Campo_Piloto.setBounds(65, 55, 150, 20);
        Et_Pasajeros.setBounds(0, 80, 70, 20);
        Campo_Pasajeros.setBounds(65, 80, 150, 20);
        Et_Sobrecargos.setBounds(0, 105, 80, 20);
        Campo_Sobrecargos.setBounds(80, 105, 150, 20);

        Combo_Agregar_Aviones.addItem("hangar");
        Combo_Agregar_Aviones.addItem("Vuelo");
        Combo_Agregar_Aviones.addItem("Atrerrizaje");
        Combo_Agregar_Aviones.addItem("Despegue");
        
//        for (int i = 0; i < vLista.length; i++) {
//            ComboModeloAviones.addItem(vLista[i]);
//        }

        Combo_Agregar_Aviones.setBounds(105, 5, 100, 20);
        Agregar_Un_Avion.setBounds(100, 130, 80, 30);
        Cancelar.setBounds(190, 130, 100, 30);
        //Etiquetas de validaciones 
        Validacion1.setBounds(220, 30, 200, 20);
        Validacion1.setForeground(Color.red);
        Validacion1.setVisible(false);
        Validacion2.setBounds(220, 55, 200, 20);
        Validacion2.setForeground(Color.red);
        Validacion2.setVisible(false);
        //Acciones de los botones
        Cancelar.addActionListener(new Manejador_2(this));
        ComboModeloAviones.addActionListener(new Manejador_2(this));

        Combo_Agregar_Aviones.addActionListener(new Manejador_2(this));
        Agregar_Un_Avion.addActionListener(new Manejador_2(this));
        //Alladir compnentes al panel de agregar un avion
        Panel_Agregar_Aviones.add(Combo_Agregar_Aviones);
        Panel_Agregar_Aviones.add(Et1);
        Panel_Agregar_Aviones.add(Et_Modelo);
        Panel_Agregar_Aviones.add(Campo_Modelo);
        Panel_Agregar_Aviones.add(Et_Piloto);
        Panel_Agregar_Aviones.add(Campo_Piloto);
        Panel_Agregar_Aviones.add(Et_Pasajeros);
        Panel_Agregar_Aviones.add(Campo_Pasajeros);
        Panel_Agregar_Aviones.add(Et_Sobrecargos);
        Panel_Agregar_Aviones.add(Campo_Sobrecargos);
        Panel_Agregar_Aviones.add(Agregar_Un_Avion);
        Panel_Agregar_Aviones.setBounds(5, 280, 430, 180);
        Panel_Agregar_Aviones.add(Validacion1);
        Panel_Agregar_Aviones.add(Validacion2);
        Panel_Agregar_Aviones.add(Cancelar);
        Panel_Agregar_Aviones.add(ComboModeloAviones);
        Panel_Agregar_Aviones.setVisible(false);
        //Panel donde se van a incluir los botones aviones de vuelo
        vPanel_Vuelo.setBounds(700, 20, 800, 200);
        vPanel_Vuelo.setVisible(false);
        //Panel donde se agrega el compenente Fondo de la interfaz grafica
        panel.setLayout(null);
        //Posicion y modelo de la Jlist de la lista de aviones 
        lista_aviones.setModel(vModelo);
        lista_aviones.setSelectionBackground(Color.ORANGE);
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
        vFondo.add(Panel_Agregar_Aviones);
        //Ajustes prinsipales de la interfaz

        add(vFondo);
        setSize(1950, 1250);
        Image icon1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/p.jpg"));
        setIconImage(icon1);
        setVisible(true);
        add(panel);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
