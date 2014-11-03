/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

import java.util.LinkedList;
import java.util.Random;
/**
 * Clase que se encarga de Realizar la colocacion de procesos en
 * forma de primer ajuste
 * @author Biblias
 */
public class PrimerAjuste implements Ajuste{
    LinkedList<Proceso> top = new LinkedList();
    Proceso aux;
    Random rand;    
    public PrimerAjuste(int memoria){
        rand = new Random();
        top.add(new Proceso(0, 0, memoria));
    }    

    @Override
    public void GeneraProceso(int t,int mem) {
        aux = new Proceso(rand.nextInt(10000)+1, rand.nextInt(t)+1, rand.nextInt(mem)+1);
    }

    @Override
    public void Buscar() {
        int cont = 0;
        for (Proceso top1 : top) {
            if (top1.id == 0 && aux.tamano <= top1.tamano) {
                if(aux.tamano == top1.tamano){
                    top1.id = aux.id;
                    top1.tamano = aux.tamano;
                    top1.tiempo = aux.tiempo;
                }else{
                    top1.tamano -= aux.tamano;
                    top.add(cont, aux);
                }
                Informe();
                return;
            }
            cont++;
        }
    }
    
    @Override
    public void Condensar() {
        for (int i = 1 ; top.size() > 2 && i < top.size() ; i++) {
            if(top.get(i).id == 0 && top.get(i-1).id == 0){
                top.get(i-1).tamano += top.get(i).tamano;
                top.remove(i);
            }
        }
    }
    @Override
    public void Disminuir(){
        for (Proceso proceso : top) {
            if (proceso.tiempo > 0) 
                proceso.tiempo--;
            if(proceso.tiempo == 0)
                proceso.id = 0;
        }
    }
    
    public void Informe(){
        for (Proceso a : top) 
            System.out.print("["+a.id+","+a.tiempo+","+a.tamano+"],");    
        System.out.println("");
    }
}
