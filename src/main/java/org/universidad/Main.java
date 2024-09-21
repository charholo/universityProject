package org.universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroAlum;
        int idS;
        int ageS;
        int opt;
        int studentId;
        int teacherId;
        int subjectId;
        String nameS;
        String lsNameS;

        int numeroTeach;
        int idT;
        String nameT;
        String lsNameT;
        double salaryT;
        boolean isFullTime;

        int numeroSubj;
        int idSj;
        String nameSj;
        String classRoom;

        Student arrayStudent = new Student();
        Teacher arrayTeacher = new Teacher();
        Subject arraySubject = new Subject();

        /////
        do{
            //Student arrayStudent = new Student();
            System.out.println("\n");
            System.out.println("**** Wellcome to the University **** \n");
            System.out.println("1: Create a new student and add it to an existing class");
            System.out.println("2: Create a new Teacher and add it to an existing class");
            System.out.println("3: Create a new class and add an existing teacher ");
            System.out.println("4: Print all the professors with its data");
            System.out.println("5: Print all the classes and a submenu ");
            System.out.println("6: Seek Student by ID");
            System.out.println("7: Seek Teacher by ID");
            System.out.println("8: Seek Subject by ID");
            System.out.println("9: Exit");
            System.out.print("To continue select any option: ");
            opt = leer.nextInt();


            switch (opt) {

                case 1:
                    System.out.println("Opcion 1");
                    //Crear Alumno y asociarlo a una Materia
                    System.out.println("¿Cuantos Alumnos desea crear e Inscribir en el sistema?");
                    numeroAlum = leer.nextInt();


                    for (int i = 1; i <= numeroAlum; i ++){

                        System.out.println("\n");
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

                    System.out.println(+ arrayStudent.countStudent() + " Students added successfully");

                    //System.out.println("Numero de elementos: " + arrayStudent.countStudent());

                    //Busqueda variable Student
                    /*
                    Student eS = arrayStudent.seekStudentById(19);
                    if (eS == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Student found: " + eS);
                    }
                    */
                    break;

                case 2:
                    System.out.println("Opcion 2");


                    /////////TEACHERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

                    //Crear teacher y asociarlo a una Materia
                    System.out.println("¿Cuantos Teacher desea crear e Inscribir en el sistema?");
                    numeroTeach = leer.nextInt();


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




                    break;

                case 3:
                    System.out.println("Opcion 3");

                    /////////Subject

                    //Crear subajed
                    System.out.println("¿Cuantas Subjects desea crear e Inscribir en el sistema?");
                    numeroSubj = leer.nextInt();


                    for (int sj = 1; sj <= numeroSubj; sj ++){

                        System.out.println("Enter ID of Subject " + sj);
                        idSj = leer.nextInt();
                        System.out.println("Enter NAME of Subject "+ sj);
                        nameSj = leer.next();
                        System.out.println("Enter ClassRoom of teacher " + sj);
                        classRoom = leer.next();
                        arraySubject.createSubject(new Subject(idSj, nameSj, classRoom));
                    }

                    System.out.println("Numero de elementos: " + arraySubject.countSubject());



                    break;

                case 4:
                    System.out.println("Opcion 4");
                    System.out.println("Numero de elementos: " + arrayStudent.countStudent());
                    break;

                case 5:
                    System.out.println("Opcion 5");
                    System.out.println("Seek Alumno ID de alumno");
                    studentId = leer.nextInt();
                    Student eS = arrayStudent.seekStudentById(studentId);
                    if (eS == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Student found: " + eS);
                    }

                    break;

                case 6:
                    System.out.println("Opcion 6");

                    break;

                case 7:
                    //Busqueda variable Teacher

                    System.out.println("Seek Teacher ID");
                    teacherId = leer.nextInt();
                    Teacher tE = arrayTeacher.seekTeacherById(teacherId);
                    if (tE == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Teacher found: " + tE);
                    }
                    break;

                case 8:
                    //Busqueda variable Subject

                    System.out.println("Seek Subject ID");
                    subjectId = leer.nextInt();
                    Subject sJ = arraySubject.seekSubjectById(subjectId);
                    if (sJ == null){
                        System.out.println("Id doesn't exist");
                    }else{
                        System.out.println("Subject  found: " + sJ);
                    }
                    break;



                case 9:
                    System.out.println("Ejecucion terminada....");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Opcion no disponible:/");
                    System.out.println("¿Desea volver al menu?");
                    System.out.println("0 = si o 7 = no");
                    opt = leer.nextInt();
                    break;
            }

        }while(opt!=9);//fin while


////////










    }

}
