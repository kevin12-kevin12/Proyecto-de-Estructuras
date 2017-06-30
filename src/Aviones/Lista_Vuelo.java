package Aviones;

import Aviones.Nodo_Vuelo;

public class Lista_Vuelo {

    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();

    protected static Nodo_Vuelo Inicio, Final;

    public Lista_Vuelo() {

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

        Nodo_Vuelo vNuevo;
        if (Inicio == null) {
            vNuevo = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto, null);
            Inicio = vNuevo;
        } else {

            vNuevo = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto, Inicio);
            Inicio = vNuevo;
        }

    }

    public int totalPosiciones() {
        Nodo_Vuelo recorrer = Inicio;
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
        Nodo_Vuelo recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = recorrer.vPiloto + " <-- Nombre del piloto " + "Modelo: " + recorrer.vModelo + "  Cantidad de pasajero: " + recorrer.vPasajeros + "  Sobrecargos: " + recorrer.vSobrecargos;
            recorrer = recorrer.siguiente;
            vLista[vCont] = vLista1;
            vCont += 1;

        }

        return vLista;

    }

    public void AgregarAlFinal(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto) {
        Nodo_Vuelo nuevo = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto);
        if (!ListaVacia()) {
            Final.siguiente = nuevo;
            Final = nuevo;
        } else {
            Final = Inicio = nuevo;

        }
    }

    public void Eliminar(Nodo_Vuelo n) {
        if (n == Inicio) {
            Inicio = Inicio.siguiente;

        } else {
            Nodo_Vuelo Anterior = Inicio;
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

    public void BuscarElimiar(int pIndice) {
        Nodo_Vuelo recorrer = Inicio;
        int vTamanoNodos = totalPosiciones();

        while (recorrer != null && pIndice != vTamanoNodos) {
            recorrer = recorrer.siguiente;
        }

        if (recorrer != null) {

            vAterrizaje.AgregarAlFinal(recorrer.vModelo, recorrer.vPasajeros, recorrer.vSobrecargos, recorrer.vPiloto);
            Eliminar(recorrer);
        }

    }

}
