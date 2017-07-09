package Aviones;

import Aviones.Nodo_Hangar;
import javax.swing.JOptionPane;

public class Lista_Hangar {

    Lista_Despegue vDespegue = new Lista_Despegue();

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
        Nodo_Hangar recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = vCont + 1 + "." + "Modelo: " + recorrer.vModelo + "  Cantidad de pasajero: " + recorrer.vPasajeros + "  Sobrecargos: " + recorrer.vSobrecargos + "  Nombre del piloto: " + recorrer.vPiloto;
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

    public String[] Arreglo_validar() {

        int vPosiciones = totalPosiciones();
        String[] vLista = new String[vPosiciones];
        String vLista1 = "";
        int vCont = 0;
        Nodo_Hangar recorrer = Inicio;

        while (recorrer != null) {

            vLista1 = recorrer.vModelo + recorrer.vPasajeros + recorrer.vSobrecargos + recorrer.vPiloto;
            recorrer = recorrer.siguiente;
            vLista[vCont] = vLista1;
            vCont += 1;

        }

        return vLista;
    }

    public boolean Igualador(String pAvion) {

        String vAvion = pAvion;
        System.out.println(vAvion);
        boolean vBandera = false;
        String[] vLista = Arreglo_validar();

        for (int i = 0; i < vLista.length; i++) {

            if (vLista[i].equals(vAvion)) {

                System.out.println(vLista[i]);
                vBandera = true;
            }
        }

        return vBandera;
    }

    public String TrasladarADespegue() {
        Nodo_Hangar vRecorrer = Inicio;

        while (vRecorrer.siguiente == Final) {

            vRecorrer = vRecorrer.siguiente;
        }

        String vAvion = "Modelo: " + Final.vModelo + "  Cantidad de pasajero: " + Final.vPasajeros + "  Sobrecargos: " + Final.vSobrecargos + "  Nombre del piloto: " + Final.vPiloto;

        vDespegue.AgregarAlFinal(Final.vModelo, Final.vPasajeros, Final.vSobrecargos, Final.vPiloto);
        Eliminar(Final);
        return vAvion;
    }

}
