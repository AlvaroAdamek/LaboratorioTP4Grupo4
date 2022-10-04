
package laboratoriotp4grupo4;

import java.util.HashSet;
import javax.swing.JOptionPane;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias= new HashSet();

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
     public void AgregarMateria(Materia m){
         boolean x=true;
         for (Materia aux : materias) {
             if (m.getIdMateria() == aux.getIdMateria() ) {
                 JOptionPane.showMessageDialog(null,"ERROR - materia ya registrada");
                 x=false;
                 break;
                }
         }
         if (x) {
             materias.add(m);
             JOptionPane.showMessageDialog(null,"Materia "+ m.getNombre()+" agregada a "+ nombre);
         }
         
     }
     
     public int cantidadMaterias(){
         return materias.size();
     }

    @Override
    public String toString() {
        return  + legajo + " " + apellido + " " + nombre ;
    }
    
    
}
