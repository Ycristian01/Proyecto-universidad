/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Estudiante {
int id;
String Nombre;  
 ArrayList<Curso> cursos;
 public Estudiante (int id) {
     this.id = id;
     cursos = new ArrayList();
 }

 
 public boolean AgregarCurso(Curso curso) {
     if (cursos.size()>10) {
         cursos.add(curso);
         return true;
         
     }
     return false;
 }
}
