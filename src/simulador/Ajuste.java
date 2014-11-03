/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

/**
 *
 * @author Biblias
 */
public interface Ajuste {
    /**
     * Realiza una busqueda para colocar el proceso
     */
    void Buscar();
    /**
     * Genera un nuevo proceso que se inializa con tres parametros
     * El 'id' que es un numero aleatorio dado por el sistema, el 'tiempo'
     * y la 'memoria'
     * @param t tiempo total de ejecucion
     * @param mem memoria total
     */
    void GeneraProceso(int t,int mem);
    /**
     * Funcion que se encarga de condensar la memoria adyacente
     * libre dentro de la memoria 
     */
    void Condensar();
    /** 
     * Funcion encargarda de disminuir el tiempo de cada proceso
     * que esta dentro de la memoria en una unidad y a su vez deja en ceros
     * las variables del proceso una vez que el tiempo es cero para 
     * posteriormente poder condensar los huecos de memoria 
     */
    void Disminuir();
}
