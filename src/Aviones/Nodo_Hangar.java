package Aviones;

public class Nodo_Hangar {

    String vModelo;
    int vPasajeros;
   
    int vSobrecargos;
    String vPiloto;

    Nodo_Hangar siguiente;

    
    
    public  Nodo_Hangar(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto){
   
       this.vModelo=pModelo;
       this.vPasajeros=pPasajeros;
       this.vSobrecargos=pSobrecargos;
       this.vPiloto=pPiloto;
       this.siguiente=null;
   }
    public Nodo_Hangar(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto, Nodo_Hangar n) {
        vModelo = pModelo;
        vPasajeros=pPasajeros;
        vSobrecargos=pSobrecargos;
        vPiloto=pPiloto;
        siguiente = n;

    }
}
