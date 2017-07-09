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
            if ("hangar".equals(itemSeleecionado)) {

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

                                    boolean vBandera = vHangar.Igualador(vModelo, vPiloto, vPasajeros, vSobrecargos);
                                    if (vBandera == true) {
                                        
                                        
                                         int vOpcion2 = JOptionPane.showConfirmDialog(null, "Ya hay un avion con las mismas caracteristicas, quieres \nagregarlo sin importar que ya un avion tenga las mismas caracteristicas");

                                        if (vOpcion2 == 0) {
                                            System.out.println("si");
                                        } else {
                                            System.out.println("no");

                                        }

                                    } else {
                                        vHangar.AgregarAlFinal(vModelo, vPasajeros, vSobrecargos, vPiloto);
                                        
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
            if ("Vuelo".equals(itemSeleecionado)) {

            }
            if ("Atrerrizaje".equals(itemSeleecionado)) {

            }
            if ("Despegue".equals(itemSeleecionado)) {

            }
        }
    }

}
