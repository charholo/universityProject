package org.universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroAlum = 0;
        int idS=0;
        int ageS=0;
        String nameS="";
        String lsNameS="";

        int numeroTeach = 0;
        int idT=0;
        String nameT="";
        String lsNameT="";
        double salaryT = 0;
        boolean isFullTime= false;



        //Crear Alumno y asociarlo a una Materia
        System.out.println("¿Cuantos Alumnos desea crear e Inscribir en el sistema?");
        numeroAlum = leer.nextInt();
        Student arrayStudent = new Student();

        for (int i = 1; i <= numeroAlum; i ++){

            System.out.println("Enter ID of student " + i);
            idS = leer.nextInt();
            System.out.println("Enter NAME of student "+ i);
            nameS = leer.next();
            System.out.println("Enter LASTNAME of student " + i);
            lsNameS = leer.next();
            System.out.println("Enter AGE of student" + i);
            ageS = leer.nextInt();

            arrayStudent.createStudent(new Student(idS, nameS, lsNameS, ageS));
        }

        System.out.println("Numero de elementos: " + arrayStudent.countStudent());

        //Busqueda variable Student

        Student eS = arrayStudent.seekStudentById(19);
        if (eS == null){
            System.out.println("Id doesn't exist");
        }else{
            System.out.println("Student found: " + eS);
        }

        /////////TEACHERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

        //Crear teacher y asociarlo a una Materia
        System.out.println("¿Cuantos Teacher desea crear e Inscribir en el sistema?");
        numeroTeach = leer.nextInt();
        Teacher arrayTeacher = new Teacher();

        for (int t = 1; t <= numeroTeach; t ++){

            System.out.println("Enter ID of teacher " + t);
            idT = leer.nextInt();
            System.out.println("Enter NAME of teacher "+ t);
            nameT = leer.next();
            System.out.println("Enter LASTNAME of teacher " + t);
            lsNameT = leer.next();
            System.out.println("Enter SALARY of teacher" + t);
            salaryT = leer.nextDouble();
            System.out.println("Enter iSFullTime of teacher" + t);
            isFullTime = leer.nextBoolean();

            arrayTeacher.createTeacher(new Teacher(idT, nameT, lsNameT, salaryT,isFullTime));
        }

        System.out.println("Numero de elementos: " + arrayTeacher.countTeacher());

        //Busqueda variable Teacher

        Teacher tE = arrayTeacher.seekTeacherById(20);
        if (tE == null){
            System.out.println("Id doesn't exist");
        }else{
            System.out.println("Teacher found: " + tE);
        }










    }

}
