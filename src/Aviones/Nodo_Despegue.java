package Aviones;

public class Nodo_Despegue {

    String vModelo;
    int vPasajeros;
   
    int vSobrecargos;
    String vPiloto;

    Nodo_Despegue siguiente;

    
    
    public  Nodo_Despegue(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto){
   
       this.vModelo=pModelo;
       this.vPasajeros=pPasajeros;
       this.vSobrecargos=pSobrecargos;
       this.vPiloto=pPiloto;
       this.siguiente=null;
   }
    public Nodo_Despegue(String pModelo,int pPasajeros,int pSobrecargos,String pPiloto, Nodo_Despegue n) {
        vModelo = pModelo;
        vPasajeros=pPasajeros;
        vSobrecargos=pSobrecargos;
        vPiloto=pPiloto;
        siguiente = n;

    }
}
