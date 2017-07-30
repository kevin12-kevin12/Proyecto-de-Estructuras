



package Funciones_Botones;

import Metodos_Funciones.Aviones_Creacion;
import Aviones.Lista_Aterrizaje;
import Aviones.Lista_Despegue;
import Aviones.Lista_Hangar;
import Aviones.Lista_Vuelo;
import Metodos_Funciones.CrearAvionesRandom;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import Ventana.*;

public class Manejador_0 implements ActionListener {

    private INICIO frame;
   

    public Manejador_0(INICIO frame) {

        this.frame = frame;
        
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frame.boton1)) {

            
            Ventana2 vInterfaz = new Ventana2();
            vInterfaz.setVisible(true);
            frame.dispose();
            
        }

    }

}
