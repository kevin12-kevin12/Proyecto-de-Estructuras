/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones_Botones;

import Aviones.*;
import Metodos_Funciones.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import Ventana.*;


public class Manejador_1 implements ActionListener {

    private Ventana2 Frame;

    Lista_Despegue vDespegue = new Lista_Despegue();
    Lista_Hangar vHangar = new Lista_Hangar();
    Lista_Aterrizaje vAterrizaje = new Lista_Aterrizaje();
    Lista_Vuelo vVuelo = new Lista_Vuelo();
    Lista_Modelos vModelos = new Lista_Modelos();
    Aviones_Creacion vMetodo = new Aviones_Creacion();
    CrearAvionesRandom vAvionesRandom = new CrearAvionesRandom();
   

    public Manejador_1(Ventana2 Frame) {
        this.Frame = Frame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Frame.vBoton_AgregarAvion_especifico)) {
            Frame.vPanel_Especifico.setVisible(true);
            Frame.Agregar_Avion.setVisible(false);
            Frame.vBoton_AgregarAvion_especifico.setVisible(false);
        }

        
        if (e.getSource().equals(Frame.Despegue_Vuelo)) {

            int vIn = Frame.lista_aviones.getFirstVisibleIndex();

            if (vIn >= 0) {
                int vPsajeros = vDespegue.Obtener_Pasajero();
                int vSobrecargos = vDespegue.Obtener_Sobrecargos();
                String vPiloto = vDespegue.Obtener_Piloto();
                String vAvion = vDespegue.EliminarAlInicio();
                vVuelo.AgregarAlFinal(vAvion, vPsajeros, vSobrecargos, vPiloto);
            } else {
                JOptionPane.showMessageDialog(null, "La lista de Despegue esta vacia", "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);

            }

            
        }
        if (e.getSource().equals(Frame.vAterrizaje_Hangar)) {

            
             int vIn = Frame.lista_aviones.getFirstVisibleIndex();

            if (vIn >= 0) {
                int vPsajeros = vAterrizaje.Obtener_Pasajero();
                int vSobrecargos = vAterrizaje.Obtener_Sobrecargos();
                String vPiloto = vAterrizaje.Obtener_Piloto();
                String vAvion = vAterrizaje.EliminarAlInicio();
                vHangar.AgregarAlFinal(vAvion, vPsajeros, vSobrecargos, vPiloto);
            } else {
                JOptionPane.showMessageDialog(null, "La lista de Aterrizaje esta vacia", "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);

            }
            
            
           
        }
        if (e.getSource().equals(Frame.Agregar_Avion)) {

            Frame.ComboModeloAviones.removeAll();
            String[] vList = vModelos.ModelosAviones();
            for (int i = 0; i < vList.length; i++) {

                Frame.ComboModeloAviones.addItem(vList[i]);

            }
            Frame.Agregar_Avion.setVisible(false);
            Frame.Hangar_Despegue.setVisible(false);
            Frame.vVuelo_Aterrizaje.setVisible(false);
            Frame.vBoton_AgregarAvion_especifico.setVisible(false);
            Frame.Panel_Agregar_Aviones.setVisible(true);

        }
        if (e.getSource().equals(Frame.Hangar_Despegue)) {
            int vIn = Frame.lista_aviones.getFirstVisibleIndex();

            if (vIn >= 0) {
                String vA = vHangar.TrasladarADespegue();
            } else {
                JOptionPane.showMessageDialog(null, "La lista de hangar esta vacia", "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);

            }

        }

        if (e.getSource().equals(Frame.vVuelo_Aterrizaje)) {

            int vIndice = Frame.lista_aviones.getSelectedIndex();
            if (vIndice >= 0) {
                vVuelo.BuscarElimiar(vIndice);
            } else {

                JOptionPane.showMessageDialog(null, "Si quiere Trasladar un Avion seleccionelo de la lista");
            }
            System.out.println(vIndice);

        }
        if (e.getSource().equals(Frame.Ingresar)) {

            vAvionesRandom.AgregarAviones();
            Frame.Ingresar.setVisible(false);
            Frame.vBoton_AgregarAvion_especifico.setVisible(true);
            Frame.Agregar_Un_Avion.setVisible(true);

        }
        String itemSeleecionado = (String) Frame.vCombo.getSelectedItem();
        if ("Lista de Despegue".equals(itemSeleecionado)) {

            Frame.vModelo.removeAllElements();

            String[] vLista = vDespegue.RellenarArray();
            for (int i = 0; i < vLista.length; i++) {
                Frame.vModelo.addElement(vLista[i]);
            }

            Frame.Hangar_Despegue.setVisible(false);
            Frame.vVuelo_Aterrizaje.setVisible(false);
            Frame.vAterrizaje_Hangar.setVisible(false);
            Frame.Despegue_Vuelo.setVisible(true);

        } else if ("Lista de Hangar".equals(itemSeleecionado)) {

            Frame.vModelo.removeAllElements();
            String[] vLista = vHangar.RellenarArray();

            for (int i = vLista.length - 1; i >= 0; i--) {
                Frame.vModelo.addElement(vLista[i]);

            }
            Frame.Hangar_Despegue.setVisible(true);
            Frame.vVuelo_Aterrizaje.setVisible(false);
            Frame.vAterrizaje_Hangar.setVisible(false);
            Frame.Despegue_Vuelo.setVisible(false);

        } else if ("Lista de Vuelo".equals(itemSeleecionado)) {
            int vCont = 0;
            Frame.Hangar_Despegue.setVisible(false);
            Frame.vVuelo_Aterrizaje.setVisible(true);
            Frame.vAterrizaje_Hangar.setVisible(false);
            Frame.Despegue_Vuelo.setVisible(false);
            Frame.vModelo.removeAllElements();
            String[] vLista = vVuelo.RellenarArray();

            for (int i = 0; i < vLista.length; i++) {
                Frame.vModelo.addElement(vLista[i]);

            }

        } else if ("Lista de Aterrizaje".equals(itemSeleecionado)) {

            Frame.vModelo.removeAllElements();
////            Nodo_Aterrizaje vreccorer=vAterrizaje.I
            String[] vLista = vAterrizaje.RellenarArray();
            for (int i = 0; i < vLista.length; i++) {
                Frame.vModelo.addElement(vLista[i]);

            }
            Frame.Hangar_Despegue.setVisible(false);
            Frame.vVuelo_Aterrizaje.setVisible(false);
            Frame.vAterrizaje_Hangar.setVisible(true);
            Frame.Despegue_Vuelo.setVisible(false);

        }

    }

}
