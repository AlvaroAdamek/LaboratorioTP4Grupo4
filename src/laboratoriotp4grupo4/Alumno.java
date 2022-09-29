
package laboratoriotp4grupo4;

import java.util.HashSet;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre, HashSet<Materia> materias) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = materias;
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
    
    
    
}
