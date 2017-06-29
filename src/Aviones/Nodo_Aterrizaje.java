package Aviones;

public class Nodo_Aterrizaje {

    String vModelo;
    int vPasajeros;
   
    int vSobrecargos;
    String vPiloto;

    Nodo_Aterrizaje siguiente;

    
    
    public  Nodo_Aterrizaje(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto){
   
       this.vModelo=pModelo;
       this.vPasajeros=pPasajeros;
       this.vSobrecargos=pSobrecargos;
       this.vPiloto=pPiloto;
       this.siguiente=null;
   }
    public Nodo_Aterrizaje(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto, Nodo_Aterrizaje n) {
        vModelo = pModelo;
        vPasajeros=pPasajeros;
        vSobrecargos=pSobrecargos;
        vPiloto=pPiloto;
        siguiente = n;

    }
}
