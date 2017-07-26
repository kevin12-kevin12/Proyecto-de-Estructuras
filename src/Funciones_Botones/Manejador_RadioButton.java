package Funciones_Botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Aviones.*;
import Metodos_Funciones.Crear_Aviones_Cantidad_Random;
import Ventana.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Manejador_RadioButton implements ActionListener {

    Ventana2 Frame;

    public Manejador_RadioButton(Ventana2 frame) {

        this.Frame = frame;

    }

    Crear_Aviones_Cantidad_Random vMetodo_Especifico = new Crear_Aviones_Cantidad_Random();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Frame.E_Aceptar)) {
            boolean vR_Vuelo=Frame.R_Vuelo.isSelected();
            boolean vR_Hangar=Frame.R_Hangar.isSelected();
            boolean vR_Aterrizaje=Frame.R_Aterrizaje.isSelected();
            boolean vR_Despegue=Frame.R_Despegue.isSelected();
            //Combinacion de las 4 listas
            if (Frame.R_Aterrizaje.isSelected() && Frame.R_Despegue.isSelected() && Frame.R_Hangar.isSelected() && Frame.R_Vuelo.isSelected()) {

                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.AgregarCantidadPara4(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Vuelo.setSelected(false);
                    Frame.R_Aterrizaje.setSelected(false);
                    Frame.R_Hangar.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
                //Combinacion de 2 listas 
            }
            if (Frame.R_Despegue.isSelected() && Frame.R_Hangar.isSelected() && Frame.R_Vuelo.isSelected()&&vR_Aterrizaje==false) {
                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Despegue_Hangar_Vuelo(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Hangar.setSelected(false);
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Vuelo.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
             if (Frame.R_Despegue.isSelected() && Frame.R_Hangar.isSelected() && Frame.R_Aterrizaje.isSelected()&&vR_Vuelo==false) {
                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Despegue_Hangar_Aterrizaje(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Hangar.setSelected(false);
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Aterrizaje.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
           
           
            if (Frame.R_Aterrizaje.isSelected() && Frame.R_Despegue.isSelected()&&vR_Hangar==false&&vR_Vuelo==false) {
                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Despegue_Aterrizaje(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Aterrizaje.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
            if (Frame.R_Despegue.isSelected() && Frame.R_Hangar.isSelected()&&vR_Vuelo==false&&vR_Aterrizaje==false) {

                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Despegue_Hangar(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Hangar.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
            if (Frame.R_Despegue.isSelected() && Frame.R_Vuelo.isSelected()&&vR_Aterrizaje==false&&vR_Hangar==false) {

                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Despegue_Vuelo(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Despegue.setSelected(false);
                    Frame.R_Vuelo.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
            if (Frame.R_Vuelo.isSelected() && Frame.R_Aterrizaje.isSelected()&&vR_Despegue==false&&vR_Hangar==false) {
                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Vuelo_Aterrizaje(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Aterrizaje.setSelected(false);
                    Frame.R_Vuelo.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
            if (Frame.R_Vuelo.isSelected() && Frame.R_Hangar.isSelected()&&vR_Despegue==false&&vR_Aterrizaje==false) {

                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Vuelo_Hangar(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Hangar.setSelected(false);
                    Frame.R_Vuelo.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            }
            if (Frame.R_Hangar.isSelected() && Frame.R_Aterrizaje.isSelected()&&vR_Despegue==false&&vR_Vuelo==false) {

                try {
                    int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                    vMetodo_Especifico.Random_Hangar_Aterrizaje(vCantidad);
                    Frame.vPanel_Especifico.setVisible(false);
                    Frame.Agregar_Avion.setVisible(true);
                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                    Frame.vCampo_Especifico.setText("");
                    Frame.R_Hangar.setSelected(false);
                    Frame.R_Aterrizaje.setSelected(false);

                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                }
            } //Combinacion de 3 lsitas

        }

        if (e.getSource().equals(Frame.E_Cancelar)) {
            Frame.vPanel_Especifico.setVisible(false);
            Frame.Agregar_Avion.setVisible(true);
            Frame.vBoton_AgregarAvion_especifico.setVisible(true);

        }
    }

}
