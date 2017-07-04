package Aviones;

public class Nodo_Vuelo {

    String vModelo;
    int vPasajeros;

    int vSobrecargos;
    String vPiloto;

    Nodo_Vuelo siguiente;
    Nodo_Vuelo anterior;

    public Nodo_Vuelo(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto) {

        this.vModelo = pModelo;
        this.vPasajeros = pPasajeros;
        this.vSobrecargos = pSobrecargos;
        this.vPiloto = pPiloto;
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo_Vuelo(String pModelo, int pPasajeros, int pSobrecargos, String pPiloto, Nodo_Vuelo s, Nodo_Vuelo a) {
        vModelo = pModelo;
        vPasajeros = pPasajeros;
        vSobrecargos = pSobrecargos;
        vPiloto = pPiloto;
        siguiente = s;
        anterior = a;

    }
}
