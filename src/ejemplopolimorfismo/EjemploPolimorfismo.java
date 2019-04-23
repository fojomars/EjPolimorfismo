/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author fojomars
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa p = new Persoa("pepe",1500);
        Persoa dep = new Deportista("tenis", "juan", 20000);
        Persoa profe = new Profesor("dam", "nina", 1500);
        
       
        
        ArrayList<Persoa>l = new ArrayList();
        l.add(p);
        l.add(dep);
        l.add(profe);
        
        Metodos.amosar(l);

        System.out.println("Persoa: " + p.calcularSoldo());
        System.out.println("Deportista: " + dep.calcularSoldo());
        System.out.println("Profesor: " + profe.calcularSoldo());
        
        p = dep;
        dep =(Deportista) p;
        System.out.println(dep);
        
        
        
        
    }
    
}
