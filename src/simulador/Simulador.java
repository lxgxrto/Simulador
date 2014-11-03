/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulador;
import java.util.Scanner;
/**
 *
 * @author Biblias
 */
public class Simulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ajuste ajuste = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de ajuste: ");
        System.out.println("  1) Primer Ajuste\n  2) Mejor Ajuste\n  3) Peor Ajuste\n");
        int op = sc.nextInt();
        System.out.println("Tamaño de la memoria: ");
        int memoria = sc.nextInt();
        if (op == 1) {
            ajuste = new PrimerAjuste(memoria);
        }else if(op == 2){
            ajuste = new MejorAjuste(memoria);
        }
        System.out.println("Tiempo de Ejecucion: ");
        int tiempo = sc.nextInt();
        for (int i = 0; i < tiempo; i++) {
            ajuste.GeneraProceso(tiempo, memoria/2);
            ajuste.Buscar();
            ajuste.Disminuir();
            ajuste.Condensar();
        }
    }
    
}
