/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Universidad {

    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;
    ArrayList<Estudiante> estudiantes;
    
    public Universidad(){
      cursos = new ArrayList<>();  
      profesores = new ArrayList<>();
      estudiantes = new ArrayList<>();
    }
    
    public void agregarProfesor(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Escriba código del profesor");
        int cod = sc.nextInt();
        Profesor p1 = new Profesor(cod);
        profesores.add(p1);
    }
    
    public void agregarCurso(){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Escriba nrc del curso");
        int nrc = sc.nextInt();
        Curso c = new Curso(nrc);
        cursos.add(c);
    }
    
    public void agregarEstudiante() {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Escriba id del estudiante");
        int id = sc.nextInt();
      Estudiante e1 = new Estudiante(id);
      estudiantes.add(e1);
    }
    public void registrarProfesorCurso(Profesor p, Curso c){
       p.cursos.add(c);
       c.setProfesor(p);
    }
    public void registrarEstudianteCurso (Estudiante e, Curso c) {
        e.cursos.add(c);
        c.setEstudiante(e);
    }
    
    
    
    
    
    public static void main(String[] args) {
      int sw=0;
       Scanner sc = new Scanner(System.in);
       
            System.out.println("1 para agregar profesor");
             System.out.println("2 para agregar estudiante");
            System.out.println("3 para agregar curso");         
            System.out.println("4 para asignar profesor a curso");
            System.out.println("5 para asignar estudiante a curso");
            System.out.println("6 Cuantos cursos tiene cada profesor");
            System.out.println("7 Cuantos cursos tiene cada estudiante");
            System.out.println("8 Salir");
      switch (sw)   {
          
      }
    }
    
}
