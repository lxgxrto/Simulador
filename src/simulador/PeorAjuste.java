/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;

/**
 *
 * @author bibliasone
 */
public class PeorAjuste extends PrimerAjuste{

    public PeorAjuste(int memoria) {
        super(memoria);
    }
    
    @Override
    public void Buscar(){
        Proceso posicion_esperada = top.getFirst();
        int mayor = 0;
        for (Proceso actual : top)
            if(actual.id == 0 && aux.tamano <= actual.tamano && actual.tamano < mayor){
                posicion_esperada = actual;
                mayor = actual.tamano;
            }
        top.get(top.indexOf(posicion_esperada)).tamano -= posicion_esperada.tamano;
        top.add(top.indexOf(posicion_esperada), aux);
    }
    
}
