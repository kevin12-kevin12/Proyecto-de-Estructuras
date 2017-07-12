package Metodos_Funciones;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Aviones_Creacion {

    Random vRandom = new Random();

    public String getNombrePiloto() {
        int vPosicion = 0;
        int vNombre = 0;

        String[] vListaPilotos = {
            "Adolfo", "Sofía", "Camila", "Valentina", "Isabella", "Valeria", "Daniela", "Mariana", "Sara", "Victoria", "Gabriela", "Ximena",
            "Andrea", "Natalia", "Mía", "Martina", "Lucía", "Samantha", "María", "María Fernanda", "Nicole", "Alejandra", "Paula", "Emily", "María José", "Fernanda", "Luciana", "Ana Sofía",
            "Melanie", "Regina", "Catalina", "Ashley", "Renata", "Agustina", "Abril", "Emma", "Emilia", "Jazmín", "Juanita", "Briana", "Vanessa", "Antonia", "Laura", "Antonella", "Luna", "Carla",
            "Allison", "Monserrat", "Paulin", "Isabel", "Juliana", "Valerie", "Florencia", "Adriana", "Naomí", "Amanda", "Ariana", "Morena", "Natalie", "Constanza", "Lola", "Zoe",
            "Carolina", "Micaela", "Julia", "Claudia", "Paola", "Alexa", "Elena", "Isidora", "Rebeca", "Josefina", "Abigail", "Julieta", "Melissa", "Michelle", "Alba", "María Camila", "Angela", "Delfina", "Aitana",
            "Stephanie", "Fátima", "Manuela", "Alexandra", "Paloma", "Candela", "Clara", "Laura Sofía", "Diana", "Ana María", "Guadalupe", "Bárbara", "Bianca", "Miranda", "Sabrina", "Pilar", "Ana María", "Marta", "Ana",
            "Génesis", "Santiago", "Sebastián", "Diego", "Nicolás", "Samuel", "Alejandro", "Daniel", "Mateo", "Ángel"
        };
        vPosicion = vListaPilotos.length - 1;
        vNombre = vRandom.nextInt(vPosicion);

        return vListaPilotos[vNombre];
    }

    public String getModeloAvion() {
        int vPosicion = 0;
        int vNombre = 0;
        String[] vLista = {
            "Boeing 747", "Boeing 777", "Airbus A340", "Boeing 767", "Airbus A330", "Boeing 757", "Boeing 737", "McDonnell Douglas MD-80", "Embraer 170"
        };
        vPosicion = vLista.length - 1;
        vNombre = vRandom.nextInt(vPosicion);

        return vLista[vNombre];
    }

    public String[] getModelosComboBox() {

        String[] vLista = {
            "Modelos Existentes","Boeing 747", "Boeing 777", "Airbus A340", "Boeing 767", "Airbus A330", "Boeing 757", "Boeing 737", "McDonnell Douglas MD-80", "Embraer 170"
        };

        return vLista;
    }

    public int getSobrecargos() {
        int vCargos = 0;
        vCargos = 100 + vRandom.nextInt(200);
        return vCargos;
    }

    public int getPasajeros() {
        int vPasajeros = 0;
        vPasajeros = 150 + vRandom.nextInt(300);
        return vPasajeros;
    }

}
