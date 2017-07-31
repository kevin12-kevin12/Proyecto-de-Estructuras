package Funciones_Botones;

import Metodos_Funciones.Crear_Aviones_Cantidad_Random;
import Ventana.Ventana2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Manejador_JCheckBox implements ActionListener {

    Ventana2 Frame;

    public Manejador_JCheckBox(Ventana2 frame) {

        this.Frame = frame;

    }
    Crear_Aviones_Cantidad_Random vMetodo_Especifico = new Crear_Aviones_Cantidad_Random();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Frame.BotoCheck)) {

            boolean vR_Vuelo = Frame.Opcion_Vuelo.isSelected();
            boolean vR_Hangar = Frame.Opcion_Hangar.isSelected();
            boolean vR_Aterrizaje = Frame.Opcion_Aterrizaje.isSelected();
            boolean vR_Despegue = Frame.Opcion_Despegue.isSelected();
            //Cuando solo da check a solo uno de los cuatro
            if (Frame.Opcion_Aterrizaje.isSelected() && vR_Despegue == false && vR_Hangar == false && vR_Vuelo == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Agregar_Solo_Aterrizaje(vCantidad);
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.vCampo_Especifico.setText("");
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }

                }
            }
            if (Frame.Opcion_Vuelo.isSelected() && vR_Despegue == false && vR_Hangar == false && vR_Aterrizaje == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Agregar_Solo_Vuelo(vCantidad);
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.vCampo_Especifico.setText("");
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }
            }
            if (Frame.Opcion_Hangar.isSelected() && vR_Despegue == false && vR_Aterrizaje == false && vR_Vuelo == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Agregar_Solo_Hangar(vCantidad);
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.vCampo_Especifico.setText("");
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }
            }
            if (Frame.Opcion_Despegue.isSelected() && vR_Hangar == false && vR_Aterrizaje == false && vR_Vuelo == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Agregar_Solo_Despegue(vCantidad);
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.vCampo_Especifico.setText("");
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            //Cuando le da check a los 4
            if (Frame.Opcion_Aterrizaje.isSelected() && Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Hangar.isSelected() && Frame.Opcion_Vuelo.isSelected()) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.AgregarCantidadPara4(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            //cuando da check  a solo 3
            if (Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Hangar.isSelected() && Frame.Opcion_Vuelo.isSelected() && vR_Aterrizaje == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Despegue_Hangar_Vuelo(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Hangar.isSelected() && Frame.Opcion_Aterrizaje.isSelected() && vR_Vuelo == false) {
                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Despegue_Hangar_Aterrizaje(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }
            }
            if (Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Vuelo.isSelected() && Frame.Opcion_Aterrizaje.isSelected() && vR_Hangar == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Vuelo_Aterrizaje_Despegue(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Vuelo.isSelected() && Frame.Opcion_Hangar.isSelected() && Frame.Opcion_Aterrizaje.isSelected() && vR_Despegue == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Vuelo_Hangar_Aterrizaje(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            //cl

            if (Frame.Opcion_Aterrizaje.isSelected() && Frame.Opcion_Despegue.isSelected() && vR_Hangar == false && vR_Vuelo == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Despegue_Aterrizaje(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Aterrizaje.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Hangar.isSelected() && vR_Vuelo == false && vR_Aterrizaje == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Despegue_Hangar(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Hangar.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Despegue.isSelected() && Frame.Opcion_Vuelo.isSelected() && vR_Aterrizaje == false && vR_Hangar == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Despegue_Vuelo(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Despegue.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Vuelo.isSelected() && Frame.Opcion_Aterrizaje.isSelected() && vR_Despegue == false && vR_Hangar == false) {
                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Vuelo_Aterrizaje(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Aterrizaje.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Vuelo.isSelected() && Frame.Opcion_Hangar.isSelected() && vR_Despegue == false && vR_Aterrizaje == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {

                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Vuelo_Hangar(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }
            if (Frame.Opcion_Hangar.isSelected() && Frame.Opcion_Aterrizaje.isSelected() && vR_Despegue == false && vR_Vuelo == false) {

                if (Frame.vCampo_Especifico.getText().equals("")) {

                    Frame.Validacion_Campo_Vacio.setVisible(true);

                } else {
                    Frame.Validacion_Campo_Vacio.setVisible(false);
                    try {
                        int vCantidad = Integer.parseInt(Frame.vCampo_Especifico.getText());
                        vMetodo_Especifico.Random_Hangar_Aterrizaje(vCantidad);
                        Frame.vPanel_Especifico.setVisible(false);
                        Frame.Agregar_Avion.setVisible(true);
                        Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                        Frame.vCampo_Especifico.setText("");
                        Frame.Opcion_Hangar.setSelected(false);
                        Frame.Opcion_Vuelo.setSelected(false);

                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                }

            }

        }
        if (e.getSource().equals(Frame.E_Cancelar)) {
            Frame.vPanel_Especifico.setVisible(false);
            Frame.Agregar_Avion.setVisible(true);
            Frame.vBoton_AgregarAvion_especifico.setVisible(true);
            Frame.Opcion_Despegue.setSelected(false);
            Frame.Opcion_Vuelo.setSelected(false);
            Frame.Opcion_Aterrizaje.setSelected(false);
            Frame.Opcion_Hangar.setSelected(false);

        }
    }

}
