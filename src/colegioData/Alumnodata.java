/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioData;

import java.util.ArrayList;
import java.util.HashSet;
import laboratoriotp4grupo4.Alumno;
import laboratoriotp4grupo4.Materia;

/**
 *
 * @author canes
 */
public class Alumnodata {
        HashSet <Alumno> alumnos= new HashSet();

    public Alumnodata() {
    }

    public HashSet getalumnos() {
        return alumnos;
    }

    public void guardarAlumno(Alumno alumn) {
        this.alumnos.add(alumn);
    }
 public HashSet <Alumno> obtenerlista(){
       
    
    return alumnos;
}
}
