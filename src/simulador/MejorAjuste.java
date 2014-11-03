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
public class MejorAjuste extends PrimerAjuste{

    public MejorAjuste(int memoria) {
        super(memoria);
    }

    @Override
    public void Buscar() {
        Proceso posicion_esperada = top.getFirst();
        int menor = 0;
        for (Proceso actual : top)
            if(actual.id == 0 && aux.tamano <= actual.tamano && actual.tamano < menor){
                posicion_esperada = actual;
                menor = actual.tamano;
            }
        top.get(top.indexOf(posicion_esperada)).tamano -= posicion_esperada.tamano;
        top.add(top.indexOf(posicion_esperada), aux);
    }

    
    
}
