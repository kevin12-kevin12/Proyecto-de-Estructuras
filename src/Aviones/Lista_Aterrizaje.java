package Aviones;

import Aviones.Nodo_Aterrizaje;

public class Lista_Aterrizaje {

    protected static Nodo_Aterrizaje Inicio, Final;

    public Lista_Aterrizaje() {

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

        Nodo_Aterrizaje vNuevo;
        if (Inicio == null) {
            vNuevo = new Nodo_Aterrizaje(pModelo, pPasajeros, pSobrecargos, pPiloto, null);
            Inicio = vNuevo;
        } else {

            vNuevo = new Nodo_Aterrizaje(pModelo, pPasajeros, pSobrecargos, pPiloto, Inicio);
            Inicio = vNuevo;
        }

    }

    public int totalPosiciones() {
        Nodo_Aterrizaje recorrer = Inicio;
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
        Nodo_Aterrizaje recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = "Modelo: " + recorrer.vModelo + "  Cantidad de pasajero: " + recorrer.vPasajeros + "  Sobrecargos: " + recorrer.vSobrecargos + "  Nombre del piloto: " + recorrer.vPiloto;
            recorrer = recorrer.siguiente;
            vLista[vCont] = vLista1;
            vCont += 1;

        }

        return vLista;

    }

    public void AgregarAlFinal(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto) {
        Nodo_Aterrizaje nuevo = new Nodo_Aterrizaje(pModelo, pPasajeros, pSobrecargos, pPiloto);
        if (!ListaVacia()) {
            Final.siguiente = nuevo;
            Final = nuevo;
        } else {
            Final = Inicio = nuevo;

        }
    }

    public void Eliminar(Nodo_Aterrizaje n) {
        if (n == Inicio) {
            Inicio = Inicio.siguiente;

        } else {
            Nodo_Aterrizaje Anterior = Inicio;
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
        Nodo_Aterrizaje recorrer = Inicio;

        while (recorrer != null && pModelo != recorrer.vModelo) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            Eliminar(recorrer);
        }
    }

    public String[] Arreglo_validar() {

        int vPosiciones = totalPosiciones();
        String[] vLista = new String[vPosiciones];
        String vLista1 = "";
        int vCont = 0;
        Nodo_Aterrizaje recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = recorrer.vModelo + recorrer.vPasajeros + recorrer.vSobrecargos + recorrer.vPiloto;
            recorrer = recorrer.siguiente;
            vLista[vCont] = vLista1;
            vCont += 1;

        }

        return vLista;
    }

}
