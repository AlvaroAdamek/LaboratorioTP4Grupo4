/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioData;

import java.util.ArrayList;
import java.util.HashSet;
import laboratoriotp4grupo4.Materia;

/**
 *
 * @author canes
 */
public class MateriaData {
    private HashSet<Materia> materias= new HashSet();

    public MateriaData() {
    }

    public HashSet getMaterias() {
        return materias;
    }

    public void guardarMateria(Materia materias) {
        this.materias.add(materias);
    }


   public ArrayList<String> obtenerlista(){
       ArrayList <String> m= new ArrayList();
      
       for (Materia materia : materias) {
           m.add( materia.getNombre());    
           
       }
    
    return m;
}
}
