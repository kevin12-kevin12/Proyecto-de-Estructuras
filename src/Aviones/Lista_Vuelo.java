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
        
        if (Inicio == null) {
            Inicio = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto, Inicio, null);
            Inicio.siguiente.anterior = Inicio;
        } else {
            
            Inicio = Final = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto);
        }
        
    }

//     public void AgregarAlInicio(int pElemento) {
//        if (!listaVacia()) {
//
//            Inicio = new Nodo_doble(pElemento, Inicio, null);
//            Inicio.siguiente.anterior = Inicio;
//        } else {
//
//            Inicio = Fin = new Nodo_doble(pElemento);
//
//        }
//    }
    public int totalPosiciones() {
        Nodo_Vuelo recorrer = Inicio;
        int vCont = 0;
        
        while (recorrer != null) {
            
            recorrer = recorrer.siguiente;
            vCont += 1;
        }
        
        return vCont;
    }
    
    public void OrdenarNodos() {
        
        String vModelo;
        int vPasajeros;
        int vSobrecargos;
        String vPiloto;
        char aux1;
        char aux2;
        
        for (Nodo_Vuelo i = Inicio; i != null; i = i.siguiente) {
            for (Nodo_Vuelo j = Inicio.siguiente; j != null; j = j.siguiente) {
                
                aux1 = j.anterior.vPiloto.charAt(0);
                aux2 = j.vPiloto.charAt(0);
                if (aux1 > aux2) {
                    
                    vModelo = j.anterior.vModelo;
                    vPasajeros = j.anterior.vPasajeros;
                    vPiloto = j.anterior.vPiloto;
                    vSobrecargos = j.anterior.vSobrecargos;
                    j.anterior.vModelo = j.vModelo;
                    j.anterior.vPasajeros = j.vPasajeros;
                    j.anterior.vPiloto = j.vPiloto;
                    j.anterior.vSobrecargos = j.vSobrecargos;
                    j.vModelo = vModelo;
                    j.vPasajeros = vPasajeros;
                    j.vPiloto = vPiloto;
                    j.vSobrecargos = vSobrecargos;
                }
                
            }
            
        }
        
    }
    
    public String[] RellenarArray() {
        
        OrdenarNodos();
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
        Nodo_Vuelo nuevo = new Nodo_Vuelo(pModelo, pPasajeros, pSobrecargos, pPiloto, null, Final);
        if (!ListaVacia()) {
            Final = nuevo;
            Final.anterior.siguiente = nuevo;
        } else {
            Inicio = Final = nuevo;
            
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
        vAterrizaje.AgregarAlFinal(recorrer.vModelo, recorrer.vPasajeros, recorrer.vSobrecargos, recorrer.vPiloto);
        if (recorrer != null) {
            
            Eliminar(recorrer);
        }
        
    }
    
}
