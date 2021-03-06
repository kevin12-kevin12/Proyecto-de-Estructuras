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
    Lista_Modelos vModelos = new Lista_Modelos();

    @Override
    public void actionPerformed(ActionEvent e) {

        String vMod = (Frame.ComboModeloAviones.getSelectedItem().toString());
        if (vMod != "Agregar Modelo") {
            Frame.Campo_Modelo.setText(vMod);
        }
        if (e.getSource().equals(Frame.Agregar_Un_Avion)) {
            String vModelo = Frame.Campo_Modelo.getText();
            String vPiloto = Frame.Campo_Piloto.getText();
            String itemSeleecionado = (String) Frame.Combo_Agregar_Aviones.getSelectedItem();
            if (vModelo.length() >= 5) {
                Frame.Validacion1.setVisible(false);
                Frame.ComboModeloAviones.setVisible(true);
                if (vPiloto.length() >= 5) {
                    Frame.Validacion2.setVisible(false);
                    try {

                        int vPasajeros = Integer.parseInt(Frame.Campo_Pasajeros.getText());
                        try {

                            int vSobrecargos = Integer.parseInt(Frame.Campo_Sobrecargos.getText());

                            String pAvion = vModelo + vPasajeros + vSobrecargos + vPiloto;
                            boolean vBandera = vHangar.Igualador(pAvion);
                            System.out.println(vBandera);

                            if (vBandera == true) {

                                System.out.println("Avion existente en la lista");

                            } else {
                                if ("Hangar".equals(itemSeleecionado)) {

                                    int vOpcion = JOptionPane.showConfirmDialog(null, "Modelo: " + vModelo + "\nPiloto: " + vPiloto + "\nPasajeros: " + vPasajeros + "\nSobrecargos: " + vSobrecargos + "\n" + "Estas seguro que quieres agregar este avion a la lista de Hangar?");
                                    if (vOpcion == 0) {
                                        vHangar.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);

                                    }
                                    Frame.Hangar_Despegue.setVisible(false);
                                    Frame.vVuelo_Aterrizaje.setVisible(true);
                                    Frame.vModelo.removeAllElements();
                                    String[] vLista = vVuelo.RellenarArray();
                                    for (int i = 0; i < vLista.length; i++) {
                                        Frame.vModelo.addElement(vLista[i]);
                                    }
                                    vModelos.Agregar_modelo_Igualando(vModelo);
                                    Frame.Campo_Modelo.setText("");
                                    Frame.Campo_Pasajeros.setText("");
                                    Frame.Campo_Piloto.setText("");
                                    Frame.Campo_Sobrecargos.setText("");
                                    Frame.Agregar_Avion.setVisible(true);
                                    Frame.Panel_Agregar_Aviones.setVisible(false);
                                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);
                                    

                                } else if ("Vuelo".equals(itemSeleecionado)) {
                                    int vOpcion = JOptionPane.showConfirmDialog(null, "Modelo: " + vModelo + "\nPiloto: " + vPiloto + "\nPasajeros: " + vPasajeros + "\nSobrecargos: " + vSobrecargos + "\n" + "Estas seguro que quieres agregar este avion a la lista de Vuelo?");
                                    if (vOpcion == 0) {
                                        vVuelo.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);

                                    }
                                    Frame.Hangar_Despegue.setVisible(false);
                                    Frame.vVuelo_Aterrizaje.setVisible(true);
                                    Frame.vModelo.removeAllElements();
                                    String[] vLista = vVuelo.RellenarArray();
                                    for (int i = 0; i < vLista.length; i++) {
                                        Frame.vModelo.addElement(vLista[i]);
                                    }
                                    vModelos.Agregar_modelo_Igualando(vModelo);
                                    Frame.Campo_Modelo.setText("");
                                    Frame.Campo_Pasajeros.setText("");
                                    Frame.Campo_Piloto.setText("");
                                    Frame.Campo_Sobrecargos.setText("");
                                    Frame.Agregar_Avion.setVisible(true);
                                    Frame.Panel_Agregar_Aviones.setVisible(false);
                                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);

                                } else if ("Aterrizaje".equals(itemSeleecionado)) {
                                    int vOpcion = JOptionPane.showConfirmDialog(null, "Modelo: " + vModelo + "\nPiloto: " + vPiloto + "\nPasajeros: " + vPasajeros + "\nSobrecargos: " + vSobrecargos + "\n" + "Estas seguro que quieres agregar este avion a la lista de Aterrizaje?");
                                    if (vOpcion == 0) {
                                        vAterrizaje.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);

                                    }
                                    Frame.Hangar_Despegue.setVisible(false);
                                    Frame.vVuelo_Aterrizaje.setVisible(true);
                                    Frame.vModelo.removeAllElements();
                                    String[] vLista = vVuelo.RellenarArray();
                                    for (int i = 0; i < vLista.length; i++) {
                                        Frame.vModelo.addElement(vLista[i]);
                                    }
                                    vModelos.Agregar_modelo_Igualando(vModelo);
                                    Frame.Campo_Modelo.setText("");
                                    Frame.Campo_Pasajeros.setText("");
                                    Frame.Campo_Piloto.setText("");
                                    Frame.Campo_Sobrecargos.setText("");
                                    Frame.Agregar_Avion.setVisible(true);
                                    Frame.Panel_Agregar_Aviones.setVisible(false);
                                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);

                                } else if ("Despegue".equals(itemSeleecionado)) {

                                    int vOpcion = JOptionPane.showConfirmDialog(null, "Modelo: " + vModelo + "\nPiloto: " + vPiloto + "\nPasajeros: " + vPasajeros + "\nSobrecargos: " + vSobrecargos + "\n" + "Estas seguro que quieres agregar este avion a la lista de Despegue?");
                                    if (vOpcion == 0) {
                                        vDespegue.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);

                                    }
                                    Frame.Hangar_Despegue.setVisible(false);
                                    Frame.vVuelo_Aterrizaje.setVisible(true);
                                    Frame.vModelo.removeAllElements();
                                    String[] vLista = vVuelo.RellenarArray();
                                    for (int i = 0; i < vLista.length; i++) {
                                        Frame.vModelo.addElement(vLista[i]);
                                    }
                                    vModelos.Agregar_modelo_Igualando(vModelo);
                                    Frame.Campo_Modelo.setText("");
                                    Frame.Campo_Pasajeros.setText("");
                                    Frame.Campo_Piloto.setText("");
                                    Frame.Campo_Sobrecargos.setText("");
                                    Frame.Agregar_Avion.setVisible(true);
                                    Frame.Panel_Agregar_Aviones.setVisible(false);
                                    Frame.vBoton_AgregarAvion_especifico.setVisible(true);

                                }

                            }
                        } catch (NumberFormatException j) {
                            JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + j.getMessage());

                        }
                    } catch (NumberFormatException i) {
                        JOptionPane.showMessageDialog(null, "Error, el campo debe ser completado con números y no con carácteres.\n" + i.getMessage());
                    }
                } else {

                    Frame.Validacion2.setVisible(true);
                }

            } else {
                Frame.Validacion1.setVisible(true);
                Frame.ComboModeloAviones.setVisible(false);

            }
        }
        if (e.getSource().equals(Frame.Cancelar)) {
            Frame.Campo_Modelo.setText("");
            Frame.Campo_Pasajeros.setText("");
            Frame.Campo_Piloto.setText("");
            Frame.Campo_Sobrecargos.setText("");
            Frame.Agregar_Avion.setVisible(true);
            Frame.Panel_Agregar_Aviones.setVisible(false);
            Frame.vBoton_AgregarAvion_especifico.setVisible(true);
        }

    }
}
