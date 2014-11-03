/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

/**
 * Clase que se usa como estructura de datos para cada proceso
 */
public class Proceso {
    
    int id, tiempo, tamano;
    
    public Proceso(int id, int tiempo, int tamano){
        this.id = id;
        this.tiempo = tiempo;
        this.tamano = tamano;
    }
    
}
