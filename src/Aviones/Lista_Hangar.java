package Aviones;

import Aviones.Nodo_Hangar;
import javax.swing.JOptionPane;

public class Lista_Hangar {

    protected static Nodo_Hangar Inicio, Final;

    public Lista_Hangar() {

        Inicio = null;
        Final = null;

    }

    public boolean ListaVacia() {
        if (Inicio == null) {
            return true;

        } else {
            return false;

        }

    }

    public void AgregarNodoAlInicio(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto) {

        Nodo_Hangar vNuevo;
        if (Inicio == null) {
            vNuevo = new Nodo_Hangar(pModelo, pPasajeros, pSobrecargos, pPiloto, null);
            Inicio = vNuevo;
        } else {

            vNuevo = new Nodo_Hangar(pModelo, pPasajeros, pSobrecargos, pPiloto, Inicio);
            Inicio = vNuevo;
        }

    }

    public int totalPosiciones() {
        Nodo_Hangar recorrer = Inicio;
        int vCont = 0;

        while (recorrer != null) {

            recorrer = recorrer.siguiente;
            vCont += 1;
        }
        
        return vCont;
    }

    public String[] RellenarArray() {

        int vPosiciones = totalPosiciones();
        String[] vLista = new String[vPosiciones];
        String vLista1 = "";
        int vCont = 0;
        //String pLista = "";
        Nodo_Hangar recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = "Modelo: " + recorrer.vModelo + "  Cantidad de pasajero: " + recorrer.vPasajeros + "  Sobrecargos: " + recorrer.vSobrecargos + "  Nombre del piloto: " + recorrer.vPiloto;
            recorrer = recorrer.siguiente;
            vLista[vCont] = vLista1;
            vCont += 1;

        }

        return vLista;

    }

    public void AgregarAlFinal(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto) {
        Nodo_Hangar nuevo = new Nodo_Hangar(pModelo, pPasajeros, pSobrecargos, pPiloto);
        if (!ListaVacia()) {
            Final.siguiente = nuevo;
            Final = nuevo;
        } else {
            Final = Inicio = nuevo;

        }
    }

    public void Eliminar(Nodo_Hangar n) {
        if (n == Inicio) {
            Inicio = Inicio.siguiente;

        } else {
            Nodo_Hangar Anterior = Inicio;
            while (Anterior.siguiente != n) {
                Anterior = Anterior.siguiente;
            }
            if (n == Final) {

                Final = Anterior;
                Final.siguiente = null;

            } else {

                Anterior.siguiente = n.siguiente;

            }

        }

    }

    public void BuscarElimiar(String pModelo) {
        Nodo_Hangar recorrer = Inicio;

        while (recorrer != null && pModelo != recorrer.vModelo) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            Eliminar(recorrer);
        }

    }

}
