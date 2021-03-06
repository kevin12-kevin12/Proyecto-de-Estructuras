package Metodos_Funciones;

import Aviones.*;
import Ventana.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Crear_Aviones_Cantidad_Random {

    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Vuelo vVuelo = new Lista_Vuelo();
    Aviones_Creacion vAvion = new Aviones_Creacion();

    public void AgregarCantidadPara4(int vDato) {

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
        int vRandom3 = vRandon2 - vCDespegue;
        int vCHangar = vRandom.nextInt(vRandom3);
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCAterrizaje = vRandom3 - vCHangar;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vTotal = +vCAterrizaje + vCDespegue + vCVuelovRandom1 + vCHangar;
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCVuelovRandom1 + " de aviones al Vuelo\n" + "Se añadieron:" + vCAterrizaje + " de aviones al Aterrizaje\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Se añadieron: " + vCDespegue + " de aviones al Despegue\n" + "Total Agregados:" + vTotal);
    }

    public void Random_Despegue_Aterrizaje(int pDato) {
        Random vRandom = new Random();
        int vCDespegue = vRandom.nextInt(pDato);
        for (int i = 0; i < vCDespegue; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCAterrizaje = pDato - vCDespegue;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCDespegue + " de aviones al despegue\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Despegue_Hangar(int pDato) {
        Random vRandom = new Random();
        int vCDespegue = vRandom.nextInt(pDato);
        for (int i = 0; i < vCDespegue; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCHangar = pDato - vCDespegue;
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCDespegue + " de aviones al despegue\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Total de aviones creados:" + pDato);

    }

    public void Random_Despegue_Vuelo(int pDato) {

        Random vRandom = new Random();
        int vCDespegue = vRandom.nextInt(pDato);
        for (int i = 0; i < vCDespegue; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCVuelo = pDato - vCDespegue;
        for (int i = 0; i < vCVuelo; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCDespegue + " de aviones al despegue\n" + "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Vuelo_Hangar(int pDato) {
        Random vRandom = new Random();
        int vCVuelo = vRandom.nextInt(pDato);
        for (int i = 0; i < vCVuelo; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCHangar = pDato - vCVuelo;
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Vuelo_Aterrizaje(int pDato) {
        Random vRandom = new Random();
        int vCVuelo = vRandom.nextInt(pDato);
        for (int i = 0; i < vCVuelo; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCAterrizaje = pDato - vCVuelo;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Hangar_Aterrizaje(int pDato) {

        Random vRandom = new Random();
        int vCHangar = vRandom.nextInt(pDato);
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int vCAterrizaje = pDato - vCHangar;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Despegue_Hangar_Vuelo(int pDato) {

        Random vRandom = new Random();
        int vCDespegue = vRandom.nextInt(pDato);
        for (int i = 0; i < vCDespegue; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int CRandom1 = pDato - vCDespegue;
        int vCHangar = vRandom.nextInt(CRandom1);
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }

        int vCVuelo = CRandom1 - vCHangar;
        for (int i = 0; i < vCDespegue; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCDespegue + " de aviones al Despegue\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Total de aviones creados:" + pDato);

    }

    public void Random_Despegue_Hangar_Aterrizaje(int pDato) {

        Random vRandom = new Random();
        int vCDespegue = vRandom.nextInt(pDato);
        for (int i = 0; i < vCDespegue; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int CRandom1 = pDato - vCDespegue;
        int vCHangar = vRandom.nextInt(CRandom1);
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }

        int vCAterrizaje = CRandom1 - vCHangar;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCDespegue + " de aviones al Despegue\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Total de aviones creados:" + pDato);

    }

    public void Random_Vuelo_Hangar_Aterrizaje(int pDato) {

        Random vRandom = new Random();
        int vCVuelo = vRandom.nextInt(pDato);
        for (int i = 0; i < vCVuelo; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int CRandom1 = pDato - vCVuelo;
        int vCHangar = vRandom.nextInt(CRandom1);
        for (int i = 0; i < vCHangar; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }

        int vCAterrizaje = CRandom1 - vCHangar;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Se añadieron: " + vCHangar + " de aviones al Hangar\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Total de aviones creados:" + pDato);
    }

    public void Random_Vuelo_Aterrizaje_Despegue(int pDato) {
        Random vRandom = new Random();
        int vCVuelo = vRandom.nextInt(pDato);
        for (int i = 0; i < vCVuelo; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        int CRandom1 = pDato - vCVuelo;
        int vCAterrizaje = vRandom.nextInt(CRandom1);
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());
        }

        int vCDespegue = CRandom1 - vCAterrizaje;
        for (int i = 0; i < vCAterrizaje; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se añadieron: " + vCVuelo + " de aviones al Vuelo\n" + "Se añadieron: " + vCAterrizaje + " de aviones al Aterrizaje\n" + "Se añadieron: " + vCDespegue + " de aviones al Despegue\n" + "Total de aviones creados:" + pDato);
    }

    public void Agregar_Solo_Despegue(int pDato) {
        for (int i = 0; i < pDato; i++) {
            vDespegue.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se agregaron "+pDato+" al Despegue");

    }

    public void Agregar_Solo_Hangar(int pDato) {
        for (int i = 0; i < pDato; i++) {
            vHangar.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se agregaron "+pDato+" al Hangar");
    }

    public void Agregar_Solo_Vuelo(int pDato) {
        for (int i = 0; i < pDato; i++) {
            vVuelo.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se agregaron "+pDato+" al Vuelo");

    }

    public void Agregar_Solo_Aterrizaje(int pDato) {
        for (int i = 0; i < pDato; i++) {
            vAterrizaje.AgregarAlFinal(vAvion.getModeloAvion(), vAvion.getPasajeros(), vAvion.getSobrecargos(), vAvion.getNombrePiloto());

        }
        JOptionPane.showMessageDialog(null, "Se agregaron "+pDato+" al Aterrizaje");

    }

}
