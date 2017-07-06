package Metodos_Funciones;

import Aviones.Lista_Aterrizaje;
import Aviones.Lista_Despegue;
import Aviones.Lista_Hangar;
import Aviones.Lista_Vuelo;
import Ventana.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class CrearAvionesRandom {

    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Vuelo vVuelo = new Lista_Vuelo();
    Aviones_Creacion vMetodo = new Aviones_Creacion();

    public void AgregarAviones() {
        Random vRandom = new Random();
        int vRandom1 = 10 + vRandom.nextInt(15);
        int vCDespegue = vRandom.nextInt(vRandom1);
        //JOptionPane.showMessageDialog(null, "Se añadieron: "+vCDespegue+" de aviones al Despegue");
        for (int i = 0; i < vCDespegue; i++) {

            vDespegue.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

        }
        int vRandom2 = vRandom1 - vCDespegue;
        int vCHangar = vRandom.nextInt(vRandom2);
        //JOptionPane.showMessageDialog(null, "Se añadieron: "+vCHangar+" de aviones al Hangar");
        for (int i = 0; i < vCHangar; i++) {

            vHangar.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

        }
        int vRandom3 = vRandom2 - vCHangar;
        int vCAterrizaje = vRandom.nextInt(vRandom3);
        //JOptionPane.showMessageDialog(null, "Se añadieron: "+vCAterrizaje+" de aviones al Aterrizaje");
        for (int i = 0; i < vCAterrizaje; i++) {

            vAterrizaje.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

        }
        int vCVuelo = vRandom3 - vCAterrizaje;
        JOptionPane.showMessageDialog(null, "Se añadieron: "+vCVuelo+" de aviones al Vuelo\n"+"Se añadieron:"+vCAterrizaje+" de aviones al Aterrizaje\n"+"Se añadieron: "+vCHangar+" de aviones al Hangar\n"+"Se añadieron: "+vCDespegue+" de aviones al Despegue");
        for (int i = 0; i < vCVuelo; i++) {
            vVuelo.AgregarAlFinal(vMetodo.getModeloAvion(), vMetodo.getPasajeros(), vMetodo.getSobrecargos(), vMetodo.getNombrePiloto());

        }

    }

}
