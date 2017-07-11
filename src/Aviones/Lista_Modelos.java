package Aviones;

public class Lista_Modelos {

    protected static NodoModelos Inicio, Final;

    public boolean Vacia() {
        if (Inicio == null) {
            return true;

        } else {
            return false;

        }
    }

    public void AgregarAlFinal(String pModelo) {
        NodoModelos nuevo = new NodoModelos(pModelo);
        if (!Vacia()) {
            Final.siguiente = nuevo;
            Final = nuevo;
        } else {
            Final = Inicio = nuevo;

        }
    }

    public int Posiciones() {
        int vCont = 0;
        NodoModelos recorrer = Inicio;
        while (recorrer != null) {

            recorrer = recorrer.siguiente;
            vCont = vCont + 1;
        }

        return vCont;
    }

    public String[] ModelosAviones() {

        int vPosiciones = Posiciones();
        String[] vLista = new String[vPosiciones];
        String vModelo = "";
        int vCont = 0;

        NodoModelos recorrer = Inicio;
        while (recorrer != null) {
            vModelo = recorrer.vModelo;
            vLista[vCont] = vModelo;
            recorrer = recorrer.siguiente;
            vCont = vCont + 1;

        }
        return vLista;
    }

    public void Agregar_modelo_Igualando(String pModelo) {

        String[] vLista = ModelosAviones();
        for (int i = 0; i < vLista.length; i++) {

            if (pModelo != vLista[i]) {
                
                AgregarAlFinal(pModelo);

            }

        }

    }
}
