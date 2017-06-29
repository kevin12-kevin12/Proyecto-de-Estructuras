/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_Funciones;

/**
 *
 * @author Kevin
 */
public class Metodo_Ordenamiento_Burbuja {

    public void MetodoBusbujaString(String[] pArreglo) {

        String aux;
        for (int i = 1; i <= pArreglo.length; i++) {
            for (int j = 0; j < pArreglo.length - i; j++) {
                if (pArreglo[j].compareTo(pArreglo[j + 1]) > 0) {
                    aux = pArreglo[j];
                    pArreglo[j] = pArreglo[j + 1];
                    pArreglo[j + 1] = aux;
                }
            }
        }
    }

}
