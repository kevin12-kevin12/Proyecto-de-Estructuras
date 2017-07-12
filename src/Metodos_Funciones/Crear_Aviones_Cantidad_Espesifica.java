package Metodos_Funciones;

import Aviones.*;
import Ventana.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Crear_Aviones_Cantidad_Espesifica {

    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Vuelo vVuelo = new Lista_Vuelo();
    Aviones_Creacion vAvion = new Aviones_Creacion();

    public void AgregarCantidadEspecifica(int vDato) {

        Random vRandom = new Random();
        int vCVuelovRandom1 = vRandom.nextInt(vDato);
        for (int i = 0; i < vCVuelovRandom1; i++) {

            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }

        int vRandon2 = vDato - vCVuelovRandom1;
        int vCDespegue = vRandom.nextInt(vRandon2);
        for (int i = 0; i < vCDespegue; i++) {
            
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }

    }

}
