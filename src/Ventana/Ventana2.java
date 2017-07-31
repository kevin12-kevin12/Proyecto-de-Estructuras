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
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicArrowButton;

public class Ventana2 extends JFrame {

    //JCheckBox
    public JCheckBox Opcion_Vuelo = new JCheckBox("Vuelo");
    public JCheckBox Opcion_Hangar = new JCheckBox("Hangar");
    public JCheckBox Opcion_Aterrizaje = new JCheckBox("Aterrizaje");
    public JCheckBox Opcion_Despegue = new JCheckBox("Despegue");
    public JButton BotoCheck = new JButton();

    //Bordes
    public Border Borde_Botones = new LineBorder(Color.BLACK);

    //Boton para Agregar una cantidad espesifica con random para cada lista panel para agregar en especifico  
    public Border borde_panel_Random = new TitledBorder(new EtchedBorder(), "Agregar aleatorio");
    public JLabel Eti2_Esp = new JLabel("Digite un numeró"
            + ""
            + " para el aleatorio:");
    public JLabel Eti1_Espe = new JLabel("aleatorio a:");
    public JButton E_Cancelar = new JButton();

    public JButton vBoton_AgregarAvion_especifico = new JButton("Agregar cantidad aleatorio");
    public JTextField vCampo_Especifico = new JTextField();
    public JPanel vPanel_Especifico = new JPanel();

    //Etiquetas de validaciones
    public JLabel Validacion1 = new JLabel("*Necesita al menos 5 caracteres");
    public JLabel Validacion2 = new JLabel("*Necesita al menos 5 caracteres");
    public JLabel Validacion_Campo_Vacio = new JLabel("Campo vació");
    //Panel para agregar Aviones
    public Border borde_Panel_Un_Avion = new TitledBorder(new LineBorder(Color.BLACK), "Agregar un Avión");
    public JButton Agregar_Un_Avion = new JButton();
    public JButton Cancelar = new JButton();
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
    public JButton Ingresar = new JButton("Empezar con un aleatorio de 10 a 25");
    //Botones para trasladar Aviones
    public JButton vVuelo_Aterrizaje = new JButton();
    public JButton vAterrizaje_Hangar = new JButton();
    public JButton Hangar_Despegue = new JButton();
    public JButton Despegue_Vuelo = new JButton();
    //Boton para agregar un avion
    public JButton Agregar_Avion = new JButton("Agregar un avión");
    //Fondo de la interfaz grafica
    public JLabel vFondo = new JLabel();

    public JButton[][] vMBotones_Vuelo = new JButton[3][7];
    public JPanel vPanel_Vuelo = new JPanel(new GridLayout(3, 7, 30, 5));

    public Ventana2() {
        super("Lista");

        // Panel Agregar aviones en especifico
        //Configuracion de los JCheckbox
        vPanel_Especifico.setLayout(null);
        vCampo_Especifico.setBounds(10, 60, 100, 20);
        Validacion_Campo_Vacio.setBounds(115, 60, 100, 20);
        Validacion_Campo_Vacio.setForeground(Color.red);
        Validacion_Campo_Vacio.setVisible(false);
        Eti2_Esp.setBounds(10, 30, 200, 20);
        Eti1_Espe.setBounds(210, 5, 100, 20);
        Opcion_Aterrizaje.setBounds(260, 20, 80, 20);
        Opcion_Despegue.setBounds(260, 50, 100, 20);
        Opcion_Hangar.setBounds(260, 80, 80, 20);
        Opcion_Vuelo.setBounds(260, 110, 80, 20);
        BotoCheck.setBounds(20, 120, 100, 40);
        BotoCheck.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ACEPTAR2.jpg")));
        E_Cancelar.setBounds(130, 120, 100, 40);
        E_Cancelar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/CANCELAR1.jpg")));
        vPanel_Especifico.add(Opcion_Aterrizaje);
        vPanel_Especifico.add(Opcion_Despegue);
        vPanel_Especifico.add(Opcion_Hangar);
        vPanel_Especifico.add(Opcion_Vuelo);
        vPanel_Especifico.add(E_Cancelar);
        vPanel_Especifico.add(BotoCheck);
        vPanel_Especifico.add(Validacion_Campo_Vacio);
        vPanel_Especifico.add(Eti2_Esp);
        vPanel_Especifico.add(vCampo_Especifico);
        vPanel_Especifico.add(Eti1_Espe);
        vPanel_Especifico.setBorder(borde_panel_Random);
        vPanel_Especifico.setBounds(650, 620, 430, 180);
        vPanel_Especifico.setVisible(false);
        //Acciones del manejador jcheckbox
        BotoCheck.addActionListener(new Manejador_JCheckBox(this));
        Opcion_Aterrizaje.addActionListener(new Manejador_JCheckBox(this));
        Opcion_Despegue.addActionListener(new Manejador_JCheckBox(this));
        Opcion_Hangar.addActionListener(new Manejador_JCheckBox(this));
        Opcion_Vuelo.addActionListener(new Manejador_JCheckBox(this));
        E_Cancelar.addActionListener(new Manejador_JCheckBox(this));

        vBoton_AgregarAvion_especifico.addActionListener(new Manejador_1(this));

        //Panel para agregar un avion
        Panel_Agregar_Aviones.setLayout(null);
        Et1.setBounds(5, 15, 150, 20);
        Et_Modelo.setBounds(5, 50, 50, 20);
        Campo_Modelo.setBounds(70, 50, 150, 20);
        ComboModeloAviones.setBounds(220, 50, 150, 20);
        Et_Piloto.setBounds(5, 75, 50, 20);
        Campo_Piloto.setBounds(70, 75, 150, 20);
        Et_Pasajeros.setBounds(5, 100, 70, 20);
        Campo_Pasajeros.setBounds(70, 100, 150, 20);
        Et_Sobrecargos.setBounds(5, 120, 80, 20);
        Campo_Sobrecargos.setBounds(85, 120, 150, 20);

        Combo_Agregar_Aviones.addItem("Hangar");
        Combo_Agregar_Aviones.addItem("Vuelo");
        Combo_Agregar_Aviones.addItem("Aterrizaje");
        Combo_Agregar_Aviones.addItem("Despegue");

        Combo_Agregar_Aviones.setBounds(115,15, 100, 20);
        Agregar_Un_Avion.setBounds(100, 155, 100, 40);
        Agregar_Un_Avion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ACEPTAR2.jpg")));
        Agregar_Avion.setBorder(Borde_Botones);
        Cancelar.setBounds(210, 155, 100, 40);
        Cancelar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/CANCELAR1.jpg")));
        //Etiquetas de validaciones 
        Validacion1.setBounds(220, 50, 200, 20);
        Validacion1.setForeground(Color.red);
        Validacion1.setVisible(false);
        Validacion2.setBounds(220, 75, 200, 20);
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
        Panel_Agregar_Aviones.setBounds(650, 620, 450, 220);
        Panel_Agregar_Aviones.add(Validacion1);
        Panel_Agregar_Aviones.add(Validacion2);
        Panel_Agregar_Aviones.add(Cancelar);
        Panel_Agregar_Aviones.add(ComboModeloAviones);
        Panel_Agregar_Aviones.setBorder(borde_Panel_Un_Avion);
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
        JLabel vEti = new JLabel("Listas de Aviónes:");
        vEti.setBounds(650, 5, 200, 20);
        vCombo.addItem("Lista de Hangar");
        vCombo.addItem("Lista de Vuelo");
        vCombo.addItem("Lista de Aterrizaje");
        vCombo.addItem("Lista de Despegue");
        vCombo.setBounds(650, 25, 200, 20);
        vCombo.setBackground(Color.lightGray);
        //Posicion de los botones de trasladar los aviones
        Ingresar.setBounds(860, 25, 250, 20);
        Hangar_Despegue.setBounds(650, 550, 400, 40);
        Hangar_Despegue.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Traslado.png")));
        Hangar_Despegue.setVisible(false);
        vVuelo_Aterrizaje.setBounds(650, 550, 300, 45);
        vVuelo_Aterrizaje.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ATERRIZAR1.png")));
        vVuelo_Aterrizaje.setVisible(false);
        vAterrizaje_Hangar.setBounds(650, 550, 400, 40);
        vAterrizaje_Hangar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ATERRIZAJE.png")));
        vAterrizaje_Hangar.setVisible(false);
        Despegue_Vuelo.setBounds(650, 550, 300, 45);
        Despegue_Vuelo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/DESPEGAR1.png")));
        Despegue_Vuelo.setVisible(false);
        //Boton Agregar en especifico configuracion
        vBoton_AgregarAvion_especifico.setBounds(1020, 25, 200, 20);
        vBoton_AgregarAvion_especifico.setBorder(Borde_Botones);
        vBoton_AgregarAvion_especifico.setVisible(false);
        vBoton_AgregarAvion_especifico.setBackground(Color.lightGray);
        //Posicion del boton agregar Aviones
        Agregar_Avion.setBounds(860, 25, 150, 20);
        Agregar_Avion.setBackground(Color.lightGray);

        //Manejadores de los botones 1
        Despegue_Vuelo.addActionListener(new Manejador_1(this));
        Ingresar.addActionListener(new Manejador_1(this));
        Hangar_Despegue.addActionListener(new Manejador_1(this));
        vAterrizaje_Hangar.addActionListener(new Manejador_1(this));
        Agregar_Avion.addActionListener(new Manejador_1(this));
        vCombo.addActionListener(new Manejador_1(this));

        vVuelo_Aterrizaje.addActionListener(new Manejador_1(this));
        vFondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
        //Anadir los componentes al fondo
        vFondo.add(Despegue_Vuelo);

        vFondo.add(vAterrizaje_Hangar);
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
