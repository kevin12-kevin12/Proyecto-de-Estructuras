package Aviones;

public class Nodo_Vuelo {

    String vModelo;
    int vPasajeros;
   
    int vSobrecargos;
    String vPiloto;

    Nodo_Vuelo siguiente;

    
    
    public  Nodo_Vuelo(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto){
   
       this.vModelo=pModelo;
       this.vPasajeros=pPasajeros;
       this.vSobrecargos=pSobrecargos;
       this.vPiloto=pPiloto;
       this.siguiente=null;
   }
    public Nodo_Vuelo(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto, Nodo_Vuelo n) {
        vModelo = pModelo;
        vPasajeros=pPasajeros;
        vSobrecargos=pSobrecargos;
        vPiloto=pPiloto;
        siguiente = n;

    }
}
