package Funciones_Botones;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Aviones.*;
import Ventana.*;

public class Manejador_2 implements ActionListener {

    Ventana2 Frame;
    
    
    public Manejador_2(Ventana2 frame){
    
    this.Frame=frame;
    
    
    }
    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Vuelo vVuelo = new Lista_Vuelo();

    @Override
    public void actionPerformed(ActionEvent e) {

        String itemSeleecionado = (String) Frame.Combo_Agregar_Aviones.getSelectedItem();
        if ("hangar".equals(itemSeleecionado)) {

        
            

        }
        if ("Vuelo".equals(itemSeleecionado)) {

        

        }
        if ("Atrerrizaje".equals(itemSeleecionado)) {
          
    

        }
        if ("Despegue".equals(itemSeleecionado)) {

          

        }
    }

}
