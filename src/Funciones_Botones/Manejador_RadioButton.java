package Funciones_Botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Aviones.*;
import Ventana.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Manejador_RadioButton implements ChangeListener {

    Ventana2 Frame;

    public Manejador_RadioButton(Ventana2 frame) {

        this.Frame = frame;

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }

}
