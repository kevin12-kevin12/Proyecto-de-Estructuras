package Funciones_Botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Aviones.*;
import Ventana.*;

public class Manejador_2 implements ActionListener {

    Ventana2 Frame;

    public Manejador_2(Ventana2 frame) {

        this.Frame = frame;

    }
    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Vuelo vVuelo = new Lista_Vuelo();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Frame.Agregar_Un_Avion)) {
            String vModelo = Frame.Campo_Modelo.getText();
            String vPiloto = Frame.Campo_Piloto.getText();
            String itemSeleecionado = (String) Frame.Combo_Agregar_Aviones.getSelectedItem();
            if (vModelo.length() >= 5) {
                Frame.Validacion1.setVisible(false);
                if (vPiloto.length() >= 5) {
                    Frame.Validacion2.setVisible(false);
                    try {

                        int vPasajeros = Integer.parseInt(Frame.Campo_Pasajeros.getText());
                        try {

                            int vSobrecargos = Integer.parseInt(Frame.Campo_Sobrecargos.getText());
                            int vOpcion = JOptionPane.showConfirmDialog(null, "Modelo: " + vModelo + "\nPiloto: " + vPiloto + "\nPasajeros: " + vPasajeros + "\nSobrecargos: " + vSobrecargos + "\nEsta Seguro que quieres agregar el avion a la lista del Hangar\nse agregara de ultimo con los datos ingresados?");

                            if (vOpcion == 0) {

                                String pAvion = vModelo + vPasajeros + vSobrecargos + vPiloto;
                                boolean vBandera = vHangar.Igualador(pAvion);
                                System.out.println(vBandera);

                                if (vBandera == true) {

                                    JOptionPane.showMessageDialog(null, "Ya hay un avion con las mismas caracteristicas\n compruebe con otras cracteristicas");

                                } else {

                                    if ("hangar".equals(itemSeleecionado)) {
                                        vHangar.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);
                                        Frame.vModelo.removeAllElements();
                                        String[] vLista = vHangar.RellenarArray();

                                        for (int i = vLista.length - 1; i >= 0; i--) {
                                            Frame.vModelo.addElement(vLista[i]);

                                        }
                                        Frame.Campo_Modelo.setText("");
                                        Frame.Campo_Pasajeros.setText("");
                                        Frame.Campo_Piloto.setText("");
                                        Frame.Campo_Sobrecargos.setText("");
                                        Frame.Agregar_Avion.setVisible(true);
                                        Frame.Panel_Agregar_Aviones.setVisible(false);
                                    } else if ("Vuelo".equals(itemSeleecionado)) {

                                    } else if ("Atrerrizaje".equals(itemSeleecionado)) {

                                    } else if ("Despegue".equals(itemSeleecionado)) {

                                    }
                                }

                            } else {
                                System.out.println("No");
                            }
                        } catch (NumberFormatException j) {
                            JOptionPane.showMessageDialog(null, "Error" + j.getMessage());

                        }
                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error" + i.getMessage());
                    }
                } else {

                    Frame.Validacion2.setVisible(true);
                }

            } else {
                Frame.Validacion1.setVisible(true);

            }
        }
        if (e.getSource().equals(Frame.Cancelar)) {
            Frame.Campo_Modelo.setText("");
            Frame.Campo_Pasajeros.setText("");
            Frame.Campo_Piloto.setText("");
            Frame.Campo_Sobrecargos.setText("");
            Frame.Agregar_Avion.setVisible(true);
            Frame.Panel_Agregar_Aviones.setVisible(false);
        }
    }
}