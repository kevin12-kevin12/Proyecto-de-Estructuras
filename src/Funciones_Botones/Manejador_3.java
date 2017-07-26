package Funciones_Botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Aviones.*;
import Ventana.*;

public class Manejador_3 implements ActionListener {

    Ventana2 Frame;

    public Manejador_3(Ventana2 frame) {

        this.Frame = frame;

    }
    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Vuelo vVuelo = new Lista_Vuelo();
    Lista_Modelos vModelos = new Lista_Modelos();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Frame.vBoton_AgregarAvion_especifico)) {
            Frame.vPanel_Especifico.setVisible(true);
            Frame.Agregar_Avion.setVisible(false);
            Frame.vBoton_AgregarAvion_especifico.setVisible(false);
        }
       

    }
}
