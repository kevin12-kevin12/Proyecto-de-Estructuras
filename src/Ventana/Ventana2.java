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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicArrowButton;

public class Ventana2 extends JFrame  {

    //Boton para Agregar una cantidad espesifica con random para cada lista panel para agregar en especifico  
    public JLabel Eti2_Esp = new JLabel("Digite un numero para el random:");
    public JLabel Eti1_Espe = new JLabel("Random a:");
    public JButton E_Cancelar = new JButton("Cancelar");
    public JButton E_Aceptar = new JButton("Aceptar");
    public JButton vBoton_AgregarAvion_especifico = new JButton("Agregar cantidad Especifica");
    public JTextField vCampo_Especifico = new JTextField();
    public JPanel vPanel_Especifico = new JPanel();
    public JRadioButton R_Vuelo = new JRadioButton("Vuelo");
    public JRadioButton R_Aterrizaje = new JRadioButton("Aterrizaje");
    public JRadioButton R_Hangar = new JRadioButton("Hangar");
    public JRadioButton R_Despegue = new JRadioButton("Despegue");
    public ButtonGroup vBoton_Grup = new ButtonGroup();
    //Etiquetas de validaciones
    public JLabel Validacion1 = new JLabel("*Necesita al menos 5 caracteres");
    public JLabel Validacion2 = new JLabel("*Necesita al menos 5 caracteres");
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
        //Posicion agregar 
        //Botones de la lista de vuelo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {

                vMBotones_Vuelo[i][j] = new JButton();
                vPanel_Vuelo.add(vMBotones_Vuelo[i][j]);
                vMBotones_Vuelo[i][j].addActionListener(new Manejador_1(this));

            }
        }
        // Panel Agregar aviones en especifico
        vPanel_Especifico.setLayout(null);
        Eti1_Espe.setBounds(210, 0, 100, 20);
        R_Vuelo.setBounds(260, 20, 100, 20);
        R_Hangar.setBounds(260, 50, 100, 20);
        R_Despegue.setBounds(260, 80, 100, 20);
        R_Aterrizaje.setBounds(260, 110, 100, 20);
        E_Aceptar.setBounds(50, 140, 100, 20);
        E_Cancelar.setBounds(160, 140, 100, 20);
        vCampo_Especifico.setBounds(10, 60, 100, 20);
        Eti2_Esp.setBounds(10, 30, 200, 20);
        vPanel_Especifico.setBounds(5, 280, 430, 180);
//        vBoton_Grup.add(R_Vuelo);
//        vBoton_Grup.add(R_Hangar);
//        vBoton_Grup.add(R_Despegue);
//        vBoton_Grup.add(R_Aterrizaje);
        vPanel_Especifico.add(Eti2_Esp);
        vPanel_Especifico.add(vCampo_Especifico);
        vPanel_Especifico.add(Eti1_Espe);
        vPanel_Especifico.add(E_Cancelar);
        vPanel_Especifico.add(E_Aceptar);
        vPanel_Especifico.add(R_Aterrizaje);
        vPanel_Especifico.add(R_Despegue);
        vPanel_Especifico.add(R_Hangar);
        vPanel_Especifico.add(R_Vuelo);
        vPanel_Especifico.setVisible(false);

        //Acciones de los radioButton
        R_Aterrizaje.addActionListener(new Manejador_RadioButton(this));
        R_Despegue.addActionListener(new Manejador_RadioButton(this));
        R_Hangar.addActionListener(new Manejador_RadioButton(this));
        R_Vuelo.addActionListener(new Manejador_RadioButton(this));
        // Accion de los botones del manejador 3
        E_Aceptar.addActionListener(new Manejador_RadioButton(this));
        E_Cancelar.addActionListener(new Manejador_RadioButton(this));
        vBoton_AgregarAvion_especifico.addActionListener(new Manejador_3(this));

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

        Combo_Agregar_Aviones.addItem("Hangar");
        Combo_Agregar_Aviones.addItem("Vuelo");
        Combo_Agregar_Aviones.addItem("Aterrizaje");
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
        //Acciones de los botones manejador 2
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
        lista_aviones.setBackground(Color.lightGray);
        scrollpane = new JScrollPane(lista_aviones);
        scrollpane.setBounds(650, 45, 650, 500);
        scrollpane.setViewportView(lista_aviones);
        vFondo.add(scrollpane);
        JLabel vEti = new JLabel("Listas de Aviones:");
        vEti.setBounds(650, 5, 200, 20);
        vCombo.addItem("Lista de hangar");
        vCombo.addItem("Lista de Vuelo");
        vCombo.addItem("Lista de atrerrizaje");
        vCombo.addItem("Lista de Despegue");
        vCombo.setBounds(650, 25, 200, 20);
        vCombo.setBackground(Color.lightGray);
        //Posicion de los botones de trasladar los aviones
        Ingresar.setBounds(860, 25, 250, 20);
        Hangar_Despegue.setBounds(650, 550, 400, 20);
        Hangar_Despegue.setVisible(false);
        vVuelo_Aterrizaje.setBounds(660, 550, 400, 20);
        vVuelo_Aterrizaje.setVisible(false);
        //Boton Agregar en especifico configuracion
        vBoton_AgregarAvion_especifico.setBounds(1020, 25, 200, 20);
        vBoton_AgregarAvion_especifico.setVisible(false);
        vBoton_AgregarAvion_especifico.setBackground(Color.lightGray);
        //Posicion del boton agregar Aviones
        Agregar_Avion.setBounds(860, 25, 150, 20);
        Agregar_Avion.setBackground(Color.lightGray);
        
        //Manejadores de los botones 1
        Ingresar.addActionListener(new Manejador_1(this));
        Hangar_Despegue.addActionListener(new Manejador_1(this));
        Agregar_Avion.addActionListener(new Manejador_1(this));
        vCombo.addActionListener(new Manejador_1(this));
        
        vVuelo_Aterrizaje.addActionListener(new Manejador_1(this));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
        //Anadir los componentes al fondo
        vFondo.add(vPanel_Especifico);
        vFondo.add(vBoton_AgregarAvion_especifico);
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
