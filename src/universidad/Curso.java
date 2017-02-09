/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author Administrador
 */
public class Curso {
    private int nrc;
    private Profesor profesor;
    private Estudiante estudiantes;
    public Curso(int nrc) {
        this.nrc = nrc;
    }

    public int getNrc() {
        return nrc;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    public Estudiante getEstudiante() {
        return estudiantes;
    }
    public void setEstudiante(Estudiante estudiantes) {
        if (this.estudiantes == null) {
            this.estudiantes = estudiantes;
        }
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null){
            this.profesor = profesor;
        }
    }
    
    
    
}
